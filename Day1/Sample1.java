package com.xyz;

public class Sample1
{
	static int x = 1;
	private int y = 3;
	public void method1(int x)
	{
		Sample1 t = new Sample1();
		this.x = 2;
		y = 4;

		System.out.println("Test.x: " + Sample1.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
	}

	public static void main(String args[])
	{
		Sample1 t = new Sample1();
		t.method1(5);
	}
}

