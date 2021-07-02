package javaProject;

public class Vowel {
	public static void main(String args[]) {
		System.out.println(stringContainVowels("Hello"));
		System.out.println(stringContainVowels("TV"));
	}
	public static boolean stringContainVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
