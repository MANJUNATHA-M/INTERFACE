package com.inter.example;

interface Run
{
	int a=100;

	public void test();
}

class Sample implements Run
{
	@Override
	public void test()
	{
		System.out.println("Abstract of interface is Overriden");
	}
}
public class MainInterfaceExample
{
	public static void main(String[] args) {

		Sample sample=new Sample();
		sample.test();
		System.out.println(sample.a);
	}
}