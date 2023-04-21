package lab4;
import java.util.Scanner;
abstract class BankAccount{
	int AccountNumber;
	float balance;
	public BankAccount(int AccountNumber, float balance)
	{
		this.AccountNumber = AccountNumber;
		this.balance = balance;
	}
	abstract void deposit(float Amount);
	abstract void withdraw(float Amount);
}
class CheckingAccount extends BankAccount{

	public CheckingAccount(int AccountNumber, int balance) {
		super(AccountNumber, balance);
		
	}
	@Override
	void deposit(float deposit) {
		System.out.println("Balance after deposit : "+(balance+deposit));
		
	}

	@Override
	void withdraw(float Withdrawalamt) {
		if (Withdrawalamt<=balance)
		{
			System.out.println("Withdraw successfully!!");
			System.out.println("Current balance : "+(balance-Withdrawalamt));
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		
	}
	
}
public class Abstraction2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckingAccount check = new CheckingAccount(101, 5000);
		sc.close();
		do {
			System.out.println(" Enter\n"+"1) Deposit \n"+"2)Withdraw\n"+"3)Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount you want to deposit: ");
				int deposit_amount = sc.nextInt();
				check.deposit(deposit_amount);
				System.out.println("================");
				break;
				
			case 2:
				System.out.println("Enter the amount you want to Withdraw: ");
				int withdraw_amount = sc.nextInt();
				check.withdraw(withdraw_amount);
				System.out.println("================");
				break;
				
			case 3:
				System.out.println("Thank you!!!!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice!!");
				break;
			}
		}while(true);


	}

}
