package assignment;

import java.io.IOException;

public class StringMethodEx {
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

    public static void main(String args[]) throws IOException {
        String s = new String();
        System.out.println("String Constructor");
        System.out.println(s);
        char chars1[] = {
            'r',
            'a',
            's',
            'h',
            'i',
            'k',
            'a'
        };
        String s1 = new String(chars1);
        System.out.println("String initialised with character array");
        System.out.println(s1);
        String s2 = new String(chars1, 2, 3);
        System.out.println("String with first parameter string and second parameter as start index and third parameter as number of characters");
        System.out.println("Construct one string from another");
        String s3 = new String(s2);
        System.out.println(s3);
        byte ascii[] = {
            65,
            66,
            67,
            68,
            69,
            70
        };
        System.out.println("String accepts array of ascii values");
        String s4 = new String(ascii);
        System.out.println(s4);
        System.out.println("String accepts array of ascii values with startIndex and number of characters");
        String s5 = new String(ascii, 2, 3);
        System.out.println(s5);
        System.out.println("String length");
        System.out.println("Length of String s1 = " + s1.length());
        System.out.println("Length of String s2 = " + s2.length());
        System.out.println("Length of String s3 = " + s3.length());
        System.out.println("Length of String s4 = " + s4.length());
        System.out.println("Length of String s5 = " + s5.length());
        System.out.println("String Literals");
        System.out.println("For each string literal in your program, Java automatically constructs a String object. Thus, you can use a string literal to initialize a String object.");
        String s6 = "advanced java is so beautiful other than second module"; // using string literal
        System.out.println("The given string is --\n" + s6);
        System.out.println("Length os String Literal s6 = " + s6.length());
        System.out.println("Length of abc = " + "abc".length());
        System.out.println("String Concatenation");
        String subject = "Advanced Java";
        System.out.println("Subject --> " + subject);
        String name = "Rashika";
        System.out.println("Name --> " + name);
        String s7 = "I am " + name + " and my professional elective is " + subject + ".";
        System.out.println(s7);
        System.out.println("Using concatenation to prevent the use of long string");
        String longStr = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
            "Aenean congue sollicitudin vestibulum. Sed ultrices nulla faucibus mauris mollis," +
            "ac sollicitudin sapien commodo. Nullam ipsum metus," +
            "scelerisque eget tincidunt in, vulputate at felis." +
            "Nam metus mi, luctus et iaculis quis, maximus quis orci." +
            "Quisque vitae semper lorem." +
            "Cras elementum pulvinar quam sed maximus" +
            "Donec nec tellus augue. In porttitor," +
            "nunc quis pulvinar consequat," +
            "odio massa tincidunt ante, eu commodo tortor risus euismod libero." +
            "Phasellus volutpat sem vitae semper imperdiet. ";
        System.out.println(longStr);
        System.out.println("String Concatenation with the other Datatypes");
        int age = 20;
        String s8 = "He is " + age + " years old.";
        System.out.println(s8);
        String s9 = "Concatenation of string with two numbers will just take string with numbers " + 2 + 2;
        System.out.println(s9);
        System.out.println("Concatenation of string with two numbers will just take string with numbers with parentheses");
        String s10 = "four: " + (2 + 2);
        System.out.println(s10);

//        System.out.println("Example of toString Method()");
//        Rectangle r = new Rectangle(10, 20);
//        String rec = "Rectangle r= " + r;
//        System.out.println("ToString() Method");
//        System.out.println(r);
//        System.out.println(rec);

        System.out.println("Character Extraction Demonstration");
        System.out.println("1.charAt() Method");
        char ch1, ch2;
        ch1 = "RashikaSuresh".charAt(1);
        ch2 = "RashikaSuresh".charAt(-1);
        System.out.println("Character at index 1 in string RashikaSuresh --> " + ch1);
        System.out.println("Character at index -1 in string RashikaSuresh --> " + ch2);

        System.out.println("2.getChar() Method");
        System.out.println("sourceStart specifies the index of the beginning of the substring, and sourceEndspecifies an index that is one past the end of the desired substring");
        String s11 = "Nulla id lacinia purus, eu euismod nulla. Aenean enim felis, interdum nec libero sit amet,";
        int start = 8;
        int end = 18;
        char buf[] = new char[end - start];
        s11.getChars(start, end, buf, 0);
        System.out.println(buf);

        System.out.println("String Comparision Demonstration");
        System.out.println("1.equals() method");
        String s12 = "Rashika";
        String s13 = "Rashika";
        String s14 = "Good-girl";
        String s15 = "RASHIKA";
        System.out.println(s12 + " equals " + s13 + " -> " + s14.equals(s13));
        System.out.println(s12 + " equals " + s14 + " -> " + s14.equals(s14));
        System.out.println(s12 + " equals " + s15 + " -> " + s14.equals(s15));
        System.out.println("2.equalsIgnoreCase() method");
        System.out.println(s12 + " equalsIgnoreCase " + s15 + " -> " + s14.equalsIgnoreCase(s15));

        System.out.println("3.regionMatches() method");
        //boolean regionMatches(boolean ignoreCase,int startIndex, String str2,int str2StartIndex, int numChars)
        boolean b;
        String s16 = "Advanced java is the most beautiful subject";
        String s17 = "beautiful";
        b = s16.regionMatches(1, s17, 3, 0);
        if (b) {
            System.out.println("The given substring " + s17 + " is present in the string " + s16);
        } else {
            System.out.println("The given substring " + s17 + " is not present in the string " + s16);
        }

        System.out.println("4.startsWith() and endsWith() Method");
        System.out.println("Rashika".endsWith("shika"));
        System.out.println("Advanced_Java".startsWith("advan"));
        System.out.println("Adv_Java".startsWith("_Java", 3));

        System.out.println("5.equals( ) Versus == Method");
        String s18 = "Rashika";
        String s19 = new String(s18);
        System.out.println("s18" + s18 + " refers to \"String instance\" of string s18" + s18 + " equals " + s19 + " -> " +
            s18.equals(s19));
        System.out.println("equals== operator means that " + s19 + "refers to object created by s18 " + s18 + " == " + s19 + " -> " + (s18 == s19));

        System.out.println("6.compareTo( ) Method");
        System.out.println("To sort an array of string using compareTo");
        System.out.println("The array elements are " + arr);
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }

