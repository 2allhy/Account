import java.util.Scanner;
public class Account {
	private double balance;
	public double getbalance(){
		return balance;
	}
	public void debit(double s){
		balance-=s;
		if(balance<0){
			System.out.printf("");
			balance+=m;
		}
	}
	public void credit(double s){
		balance+=s;
	}
	public Account(double s){
		balance=s;
	}
	
}
	