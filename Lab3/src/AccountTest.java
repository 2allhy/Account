import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		CheckingAccount account1=new CheckingAccount();
		CheckingAccount account2=new CheckingAccount();
		
		account1.setBalance(100);
		account2.setBalance(100);
		
		
	    Scanner input=new Scanner(System.in);
	    
	    System.out.printf("Account1 balance: $%.2f\n", account1.getBalance());
	    System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());
	    System.out.print("Enter deposit amount for Account1: ");
		int money=input.nextInt();
		account1.credit(money);
		
		System.out.printf("\nAccount1 balance: $%.2f\n",account1.getBalance());
		System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());
		System.out.print("Enter withdrawal amount for Account2: ");
		money=input.nextInt();
		account2.debit(money);
		
		System.out.printf("\nAccount1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());
		
		System.out.print("\nnext month!\n");
		account1.setInterest(0.01);
		account2.setLoanInterest(0.07);
		account2.setCreditLimit(100);
		account1.nextMonth();
		account2.nextMonth();
		
		System.out.printf("Account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());		
	}
}
