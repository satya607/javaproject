package com.qapitol.demo;

import java.util.Scanner;

public class Vote {
	int age;
	public Vote(int voterage) {
		this.age=voterage;
	}
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the age");
	  int person_age = sc.nextInt();
	Vote  vote=new Vote(person_age);
	  if(vote.age>=18 && vote.age<=100) {
		  System.out.println("user can cast thair vote");
	  }
	  else if(vote.age<18 || vote.age>100) {
		  System.out.println("Incorrect age");
	  }
}
}
