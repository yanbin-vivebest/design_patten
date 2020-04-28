package com.vnb.yanbin.proxy.aopioc.aop;

import java.lang.reflect.Method;

public interface Advice {

	//实现这个接口实现增强逻辑 前置 后置 环绕 异常处理
	public Object invoke(Object target, Method method, Object[] args) throws Throwable;
}
