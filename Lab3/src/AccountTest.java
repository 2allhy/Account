import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("account1 balance: ");
		Account account=new Account();
		
		System.out.print("account2 balance: ");
		double account2=input.nextDouble();
		System.out.print("\n");
		
		System.out.print("Enter withdrawal amount for account1: ");
		double withdrawal1=input.nextDouble();
		System.out.print("\n");
		System.out.printf("substracting %.2f from account1 balance\n",withdrawal1);
		
		if(withdrawal1>account1){
			System.out.print("Debit amount exceeded account balance\n");
			
		}
		
	}
}
