package com.vnb.yanbin.proxy.aopioc.proxy;

public class TargetService implements IService {

	@Override
	public String say() {
		System.out.println("target...");
		return "SUCESS";
	}
}
