package com.qapitol.demo;

import java.util.Scanner;

public class SumofArray {
public static void sumofelements(int[] num) {
	// int[] num= {12,6,15,30};
	 int sum=0;
	 for(int number:num) {
		 sum=sum+number;
	 }
	 System.out.println("Sum of array elements is "+sum);
}
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);  
      System.out.println("Enter the array range");  
      int size = sc.nextInt();  
      int[] arr = new int[size];  
      System.out.println("Enter the elements of the array ::");  
  
      for(int i=0; i<size; i++) {  
         arr[i] = sc.nextInt();  
      }  
      SumofArray.sumofelements(arr);
}
}
