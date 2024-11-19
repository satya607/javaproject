package com.qapitol.demo;

public class Factorial {
  public static void getfactorial(int num) {
	
	int prod=1;
	while(num>1) {
		prod=prod*num;
		num--;
	}
	System.out.println(prod);
}
  public static void main(String[] args) {
	  Factorial.getfactorial(4);
}
}
