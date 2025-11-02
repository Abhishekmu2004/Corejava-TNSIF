package com.tnsif.abstractiondemo;

public class Abhidemo extends Mahindrademo{

	@Override
	public void AIIntegration() {
		System.out.println("welcome");
	}

	@Override
	public void Satellitecomm() {
		System.out.println("goodmorning");
		
	}

	@Override
	public void HealthMonitoring() {
		System.out.println("hello world");
		
	}
	public static void main(String[] args) {
		Abhidemo r=new Abhidemo();
		r.AIIntegration();
		r.HealthMonitoring();
		r.Satellitecomm();
	}

}
