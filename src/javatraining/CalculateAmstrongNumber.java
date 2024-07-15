package javatraining;

import java.util.Scanner;

public class CalculateAmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print get the Armstrong Number");
		int num=sc.nextInt();
		int j=num;
		int sum=0;
		while(num>0) {
			int i=num%10;
			sum+=i*i*i;
			num/=10;
		}
		if(sum==j) {
			System.out.println(sum+" is an Armstrong number");
		}
		else {
			System.out.println("it is not "+ sum);
		}
	}

}
