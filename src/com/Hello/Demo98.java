package com.Hello;

import java.io.FileOutputStream;

public class Demo98 
{
	int a=10;
	static int b=20;
	
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void m2()
	{
		Demo98 d1=new Demo98();//object
		System.out.println(d1.a);
		System.out.println(b);
		System.out.print("hello");
		System.out.println("hello");
	}
	
}
