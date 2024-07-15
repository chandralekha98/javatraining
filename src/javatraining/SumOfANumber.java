package javatraining;

import java.util.Scanner;

public class SumOfANumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to calculate the sum");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;			
		}
		System.out.println(sum);
	}

}
