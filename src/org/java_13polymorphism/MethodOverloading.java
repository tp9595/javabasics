package org.java_13polymorphism;

public class MethodOverloading {
	//Method overloading  by changing parameter 
	//there is same scenario for static & non-static 
	public static void test() {
		System.out.println("No Parameter");
	}
	
	public static void test(int a ) {
		System.out.println("a="+a);
	}
	public void test(int a,int b) {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public void test(int a, int b, int c ) {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	
	   public static void main(String[] args) {
		test();
		test(10);
		MethodOverloading obj = new MethodOverloading();
		obj.test(1, 2,9);
		obj.test(150,986);
		test();
		}

}

 class Polycheck{
	 public static void test() {// we can write same method  name in different classes 
			System.out.println("Parameter");
	 
	 }
 }