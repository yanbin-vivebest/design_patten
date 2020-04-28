package com.vnb.yanbin.proxy.aopioc.demo;

import com.vnb.yanbin.proxy.aopioc.aop.Advice;
import com.vnb.yanbin.proxy.aopioc.aop.Aspect;
import com.vnb.yanbin.proxy.aopioc.aop.PointCut;
import com.vnb.yanbin.proxy.aopioc.aop.TimeCsAdvice;
import com.vnb.yanbin.proxy.aopioc.ioc.IOCContainer;
import com.vnb.yanbin.proxy.aopioc.proxy.IService;
import com.vnb.yanbin.proxy.aopioc.proxy.TargetService;

public class Client {

	public static void main(String[] args) throws Throwable {
		
		Advice advice = new TimeCsAdvice();
		
		PointCut pointCut = new PointCut("com\\.vnb\\.yanbin\\.proxy\\.aopioc\\.proxy..*", ".*y");
		
		Aspect aspect = new Aspect(advice,pointCut);
		
		IOCContainer ioc = new IOCContainer();
		ioc.addBeanDefinition("target", TargetService.class);
		
		ioc.setAspect(aspect);
		
		IService service = (IService)ioc.getBean("target");
		service.say();
		
		
	}
}
