package com.angma02.ds;

public class StringRev {

	public static void main(String[] args) {
		StringRev rev = new StringRev();
		if(args[0] != null)
			//System.out.println(rev.myReverse(args[0]));
			System.out.println(rev.myRev(args[0]));
		else
			System.out.println("Please pass a string to reverse...!");
	}
	
	/**
	 * Adda the ending by reading from the array end
	 * @param str
	 * @return
	 */
	private String myReverse(String str) {
		String revStr = "";
		char[] strArray = str.toCharArray();
		
		for(int i=strArray.length-1; i>=0; i--) {
			//System.out.println(strArray[i]);
			revStr = revStr + strArray[i];
		}
		
		return revStr;
	}
	
	/**
	 * Add at the string starting by reading from the array starting...
	 * @param str
	 * @return
	 */
	private String myRev(String str) {
		String revStr = "";
		char[] strArray = str.toCharArray();
		
		for(char c1 : strArray) {
			revStr = c1 + revStr;
		}
		return revStr;
	}

}
