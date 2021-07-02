package javaProject;

public class WhiteSpace {
	static String removeWhiteSpace(String input) {
		StringBuilder output = new StringBuilder();
		char[] charArray = input.toCharArray();
		for(char c: charArray) {
			if(!Character.isWhitespace(c))
				output.append(c);
			
		}
		return output.toString();
	}
	public static void main(String args[]) {
		System.out.print(removeWhiteSpace(" hiiii nabhdbnsdb   "));
	}
}
