package com.ambiguity;

public class Test {

	Test(double a,double b)
	{
		System.out.println("Inside double");
	}
	Test(int a,int b)
	{
		System.out.println("Inside Integer");
	}
	Test(String a,String b)
	{
		System.out.println("Inside String");
	}
	Test(int a,double b)
	{
		System.out.println("inside Integer and Doubles");
	}
}
