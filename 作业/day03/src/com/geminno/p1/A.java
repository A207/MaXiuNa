package com.geminno.p1;

public class A {
//公共访问修饰符修饰的方法
 public void methodA1(){
	System.out.println("public methodA1");
}
//私有方法
 private void methodA2(){
	System.out.println("public methodA2");
}
//default范围的方法（同一个包可以访问）
 void methodA3(){
		System.out.println("default methodA3");
	}
	//protected(同一个包或者子类可以访问)
 protected void methodA4(){
		System.out.println("protected methodA4");
	}
}

