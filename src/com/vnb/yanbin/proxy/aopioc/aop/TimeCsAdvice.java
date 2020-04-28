package com.vnb.yanbin.proxy.aopioc.aop;

import java.lang.reflect.Method;

public class TimeCsAdvice implements Advice {

	@Override
	public Object invoke(Object target, Method method, Object[] args) throws Throwable {
		System.out.println("proxy before...");
		Object ret = method.invoke(target, args);
		System.out.println("proxy after...");
		System.out.println("已被代理的对象:" + target.getClass().getName());
		return ret;
	}

}
