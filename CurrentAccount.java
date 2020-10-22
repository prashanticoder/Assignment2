package Lab2.question3;

public class CurrentAccount extends Account{
	private int tradeLicenseNumber;
private double min_balance=1000.0;
	public CurrentAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
	}
	public void getBalance()
	{
		System.out.println(getAccountBalance());
	}
	public void withDraw(double balance)
	{
		if((getAccountBalance()-balance)>=min_balance)
		{
			setAccountBalance(getAccountBalance()-balance);
			
		}
			else
			{
				System.out.println("less balance");
			}
	}

}
