package Inheritance;

class A1 {
	public void m1() {
		System.out.println("A: Parent of Class B and C");
	}
}

class B1 extends A1 {
	public void m2() {
		System.out.println("B: Child Class OF A");
	}
}

class C1 extends A1{
	public void m3() {
		System.out.println("C: Child Class Of A");
	}
}

public class HirarchicalInheritance {
	public static void main(String[] args) {
		C1 obj = new C1();
		obj.m3();
		obj.m1();
		B1 obj2 = new B1();
		obj2.m1();
		obj2.m2();
	}
}
