public class CheckingAccount extends Account{
    
	private double credit_limit;
	private double interest;  //이자
	private double loan_interest;  //대출이자
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
	public void debit(double s){
		if(getBalance()-s<-credit_limit){
			System.out.print("Can't debit\n");
		}else if(getBalance()-s>=-credit_limit){
			setBalance(getBalance()-s);
		}
	}
	
	public void nextMonth(){   //한달이 지난후 잔액변동
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
	
	public double getWithdrawableAccount(){    //현재 출금 가능한 금액 확인
		if(getBalance()-credit_limit>0){
			return getBalance() + credit_limit;
		}else{
			return 0.0;
		}
	}
	public void passTime(int month){      //해당기간이 지난후 이자계산
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest));
		}else if(getBalance()<0){
			setBalance(getBalance()*(1+loan_interest));
		}
	}
	
	public boolean isBankrupted(){   //현재금액이 파산했는지 알려줌
		if(getBalance()<-credit_limit){
			return false;
	}else{
		return true;
	}
	}
	public double EstimateValue(int month){
		if(getBalance()>0){
			for(int i=0; i<month; i++){
				setBalance(getBalance()*(1+interest));
			}
		}return getBalance();
	}
	public String toString(){
		return String.format("CheckingAccount_Balance: %.2f" , getBalance());
	}
}