// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InnerClassTest.java

package cn.bdqn.bean;

import java.io.PrintStream;

// Referenced classes of package cn.bdqn.bean:
//			Animal, InnerClassTest

class InnerClassTest$Son$1
	implements Animal
{

	final InnerClassTest$Son this$1;
	private final String val$something;

	public void sleep()
	{
		System.out.println("Ð¡¹·ÔÚË¯¾õ");
	}

	public void eat()
	{
		System.out.println(val$something);
	}

	InnerClassTest$Son$1()
	{
		this$1 = final_innerclasstest$son;
		val$something = String.this;
		super();
	}
}
