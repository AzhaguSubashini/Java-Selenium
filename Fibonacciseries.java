package week1.day1.assignment;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n = 8, firstTerm = 0, secondTerm = 1;
		System.out.print(firstTerm + ","+"\n");
		System.out.println(secondTerm + ",");
	    
	    for (int i =1; i <= n; ++i) {
	    	
	      int nextTerm = firstTerm + secondTerm;
	      System.out.println(nextTerm + ",");
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	     
		}
	    }
}