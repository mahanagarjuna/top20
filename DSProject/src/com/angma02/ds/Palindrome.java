package com.angma02.ds;

public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome pObj = new Palindrome();
		
		System.out.println(pObj.isPalindrome(args[0]));
	}
	
	private boolean isPalindrome(String str) {
		
		int i = 0;
		int j = str.length() - 1;
		char[] strArray = str.toCharArray();
		boolean isPalindrome = true;
		while (i <= j) {
			if(strArray[i]!=strArray[j])
				isPalindrome = false;
			
			i++; j--;
		}
		
		return isPalindrome;
	}

}
