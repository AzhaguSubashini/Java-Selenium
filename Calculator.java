package week1.day2;

public class Calculator {
	public int add(int a,int b) {
int sum= a+b;
return sum;
}
public double sub(double a, double b) {
	double sub = a-b;
return sub;
}
public double mul(double a,double b) {
	double result = a*b;
return result;
}
public int div(int a,int b) {
	int result = a/b;
	return result;

}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(5, 7));
		System.out.println(cal.sub(3.555,6.8888));
		System.out.println(cal.mul(3.5, 6.7));
		System.out.println(cal.div(10, 10));
		
		
	}

}
