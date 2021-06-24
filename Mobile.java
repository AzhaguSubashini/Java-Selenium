package week1.day1;

public class Mobile {
	public String mobileModel = "Redmi";
	public int moblieWeight = 5;
	public boolean isFullCharge = false;
	public double mobileCost = 16000;
	public void makeCall() {
		System.out.println("Call your friend");

	}
	public void sendMsg() {
        System.out.println("Message in Groupchat");

	}

	public static void main(String[] args) {
		Mobile phone = new Mobile();
		phone.makeCall();
		phone.sendMsg();
	System.out.println(phone.mobileModel);
	System.out.println(phone.moblieWeight);
	System.out.println(phone.isFullCharge);
	System.out.println(phone.mobileCost);

	}

}
