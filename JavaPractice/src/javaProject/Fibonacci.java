package javaProject;

public class Fibonacci {
	public static int fibonacciNum(int n) {
		if(n<=1)
			return n;
		return fibonacciNum(n-1) + fibonacciNum(n-2);
	}
	public static void printFibonacciSeries(int count) {
		int a=0;
		int b=1;
		int c=1;
		for(int i=1;i<=count;i++) {
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}
	}
	public static void main(String args[]) {
		int n=10;
		System.out.println(fibonacciNum(n));
	}
	
}
