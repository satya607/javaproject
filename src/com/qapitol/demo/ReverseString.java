package com.qapitol.demo;

public class ReverseString {
public static void main(String[] args) {
	String s="i am an automation engineer";
	String[] str = s.split(" ");
	for(String st:str) {
		
		String rev="";
		for(int j=st.length()-1;j>=0;j--) {
			rev=rev+st.charAt(j);
		}
		System.out.print(rev+" ");
		
	}
}
}
