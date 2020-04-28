package com.vnb.yanbin.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyService implements InvocationHandler {

	Object object = null;
	
	public ProxyService(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("proxy before...");
		Object ret = method.invoke(object, args);
		System.out.println("proxy after...");
		
		return ret;
	}
}
