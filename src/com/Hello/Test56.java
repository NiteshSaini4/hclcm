package com.Hello;

public interface Test56 
{
	
	private void m2()
	{
		System.out.println("private");
	}
	default void m4()
	{
		m2();
	}

}
