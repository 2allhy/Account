import java.util.Scanner;

abstract class Account implements Valuable {
	private double balance;
	
	public Account(double _balance){
		balance=_balance;
	}
	
	public double getBalance(){  //잔액환인  읽기
		return balance;
	}
	public void debit(double s){    //출금
		balance-=s;
		if(balance<0){
			System.out.print("Debit amount exceeded account balance\n");
			balance+=s;
		}
	}
	public void credit(double s){  //입금
		balance+=s;
	}
	protected void setBalance(double s){   //잔액수정  쓰기
		balance=s;
	}
	abstract double getWithdrawableAccount();
	
	abstract void passTime(int month);
	
}
	