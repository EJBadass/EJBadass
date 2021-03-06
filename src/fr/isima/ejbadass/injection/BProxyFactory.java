package fr.isima.ejbadass.injection;

import java.lang.reflect.Proxy;

import fr.isima.ejbadass.plugable.BInvocationHandler;

public class BProxyFactory {

	public static Object get(Class<?> iface) throws IllegalArgumentException, Exception {
		Object instance = null;		
		
		if(BClassFinder.find(iface)!=null)
			instance = Proxy.newProxyInstance(iface.getClassLoader(), new Class<?>[] {iface}, new BInvocationHandler());

		return instance;
	}

}
