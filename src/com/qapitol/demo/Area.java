package com.qapitol.demo;

import java.util.Scanner;



public class Area {
	
	
	public static void ractangular(int number1,int number2) {
		
		int area=number1*number2;
	System.out.println("Area of Ractangular is "+area);
	
	
	}
	
	
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		System.out.println("Enter the width");
		int width=sc.nextInt();
		Area.ractangular(length, width);
		
		
	}

}
