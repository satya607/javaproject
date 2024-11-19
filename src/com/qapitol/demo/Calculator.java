package com.qapitol.demo;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice;
	do {
	
	System.out.println("Calculator menu");
	System.out.println("1.add");
	System.out.println("2.sustract");
	System.out.println("3.multiple");
	System.out.println("4.devide");
	System.out.println("5.exit");
	System.out.println("enter the choice");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		performaddition(sc);
		break;
	case 2:
		performsubstraction(sc);
		break;
	case 3:
		performmultiple(sc);
		break;
	case 4:
		performdevide(sc);
		break;
	case 5:
		System.out.println("exit the program");
		break;
	}
	
	
}
	while(choice!=5);
  }
  public static void performaddition(Scanner sc) {
	 System.out.println("give first number");
	  int num1 = sc.nextInt();
	  System.out.println("give second number");
	  int num2 = sc.nextInt();
	  int result=num1+num2;
	  System.out.println(result);
  }
  public static void performsubstraction(Scanner sc) {
		 System.out.println("give first number");
		  int num1 = sc.nextInt();
		  System.out.println("give second number");
		  int num2 = sc.nextInt();
		  int result=num1-num2;
		  System.out.println(result);
	  }
  public static void performmultiple(Scanner sc) {
		 System.out.println("give first number");
		  int num1 = sc.nextInt();
		  System.out.println("give second number");
		  int num2 = sc.nextInt();
		  int result=num1*num2;
		  System.out.println(result);
	  }
  public static void performdevide(Scanner sc) {
		 System.out.println("give first number");
		  int num1 = sc.nextInt();
		  System.out.println("give second number");
		  int num2 = sc.nextInt();
		  int result=num1/num2;
		  System.out.println(result);
	  }
 
}
