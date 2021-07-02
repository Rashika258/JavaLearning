package javaProject;

public class LeadingTrailingWhiteSpace {
	public static void main(String args[]) {
//		trim() strip() 
//		strip() - uses Character.isWhitespace() to check if Character.isWhitespace(0), uses unicode points
//		trim() - identifies any character having codepoint value less than or equal to ‘U+0020’ as a whitespace character.
		String s="     abc     def   \t";
		s=s.strip();
		System.out.print(s);
		
	}
}
