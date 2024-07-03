package CallingByRefValPractice;

public class CallByValue {

	public static void main(String[] args) {
		int i=40;
		valueOfI(i);
		System.out.println(i);
	}
	public static void valueOfI(int i) {
		i=20;
	}
}