        System.out.println("Searching Strings Demonstration");

        String s20 = "Aenean congue sollicitudin vestibulum. Sed In ultrices nulla faucibus mauris mollis " + "Donec nec tellus augue. In porttitor.";
        System.out.println("Given String is " + s20);
        System.out.println("1.indexOf() method");
        System.out.println("indexOf(t) = " + s20.indexOf('t'));

        System.out.println("indexOf(the) = " + s20.indexOf("In"));

        System.out.println("indexOf(t, 10) = " + s20.indexOf('t', 10));

        System.out.println("indexOf(the, 10) = " + s20.indexOf("In", 10));

        System.out.println("2.lastIndexOf() method");
        System.out.println("lastIndexOf(t, 60) = " + s20.lastIndexOf('t', 60));
        System.out.println("lastIndexOf(the) = " + s20.lastIndexOf("In"));
        System.out.println("lastIndexOf(t) = " + s20.lastIndexOf('t'));
        System.out.println("lastIndexOf(the, 60) = " + s20.lastIndexOf("In", 60));

        System.out.println("Modifying Strings Demonstration");
        System.out.println("1.substring() Method");
        String org = "String objects are immutable, whenever you want to modify a String, you must\r\n" +
            "either copy it into a StringBuffer or StringBuilder, or use one of the following String methods,\r\n";
        String search = "immutable";
        String sub = "mutable";
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

        System.out.println("2.concat() Method");
        String s21 = "Advanced";
        String s22 = s21.concat("Java");
        System.out.println("Concatenated String using concat() = " + s22);
        String s23 = "Rashika";
        String s24 = s23 + " Suresh";
        System.out.println("Concatenated String using \"+\" operator = " + s24);

        System.out.println("2.replace() Method");
        String s25 = "Rashika".replace('a', 'i');
        System.out.println("Replacing string Rashika " + s25);

        System.out.println("3.trim() Method");
        String s26 = " Advanced Java ".trim();
        System.out.println(s26);

        System.out.println("Data Conversion Using valueOf() Demonstration");
        int value = 30;
        String ss = String.valueOf(value);
        System.out.println("Concatenating string with 10" + (ss + 10));

        boolean bol1 = true;
        boolean bol2 = false;
        String ss1 = String.valueOf(bol1);
        String ss2 = String.valueOf(bol2);
        System.out.println("Boolean to String Conversion ss1-->" + ss1 + "\n" + "ss2-->" + ss2 + "\n");

        System.out.println("Changing the Case of Characters Within a String\n");

