package com.vnb.yanbin.proxy.aopioc.aop;

public class Aspect {

	private Advice advice;
	
	private PointCut pointCut;

	public Aspect(Advice advice, PointCut pointCut) {
		super();
		this.advice = advice;
		this.pointCut = pointCut;
	}

	public Advice getAdvice() {
		return advice;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	public PointCut getPointCut() {
		return pointCut;
	}

	public void setPointCut(PointCut pointCut) {
		this.pointCut = pointCut;
	}
}
