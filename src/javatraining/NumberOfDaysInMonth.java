package javatraining;

import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which month");
		int whichMonth=sc.nextInt();
		int days=0;
		switch (whichMonth) {
		case 1:
			days=31;
			System.out.println("Jan: "+days);	
			break;
		case 2:
			days=28;
			System.out.println("Feb: "+days);	
			break;
		case 3:
			days=31;
			System.out.println("March: "+days);	
			break;
		case 4:
			days=30;
			System.out.println("April: "+days);	
			break;
		case 5:
			days=31;
			System.out.println("May: "+days);	
			break;
		case 6:
			days=30;
			System.out.println("June: "+days);	
			break;
		case 7:
			days=31;
			System.out.println("July: "+days);	
			break;
		case 8:
			days=31;
			System.out.println("August: "+days);	
			break;
		case 9:
			days=30;
			System.out.println("September: "+days);	
			break;
		case 10:
			days=31;
			System.out.println("October: "+days);	
			break;
		case 11:
			days=30;
			System.out.println("November: "+days);	
			break;
		case 12:
			days=31;
			System.out.println("December: "+days);	
			break;
		default:
			System.out.println("Invalid");		
		}

	}

}
