package week2.day2.assignment;

public class ReverseString {
	String test = "feeling good";
	public static void main(String[] args) {
		
		String test = "feeling good";
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		int ch = charArray.length;
		System.out.println(ch);
		for (int  i = charArray.length-1;i >= 0;i-- ) {
			System.out.print(charArray[i]);
		}
		
	}
}

