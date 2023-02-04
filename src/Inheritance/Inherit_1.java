package Inheritance;


	
	class dad{
		static int a=100;
		static int b=200;
		static void m1() {System.out.println("m1 method from a1");}
		static void m2() {System.out.println("m2 method from a1");}
	}
    class kid extends dad{
    	static int b=3;
    	static int c=4;
    	static void m2() { System.out.println("m2 method from kid");}
    	static void m3() { System.out.println("m3 method from kid");}
	}
    public class Inherit_1 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		
		dad obj1= new dad();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		obj1.m1();
		obj1.m2();
		
		kid obj2 = new kid();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		obj2.m1();
		obj2.m2();
		obj2.m3();
		System.out.println(kid.a);
		System.out.println(kid.b);
		System.out.println(kid.c);
		kid.m1();
		kid.m2();
		kid.m3();
		dad.m1();
		dad.m2();
	}
}