        String s27 = "hiiii, yo!!! finish this Assignment fast";
        System.out.println("Original: " + s27);
        String upper = s27.toUpperCase();
        String lower = s27.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        System.out.println("StringBuffer Constructors");
        System.out.println("StringBuffer is a peer class of String that provides much of the functionality of strings");
        StringBuffer sb1 = new StringBuffer();
        System.out.println("String buffer with empty constructor --> " + sb1);
        int size = 10;
        StringBuffer sb2 = new StringBuffer(size);
        System.out.println("String buffer with fixed size constructor --> " + sb2);
        String a = "String methods";
        StringBuffer sb3 = new StringBuffer(a);
        System.out.println("String buffer with parameterized constructor --> " + sb3);

        System.out.println("length( ) and capacity( ) Demonstration");
        StringBuffer sb = new StringBuffer("Advanced Java");
        System.out.println("buffer = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());

        System.out.println("ensureCapacity( ) Demonstration");
        //create a StringBuffer object
        StringBuffer str = new StringBuffer("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        // print string capacity
        System.out.println("Before ensureCapacity " + "method capacity = " + str.capacity());
        // apply ensureCapacity()
        str.ensureCapacity(42);
        // print string capacity
        System.out.println("After ensureCapacity" + " method capacity = " + str.capacity());

        System.out.println("setLength( ) Demonstration");

        System.out.println("String length = " + str.length() + " and contains = " + str);

        // set length equal to 10
        str.setLength(10);

        // print string
        System.out.println("After setLength() String = " + str.toString());

        System.out.println("charAt( ) and setCharAt( ) Demonstration");

        System.out.println("buffer before = " + str);
        System.out.println("charAt(1) before = " + str.charAt(1));
        str.setCharAt(1, 'i');
        str.setLength(2);
        System.out.println("buffer after = " + str);
        System.out.println("charAt(1) after = " + str.charAt(1));

        System.out.println("getChars( ) Demonstration");
        char[] ch11 = new char[10];
        str.getChars(6, 16, ch11, 0);
        System.out.println(ch11);

        System.out.println("append( ) Demonstration");
        StringBuffer sbf1 = new StringBuffer("Java is a fascinating subject");
        System.out.println("Input: " + sbf1);

        // Appending the boolean value
        sbf1.append(true);
        System.out.println("Appending the boolean value true and the Output: " + sbf1);

        System.out.println();

        StringBuffer sbf2 = new StringBuffer("We are lost - ");
        System.out.println("Input: " + sbf2);

        // Appending the boolean value
        sbf2.append(false);
        System.out.println("Appending the boolean value false and the Output: " + sbf2);

        System.out.println("Another append( ) Demonstration");
        String s28;
        int a1 = 42;
        StringBuffer sbb1 = new StringBuffer(40);
        s28 = sbb1.append("a = ").append(a1).append("!").toString();
        System.out.println(s28);

        System.out.println("insert( ) Demonstration");
        StringBuffer sb31 = new StringBuffer("I Java!");
        sb31.insert(2, "like ");
        System.out.println(sb31);

        System.out.println("reverse( ) Demonstration");
        StringBuffer sb4 = new StringBuffer("java");
        System.out.println(sb4);
        sb4.reverse();
        System.out.println(sb4);

        System.out.println("delete( ) and deleteCharAt( ) Demonstration");
        StringBuffer sb5 = new StringBuffer(" delete characters within a StringBuffer by using the methods delete( ) deleteCharAt( ).");
        System.out.println("Given String Buffer\n" + sb5);
        System.out.println("Deleting with start index 4 and endindex 7");
        sb5.delete(4, 7);

        System.out.println("After delete: " + sb5);
        System.out.println("Deleting with location 0");
        sb5.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb5);

        System.out.println("reverse( ) Demonstration");
        StringBuffer sb6 = new StringBuffer("This is sooo bad");
        sb6.replace(8, 12, "too");
        System.out.println("After replace: " + sb6);

        System.out.println("substring( ) Demonstration");
        System.out.println(sb6.substring(6));
        System.out.println(sb6.substring(0, 6));

        System.out.println("indexOf() and lastindexOf() Demonstration");
        StringBuffer sb7 = new StringBuffer("one two one");
        int k;
        k = sb7.indexOf("one");
        System.out.println("First index: " + k);
        k = sb7.lastIndexOf("one");
        System.out.println("Last index: " + k);
    }
}