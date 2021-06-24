package week1.day1.assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		
int count = 0;
for ( int i =0;i<str.length();i++) {
	char c1=str.charAt(i);
	char c2='e';
if (c1==c2) {
	count ++;
}
}
System.out.println(count +" " + "Times repeated in the above sentence");
	}

}
