package Lab2.question3;

public class SavingsAccount extends Account {
	private double interest=5;
	private double max_balance=10000.0;
	private double min_balance=1000.0;
	public SavingsAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
	}
	
public double getBalance()
{
	if(getAccountBalance()>=min_balance) {
		interest=getAccountBalance()*interest;
	}
	else
	{
		interest=0.0;
	}
	return interest;
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
