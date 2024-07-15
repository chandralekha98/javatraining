package javatraining;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int greatest=num1;
		if(num2>greatest ) {
			System.out.println(num2);
		} else if(num3>greatest) {
			System.out.println(num3);
		} else {
			System.out.println(greatest);
		}
	}
}
