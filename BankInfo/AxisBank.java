package BankInfo;

public class AxisBank extends BankInformation{
	public void deposit()
	{
		System.out.println("This is deposit account");
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();

	}

}
