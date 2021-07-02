
public class StringMethodsExamples {
	static String arr[] = {
	        "Now",
	        "is",
	        "the",
	        "time",
	        "for",
	        "all",
	        "good",
	        "men",
	        "to",
	        "come",
	        "to",
	        "the",
	        "aid",
	        "of",
	        "their",
	        "country"
	    };
	    public static void main(String args[]) {
	        String s = new String();
	        System.out.println("String Constructor");
	        System.out.println(s);
	        char chars1[] = {
	            'a',
	            'b',
	            'c'
	        };
	        String s1 = new String(chars1);
	        System.out.println("String initialised with character array");
	        System.out.println(s1);
	        char chars2[] = {
	            'a',
	            'b',
	            'c',
	            'd',
	            'e',
	            'f'
	        };
	        String s2 = new String(chars2, 2, 3);
	        System.out.println("String with first parameter string and second parameter as start index and third parameter as number of characters")
	        System.out.println("Construct one string from another");
	        String s3 = new String(s2);
	        byte ascii[] = {
	            65,
	            66,
	            67,
	            68,
	            69,
	            70
	        };
	        String s4 = new String(ascii);
	        String s5 = new String(ascii, 2, 3);
	        char chars3[] = {
	            'a',
	            'b',
	            'c'
	        };
	        String s6 = new String(chars3);
	        char chars4[] = {
	            'a',
	            'b',
	            'c'
	        };
	        String s7 = new String(chars4);
	        String s8 = "abc"; // use string literal
	        System.out.println("abc".length());
	        String age = "9";
	        String s9 = "He is " + age + " years old.";
	        System.out.println(s9);
	        String longStr = "This could have been " +
	            "a very long line that would have " +
	            "wrapped around. But string concatenation " +
	            "prevents this.";
	        System.out.println(longStr);
	        // int age = 9;
	        String s10 = "He is " + age + " years old.";
	        System.out.println(s10);
	        String s11 = "four: " + 2 + 2;
	        System.out.println(s11);
	        String s12 = "four: " + (2 + 2);
	        char ch;
	        ch = "abc".charAt(1);
	        String s13 = "This is a demo of the getChars method.";
	        int start = 10;
	        int end = 14;
	        char buf[] = new char[end - start];
	        s13.getChars(start, end, buf, 0);
	        System.out.println(buf);
	        String s14 = "Hello";
	        String s15 = "Hello";
	        String s16 = "Good-bye";
	        String s17 = "HELLO";
	        System.out.println(s14 + " equals " + s15 + " -> " +
	            s14.equals(s15));
	        System.out.println(s14 + " equals " + s16 + " -> " +
	            s14.equals(s16));
	        System.out.println(s14 + " equals " + s17 + " -> " +
	            s14.equals(s17));
	        System.out.println(s14 + " equalsIgnoreCase " + s17 + " -> " +
	            s14.equalsIgnoreCase(s17));
	        System.out.println("Foobar".endsWith("bar"));
	        System.out.println("Foobar".startsWith("Foo"));
	        System.out.println("Foobar".startsWith("bar", 3));
	        String s18 = "Hello";
	        String s19 = new String(s18);
	        System.out.println(s18 + " equals " + s19 + " -> " +
	            s18.equals(s19));
	        System.out.println(s18 + " == " + s19 + " -> " + (s18 == s19));
	        String s20 = "Now is the time for all good men " +
	            "to come to the aid of their country.";
	        System.out.println(s);
	        System.out.println("indexOf(t) = " + s20.indexOf('t'));
	        System.out.println("lastIndexOf(t) = " + s20.lastIndexOf('t'));
	        System.out.println("indexOf(the) = " + s20.indexOf("the"));
	        System.out.println("lastIndexOf(the) = " + s20.lastIndexOf("the"));
	        System.out.println("indexOf(t, 10) = " + s20.indexOf('t', 10));
	        System.out.println("lastIndexOf(t, 60) = " + s20.lastIndexOf('t', 60));
	        System.out.println("indexOf(the, 10) = " + s20.indexOf("the", 10));
	        System.out.println("lastIndexOf(the, 60) = " + s20.lastIndexOf("the", 60));
	        String org = "This is a test. This is, too.";
	        String search = "is";
	        String sub = "was";
	        String result = "";
	        int i;
	        do { // replace all matching substrings
	            System.out.println(org);
	            i = org.indexOf(search);
	            if (i != -1) {
	                result = org.substring(0, i);
	                result = result + sub;
	                result = result + org.substring(i + search.length());
	                org = result;
	            }
	        } while (i != -1);
	        String s21 = "one";
	        String s22 = s1.concat("two");
	        String s23 = "one";
	        String s24 = s23 + "two";
	        String s25 = "Hello".replace('l', 'w');
	        String s26 = " Hello World ".trim();
	        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String str1;
	        System.out.println("Enter 'stop' to quit.");
	        System.out.println("Enter State: ");

	        String s27 = "This is a test.";
	        System.out.println("Original: " + s27);
	        String upper = s27.toUpperCase();
	        String lower = s27.toLowerCase();
	        System.out.println("Uppercase: " + upper);
	        System.out.println("Lowercase: " + lower);
	        StringBuffer sb = new StringBuffer("Hello");
	        System.out.println("buffer = " + sb);
	        System.out.println("length = " + sb.length());
	        System.out.println("capacity = " + sb.capacity());
	        StringBuffer sb1 = new StringBuffer("Hello");
	        System.out.println("buffer before = " + sb1);
	        System.out.println("charAt(1) before = " + sb1.charAt(1));
	        sb1.setCharAt(1, 'i');
	        sb1.setLength(2);
	        System.out.println("buffer after = " + sb1);
	        System.out.println("charAt(1) after = " + sb1.charAt(1));
	        String s28;
	        int a = 42;
	        StringBuffer sb111 = new StringBuffer(40);
	        s28 = sb.append("a = ").append(a).append("!").toString();
	        System.out.println(s28);
	        StringBuffer sb3 = new StringBuffer("I Java!");
	        sb3.insert(2, "like ");
	        System.out.println(sb3);
	        StringBuffer sb4 = new StringBuffer("abcdef");
	        System.out.println(sb4);
	        sb4.reverse();
	        System.out.println(sb4);
	        StringBuffer sb5 = new StringBuffer("This is a test.");
	        sb5.delete(4, 7);
	        System.out.println("After delete: " + sb5);
	        sb5.deleteCharAt(0);
	        System.out.println("After deleteCharAt: " + sb5);
	        StringBuffer sb6 = new StringBuffer("This is a test.");
	        sb6.replace(5, 7, "was");
	        System.out.println("After replace: " + sb6);
	        StringBuffer sb7 = new StringBuffer("one two one");
	        int j;
	        j = sb7.indexOf("one");
	        System.out.println("First index: " + i);
	        j = sb7.lastIndexOf("one");
	        System.out.println("Last index: " + i);
	    }
}
