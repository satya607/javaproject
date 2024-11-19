package com.qapitol.demo;

public class Table {
  public static void printtable(int num) {
	
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=10;j++) {
			int res=i*j;
			System.out.println("multiplication table for"+i+":"+ res);
		}
		System.out.println();
		
	}
}
  public static void main(String[] args) {
	Table.printtable(3);
}
}
