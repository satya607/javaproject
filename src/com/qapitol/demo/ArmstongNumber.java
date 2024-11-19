package com.qapitol.demo;

public class ArmstongNumber {
	public static boolean checkarmstrong(int num) {
		int originalnumber = num;
		double sum=0;
		int digitcount=String.valueOf(originalnumber).length();
		while(num!=0) {
			int digit = num%10;
			sum+=Math.pow(digit, digitcount);
			num=num/10;
		}
		return originalnumber==sum;
		
	}
 public static void main(String[] args) {
	 for(int i=1;i<=1000;i++) {
		 if(ArmstongNumber.checkarmstrong(i)) {
			 System.out.println(i);
		 }
	 }
	  }
}

