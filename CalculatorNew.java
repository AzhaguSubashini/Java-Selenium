package week3.day1.classroom;

public class CalculatorNew {
	
	public void add(int num1,int num2) {
		System.out.println(num1 + num2 + "both int");
	}
	public void add(int num1,int num2,int num3) {
		System.out.println(num1 + num2 + num3 + " " + "all int");
	}
	public void mul(int num1,int num2) {
		System.out.println(num1 + num2 + " " +  "both int");
	}
	public void mul(int num1,double num2) {
		System.out.println(num1 + num2+ " "  + "one int,one double");
	}
	
	public void sub(int num1,int num2) {
		System.out.println(num1 + num2+ " "  + "both int");
	}
	
	public void sub(double num1,double num2) {
		System.out.println(num1 + num2+ " "  + "both double");
	}
	
	public void div(int num1,int num2) {
		System.out.println(num1 + num2 + " " + "both int");
	}
	public void div(int num1,double num2) {
		System.out.println(num1 + num2 + " " + "one int,one double");
	}
	public static void main(String[] args) {
		CalculatorNew calcn = new CalculatorNew();
		calcn.add(5, 6);
		calcn.div(5, 10.909090);
		calcn.mul(4, 5.890);
		calcn.sub(10.567, 9.897);

	}

}
