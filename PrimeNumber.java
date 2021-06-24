package week1.day1.assignment;

public class PrimeNumber {
static int n=13;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int input = 13;
		int count = 0;
		for(int i=1;i<=input;i++) {
		if (input%i==0) {
			count++;
		}}
		if (count ==2) {
			System.out.println("given number"+n+"is prime" );
		}else {
			System.out.println("given number"+n+"is not a prime" );
		}
	}

}
