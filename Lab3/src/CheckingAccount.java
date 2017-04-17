public class CheckingAccount extends Account{
    
	private double credit_limit;
	private double interest;  //����
	private double loan_interest;  //��������
	private double estimateMoney;
	
	public void setCreditLimit(double c){
		credit_limit=c;
	}
	public void setInterest(double i){
		interest=i;
	}
	public void setLoanInterest(double l){
		loan_interest=l;
	}

	
	@Override
	public void debit(double amount)throws Exception{
		if(getBalance()-amount<-credit_limit){
			throw new Exception("Can't debit\n");
		}else if(amount<0){
			throw new Exception("�����Է�! ");
		}
		else if(getBalance()-amount>=-credit_limit){
			setBalance(getBalance()-amount);
		}
	}
	
	public void nextMonth(){   //�Ѵ��� ������ �ܾ׺���
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest));
		}else if(getBalance()<0){
			setBalance(getBalance()*(1+loan_interest));
		}
	}
	public CheckingAccount(double balance, double limit, double interest, double loaninterest){
		super(balance);
		credit_limit=limit;
		this.interest=interest;
		loan_interest=loaninterest;				
	}
	
	public double getWithdrawableAccount(){    //���� ��� ������ �ݾ� Ȯ��
		if(getBalance()>-credit_limit){
			return getBalance() + credit_limit;
		}else{
			return 0.0;
		}
	}
	public void passTime(int month){      //�ش�Ⱓ�� ������ ���ڰ��
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest*month));
		}else if(getBalance()<0){
			setBalance(getBalance()*(1+loan_interest*month));
		}
	}
	
	public void passTime(){
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest));
		}else if(getBalance()<0){
			setBalance(getBalance()*(1+loan_interest));
		}
	}
	
	public boolean isBankrupted(){   //����ݾ��� �Ļ��ߴ��� �˷���
		if(getBalance()<-credit_limit){
			return true;
	}else{
		return false;
	}
	}
	public double EstimateValue(int month){
		if(getBalance()>0){
			for(int i=0; i<month; i++){
				estimateMoney=(getBalance()*(1+interest));
				setBalance(getBalance()*(1+interest));
			}
		}return estimateMoney;
	}
	
	public double EstimateValue(){
		if(getBalance()>0){
			estimateMoney=(getBalance()*(1+interest));
		}return estimateMoney;		
	}
	public String toString(){
		return String.format("CheckingAccount_Balance: %.2f" , getBalance());
	}
}