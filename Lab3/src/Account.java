import java.util.Scanner;

abstract class Account implements Valuable {
	private double balance;
	
	public Account(double _balance){
		balance=_balance;
	}
	
	public double getBalance(){  //�ܾ�ȯ��  �б�
		return balance;
	}
	public void debit(double s){    //���
		balance-=s;
		if(balance<0){
			System.out.print("Debit amount exceeded account balance\n");
			balance+=s;
		}
	}
	public void credit(double s){  //�Ա�
		balance+=s;
	}
	protected void setBalance(double s){   //�ܾ׼���  ����
		balance=s;
	}
	abstract double getWithdrawableAccount();
	
	abstract void passTime(int month);
	
}
	