package Inheritance;

class A {
	public void m1() {

	}
}

class B extends A {
	public void m2() {

	}
}

class C {
	public void m3() {

	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		C obj = new C();
		obj.m3();
		B obj2 = new B();
		obj2.m1();
		obj2.m2();
	}
}
