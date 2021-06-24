package week1.day1.assignment;

import java.util.Arrays;

public class Anagram {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str1 = "stops";
		String str2= "potss";
		if (str1.length()!= str2.length()) {
			System.out.println("This is not a anagram");
		} else {
char[] s1 = str1.toCharArray();
char[] s2 = str2.toCharArray();
Arrays.sort(s1);
Arrays.sort(s2);
if (Arrays.equals(s1, s2)== true) {
	System.out.println("Both are anagram"+ " " + str1 + " " + str2);
} else {
System.out.println("Both the string are not anagram");
}
}
	

	}

}
