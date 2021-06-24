package week1.day1.assignment;

public class ArmstrongNumber {
public static void main(String[] args) {
		int input = 153;
		int calculated=0,remainder,original;
		original = input;
	
		while (input>0) {
			remainder = input%10;
		calculated = calculated+(remainder*remainder*remainder);
		input = input/10;
		}
		if (calculated==original) {
			System.out.println("This number is Armstrong number");                             
		} else {
System.out.println("this is not a armstrong number");
		}
	}

}
