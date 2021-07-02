package javaProject;

public class Factorial {
	public static void main(String args[]) {
		System.out.print(factorial(6));
	}
	
	public static long factorial(long n) {
		if(n==1)
			return 1;
		else
			return (n*factorial(n-1));
	}
}
