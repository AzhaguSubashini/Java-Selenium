package week1.day1.assignment;

public class FindTypes {



	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
        int  letter = 0, space = 0, num = 0, specialChar = 0;
		
        for (int i = 0; i < test.length(); i++) {
			char c1 = test.charAt(i);
			if (Character.isLetter(c1)) {
				letter++;
			}else if (Character.isDigit(c1)) {
				num++;
			}else if (Character.isSpaceChar(c1)) {
				space++;
			}else {
			specialChar++;	
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
