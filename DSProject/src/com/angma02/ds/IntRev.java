/**
 * 
 */
package com.angma02.ds;

/**
 * @author ma601417
 *
 */
public class IntRev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntRev revObj = new IntRev();
		
		System.out.println(revObj.revInt(Integer.parseInt((args[0]))));
	}
	
	private int revInt(int in) {
		return Integer.reverse(in);
	}

}
