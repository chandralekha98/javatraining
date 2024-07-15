package javatraining;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		int c = 0;
		int num = 2;
		while (c < 20) {
			if (isPrime(num)) {
				System.out.print(num + " ");
				c++;
			}
			num++;
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
