package javaProject;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter rows to print");
		int rows=scanner.nextInt();
		scanner.close();
		System.out.println("Printing Pattern");
		printPattern1(rows);
	}
	private static void printPattern1(int rows) {
		for(int i=1;i<rows;i++) {
			int numOfWhiteSpaces=rows-i;
			printString(" "+numOfWhiteSpaces);
			printString(i+" ",i);
			System.out.println("");
		}
	}
	
	private static void printString(String s, int times) {
		for(int j=0;j<times;j++) {
			System.out.print(s);
		}
	}
}
