
public class Account {
	private double balance;
	public double getBalance(){  //잔액환인
		return balance;
	}
	public void debit(double s){    //출금
		balance-=s;
		if(balance<0){
			System.out.printf("Debit amount exceeded account balance\n");
			balance+=s;
		}
	}
	public void credit(double s){  //입금
		balance+=s;
	}
	public Account(double s){
		balance=s;
	}protected void setBalance(){   //잔액수정
		
	}
}
	