package com.angma02.java;

class A {
	
	static int i = 100;
	
	static {
		i = i-- - --i;
		System.out.println("First: " + i);
	}
	
	{
		i = i++ + ++i;
		System.out.println("Second: " + i);
	}
}

class B extends A {
	
	static {
		i = i-- - --i;
		System.out.println("Third: " + i);
	}
	
	{
		i = i++ + ++i;
		System.out.println("Fouth: " + i);
	}
}

public class MainClass {
	
	public static void main(String[] args) {
		B b = new B();
		
		System.out.println("i = " + b.i);
	}
}
