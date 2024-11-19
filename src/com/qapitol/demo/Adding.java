package com.qapitol.demo;

public class Adding {
	public static void adddigit(int num) {
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Adding.adddigit(123456);
			
		}

	}


