package com.qapitol.demo;

import java.util.Scanner;

public class Skipnumber {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	for(int i=1;i<=num;i++) {
		if(i>=20) {
			System.out.println("Number is more than 20");
			break;
		}
	if(i%2==0) {
			System.out.println("number is even");
			continue;
		}
	}
}
}
