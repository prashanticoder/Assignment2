package Lab2.question3;
import java.util.Random;
public class Account {
private String memberName;
private double accountBalance;
Random rand = new Random();
private String accountNumber ="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
rand.nextInt(10)+ rand.nextInt(10);
public Account(String memberName, double accountBalance) {
	super();
	this.memberName = memberName;
	this.accountBalance = accountBalance;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public void deposit(double balance)
{
	setAccountBalance(getAccountBalance()+balance);
}
@Override
public String toString() {
	return "Account [memberName=" + memberName + ", accountBalance=" + accountBalance + ", accountNumber="
			+ accountNumber + "]";
}

}
