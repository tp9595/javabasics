package org.java_14encapasulation;

class Rohit1{
	
	private int a ,b;//00
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	public void setA(int a) {
		this.a=a;
	}
	public void setB(int b) {
		this.b=b;
	}

}



public class GetterSetterthis {

	public static void main(String[] args) {
		
		Rohit1 obj =new Rohit1();
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		obj.setA(89);
		obj.setB(9636);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		Rohit1 obj1 =new Rohit1();
		System.out.println(obj1.getA());
		System.out.println(obj1.getB());
		obj1.setA(12);
		obj1.setB(23);
		System.out.println(obj1.getA());
		System.out.println(obj1.getB());
	}// Multiple Copies created for another object i.e.obj1

}
