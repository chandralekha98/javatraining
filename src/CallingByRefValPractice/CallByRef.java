package CallingByRefValPractice;

public class CallByRef {

	public static void main(String[] args) {
		C1 obj=new C1();
		obj.i=40;
		valueOfI(obj);
		System.out.println(obj.i);
	}
	public static void valueOfI(C1 c) {
		c.i=20;
	}

}
class C1{
	int i;
}