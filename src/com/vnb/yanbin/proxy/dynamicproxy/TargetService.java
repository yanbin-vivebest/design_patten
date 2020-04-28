package com.vnb.yanbin.proxy.dynamicproxy;

public class TargetService implements IService {

	@Override
	public String say() {
		System.out.println("dynamic target...");
		return "SUCESS";
	}
}
