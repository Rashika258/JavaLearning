package javaProject;

public class Palindrome {
	static boolean checkPalindrome(String input) {
		boolean result=true;
		int length=input.length();
		for(int i=0;i<length/2;i++) {
			if(input.charAt(i) != input.charAt(length-i-1)) {
				result=false;
				break;
			}
		}
		return result;
	}
	public static void main(String args[]) {
		System.out.println(checkPalindrome("hih"));
	}
}
