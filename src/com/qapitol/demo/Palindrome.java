package com.qapitol.demo;

public class Palindrome {
  public static boolean checkpalindrome(String s) {
	  int left=0;
	  int right=s.length()-1;
	  while(left<right) {
		  if(s.charAt(left)!=s.charAt(right)) {
			  return false;
		  }
		  left++;
		  right--;
	  }
	  return true;
  }
  public static void checknumberpalindrome(int n) {
	 int rem,temp,revrese=0;
	
	 temp=n;
	 while(n>0) {
		 rem=n%10;
		 revrese=(revrese*10)+rem;
		 n=n/10;
}
	 if(revrese==temp) {
		 System.out.println("given number is palindrome");
	 }
	 else
		 System.out.println("given number is not palindrome");
  }
  public static void main(String[] args) {
	 if( Palindrome.checkpalindrome("mom")) {
		 System.out.println("String is palindrome");
	 }
	 else
		 System.out.println("string is not palindrome");
	 Palindrome.checknumberpalindrome(121);
}
  
}
