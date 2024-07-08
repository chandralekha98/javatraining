package javatraining;

import java.util.Scanner;

public class ConvertSecondsToHours {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time in seconds ");
		int givenSeconds=sc.nextInt();
		int hours = givenSeconds / 3600;
        int remainingSeconds = givenSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        System.out.println(givenSeconds + " = ");
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    
	}
}
