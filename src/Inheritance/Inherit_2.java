package Inheritance;

class A{
	public int i=20;
    public static int k=40;
	public void one() { System.out.println("Sample one Method");}
	public void two() { System.out.println("Sample two Method");}
}

class B extends A{
	public static int i= 30;
	public static int k= 50;
	public static int g= 60;
	public void one() {System.out.println("sample one from B");}
	public void three() { System.out.println("sample three from B");}
}

public class Inherit_2{
	public static void main(String[] args) {
 		System.out.println("program starts");
		A obj1 = new A();
		System.out.println(obj1.i);
		System.out.println(obj1.k);
        obj1.one();
        obj1.two();
       B obj2= new B();
       System.out.println(obj2.i);
       System.out.println(obj2.k);
       System.out.println(obj2.g);
       obj2.three();
       obj2.one();
       obj2.two();

	}

}
