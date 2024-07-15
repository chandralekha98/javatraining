package javatraining;

import java.util.Scanner;
import java.util.HashMap;

public class PrintWeekdayName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Sunday");
		map.put(2,"Monday");
		map.put(3,"Tuesday");
		map.put(4, "Wednesday");
		map.put(5, "Thursday");
		map.put(6, "Friday");
		map.put(7, "Saturday");
		
		
		System.out.println("Enter a number to get the weekday name");
		int i=sc.nextInt();
		
		System.out.println("Weekday "+i+" " +map.get(i));
	}

}
