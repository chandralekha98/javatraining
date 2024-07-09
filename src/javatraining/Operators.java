package javatraining;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Sum: "+ (num1+num2));
		System.out.println("Difference: "+(num1-num2));
		System.out.println("Product: "+ num1*num2);
		System.out.println("Average: "+ (num1+num2)/2);
		System.out.println("Distance: "+ Math.abs(num1 - num2));
		System.out.println("Min: "+ Math.min(num1,num2));
		System.out.println("Min: "+ Math.max(num1,num2));
//		if(num1>num2) {
//			System.out.println("Min: "+ num2);
//			System.out.println("Max: "+ num1);
//		}	
//		else {
//			System.out.println("Min: "+ num1);
//			System.out.println("Max: "+ num2);
//		}	
			
		
	}

}
