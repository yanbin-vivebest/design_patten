package com.vnb.yanbin.proxy.aopioc.ioc;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import com.vnb.yanbin.proxy.aopioc.aop.Aspect;
import com.vnb.yanbin.proxy.aopioc.proxy.AopInvocationHandler;

public class IOCContainer {

	private Map<String ,Class<?> > beanDefinitionMap = new HashMap<String ,Class<?> >();
	
	private Aspect aspect;
	
	public Aspect getAspect() {
		return aspect;
	}

	public void setAspect(Aspect aspect) {
		this.aspect = aspect;
	}

	public void addBeanDefinition(String beanName,Class<?> beanClass) {
		this.beanDefinitionMap.put(beanName, beanClass);
	}
	
	public Object getBean(String beanName) throws Throwable {
		Object bean = createInstance(beanName);
		bean = proxyEnhance(bean);
		return bean;
	}

	private Object proxyEnhance(Object bean) {
		if(this.aspect != null && bean.getClass().getName().matches(this.aspect.getPointCut().getClassPattern())) {
			return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new AopInvocationHandler(bean, aspect));
		}
		return bean;
	}

	private Object createInstance(String beanName) throws Throwable {
		return this.beanDefinitionMap.get(beanName).newInstance();
	}
	
}
