package week1.day1.assignment;

public class Palindrome {
	public static void main(String[] args) {
String str = "madam";
String rev = "";

int strLength = str.length();

for (int i = (strLength - 1); i >=0; --i) {
  rev = rev + str.charAt(i);
}

if (str.equals(rev)) {
  System.out.println(str + " is a Palindrome String.");
}
else {
  System.out.println(str + " is not a Palindrome String.");
}
}
}
