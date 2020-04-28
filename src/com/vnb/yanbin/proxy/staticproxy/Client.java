package com.vnb.yanbin.proxy.staticproxy;

public class Client {

	public static void main(String[] args) {
		TargetService targetService = new TargetService();
		TargetService service = new ProxyService(targetService);
		service.say();
	}
}
