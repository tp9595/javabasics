package org.java_20upcastingdouncasting;

class AAA{
	public void test1 () {
		System.out.println("test1");
	}
}
class BBB extends AAA{
	public void test2 () {
		System.out.println("test2");
	}
}
class CCC extends BBB{
	public void test3 () {
		System.out.println("test3");
	}
}
public class Downcasting  {
	
	
	public static void main(String[] args) {
		System.out.println("****************");
	//	CCC obj11 = (CCC)(new AAA());
		AAA obj = new CCC();//Upcasted object.
		CCC obj11 = (CCC) obj;
		obj.test1();
		//obj.test2();//error(The method test2() is undefined for the type AAA)
		//obj.test3();//error(The method test3() is undefined for the type AAA)
		System.out.println("GGGGGGG");
		BBB obj1=(BBB)obj;// Downcasting
		
		obj1.test1();
		obj1.test2();
		//obj1.test3();//error(The method test3() is undefined for the type BBB)
		
		CCC obj12 = (CCC)obj1;// Downcasting
		//or
		CCC obj2 = (CCC) obj;// Downcasting
		obj2.test1();
		obj2.test2();
		obj2.test3();
		
	
}
}