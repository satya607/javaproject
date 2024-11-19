package com.qapitol.demo;

public class Fibonacci {
public static void printfibonacci(int n) {
	 int num1=0;
	 int num2=1;
	
	 System.out.print(num1+" "+num2+" ");
	 for(int i=2;i<=n;i++) {
		 int sum=num2+num1;
		 System.out.print(sum+" ");
		 num1=num2;
		 num2=sum;
	 }
}
  public static void main(String[] args) {
	  Fibonacci.printfibonacci(10);
}
}
