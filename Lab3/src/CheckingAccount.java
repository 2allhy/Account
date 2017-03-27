public class CheckingAccount extends Account{
    
	private double credit_limit;
	private double interest;  //이자
	private double loan_interest;  //대출이자
	
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
	
	public void nextMonth(){
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest));
		}else if(getBalance()<0){
			setBalance(getBalance()*(1+loan_interest));
		}
	}
	public CheckingAccount(int balance, setCreditLimit(), SetInterest(), loan,interest)
	public double getWithdrawableAccount(){
	
	}
	public void passTime(int a){
		getBalance()*(1
	}

}