package com.pack1;

public class Thiskeyword3 
{
	Thiskeyword3 meth1()
	{
		System.out.println("meth1() called");
		return this;
	}
	Thiskeyword3 meth2()
	{
		System.out.println("meth2() called");
		return this;
	}
	Thiskeyword3 meth3()
	{
		System.out.println("meth3() called");
		return this;
	}
	int meth4()
	{
		System.out.println("meth4() called");
		return 10;
	}
	public static void main(String[] args) 
	{
	
	System.out.println(new Thiskeyword3().meth1().meth2().meth3().meth4()+90);	
	}
}
