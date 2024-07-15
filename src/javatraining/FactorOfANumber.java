package javatraining;

import java.util.Scanner;

public class FactorOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print get the factor");
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}

}
