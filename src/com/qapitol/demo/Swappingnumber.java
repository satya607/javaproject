package com.qapitol.demo;

public class Swappingnumber {
public static void main(String[] args) {
	int num1=10;
	int num2=20;
	System.out.println("number before swapping"+num1+" "+num2);
	int sum=num1+num2;
	num1=sum-num1;
	num2=sum-num2;
	System.out.println("number after swapping"+num1+" "+num2);
}
}
