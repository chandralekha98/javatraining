package javatraining;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num1=sc.nextInt();
		
		//Using Brute force approach 
		System.out.println("Sqaure of num1: "+num1*num1);
		System.out.println("Cube of num1: "+num1*num1*num1);
		System.out.println("Fourth of num1: "+num1*num1*num1*num1);
				
		//Using Math library 
		System.out.println("Sqaure of num1: "+ (int)(Math.pow(num1, 2)));
		System.out.println("Sqaure of num1: "+ (int)(Math.pow(num1, 3)));
		System.out.println("Sqaure of num1: "+ (int)(Math.pow(num1, 4)));
	}

}
