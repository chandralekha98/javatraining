package javatraining;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertInchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DecimalFormat DECFOR = new DecimalFormat("0.00");  
		Scanner sc=new Scanner(System.in);
		
		double inches=0.0;
		System.out.println("Enter Inches ");
		while (true) {
            if (sc.hasNextDouble()) {          	
                inches = sc.nextDouble();
                if (inches < 0) {
                    System.out.print("Please enter a positive number: ");
                } else {
                    break;
                }
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                sc.next(); 
            }
        }
		System.out.println(inches+ " = "+ (inches*0.0254));
	}

}
