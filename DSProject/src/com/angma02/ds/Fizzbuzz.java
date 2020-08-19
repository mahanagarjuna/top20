/**
 * 
 */
package com.angma02.ds;

/**
 * @author ma601417
 *
 */
public class Fizzbuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Please pass a whole number as input...");
			System.exit(0);
		}else {
			int in = Integer.parseInt(args[0]);
			System.out.println("You have passed: " + in);
			for(int i=1; i <= in; i++) {
				if((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println("fizzbuzz");
				}else if(i % 5 == 0) {
					System.out.println("buzz");
				}else if (i % 3 == 0) {
					System.out.println("fizz");
				} else {
					System.out.println(i);
				}
					
			}
		}

	}

}
