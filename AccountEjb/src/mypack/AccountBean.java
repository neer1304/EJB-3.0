package mypack;

import javax.ejb.Stateful;

@Stateful(mappedName="myAccount")
public class AccountBean implements Account
{
int balance=0;
	public void deposit(int amount) {
		balance+=amount;
	}

	public int getBalance() {
		return balance;
	}

	public boolean withdraw(int amount) {
		if(balance > amount)
		{
			balance-=amount;
			return true;
		}
		else
		return false;
	}

}
