 package javatraining;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0;
		int b=1;
		
		for(int i=0;i<num;i++) {
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(a);
	}
	

}
