package com.vnb.yanbin.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		
		IService target = new TargetService();
		
		//转换的类型必须是接口，如果是实现则报错。也说明必须实现接口
		IService ts = (IService)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new ProxyService(target));
		
		ts.say();
		
	}
}
