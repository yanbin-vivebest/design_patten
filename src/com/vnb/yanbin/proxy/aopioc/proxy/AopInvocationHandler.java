package com.vnb.yanbin.proxy.aopioc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.vnb.yanbin.proxy.aopioc.aop.Aspect;

public class AopInvocationHandler implements InvocationHandler {

	private Object target;
	
	private Aspect aspect;
	
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public Aspect getAspect() {
		return aspect;
	}
	public void setAspect(Aspect aspect) {
		this.aspect = aspect;
	}

	public AopInvocationHandler(Object target, Aspect aspect) {
		super();
		this.target = target;
		this.aspect = aspect;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		if(method.getName().matches(this.aspect.getPointCut().getMethodPattern())) {
			return this.aspect.getAdvice().invoke(target, method, args);
		}
		
		//不需要代理，直接反射调用
		return method.invoke(target, args);
	}

}
