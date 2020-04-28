package com.vnb.yanbin.proxy.aopioc.aop;

public class PointCut {

	private String classPattern;
	
	private String methodPattern;

	public PointCut(String classPattern, String methodPattern) {
		super();
		this.classPattern = classPattern;
		this.methodPattern = methodPattern;
	}

	public String getClassPattern() {
		return classPattern;
	}

	public void setClassPattern(String classPattern) {
		this.classPattern = classPattern;
	}

	public String getMethodPattern() {
		return methodPattern;
	}

	public void setMethodPattern(String methodPattern) {
		this.methodPattern = methodPattern;
	}
	
}
