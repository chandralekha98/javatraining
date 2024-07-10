package javatraining;

import java.util.Scanner;

public class ConvertTemperature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  temperature ");
		float celsius=sc.nextFloat();
		System.out.println(celsius+ " celsius = "+ (((1.8)*celsius)+32) +" Fahrenheit");
		System.out.println(celsius+ " celsius = "+ (celsius+273) +" Kelvin");
	}

}
