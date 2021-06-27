package week3.assignment;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("12%");

	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();
	}

}
