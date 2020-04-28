package com.vnb.yanbin.proxy.staticproxy;

public class ProxyService extends TargetService {

	TargetService targetService ;
	
	public ProxyService(TargetService targetService) {
		super();
		this.targetService = targetService;
	}

	@Override
	public void say() {
		System.out.println("proxy before...");
		super.say();
		System.out.println("proxy after...");
	}
}
