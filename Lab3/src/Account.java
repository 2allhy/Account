
public class Account {
	private double balance;
	public double getBalance(){  //�ܾ�ȯ��
		return balance;
	}
	public void debit(double s){    //���
		balance-=s;
		if(balance<0){
			System.out.printf("Debit amount exceeded account balance\n");
			balance+=s;
		}
	}
	public void credit(double s){  //�Ա�
		balance+=s;
	}
	public Account(double s){
		balance=s;
	}protected void setBalance(){   //�ܾ׼���
		
	}
}
	