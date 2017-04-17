
public class SavingAccount extends Account {
	private double interest;
	private int month;
	private double estimateMoney;
	
	public SavingAccount(double balance, double interest){
		super(balance);
		this.interest=interest;
	}
	public double getWithdrawableAccount(){
		if(month>12){
			return getBalance();
		}else{
			return 0.0;
		}		
	}
	
	public void debit(double amount)throws Exception{
		if(month<=12){
			throw new Exception("아직 출금할 수 없습니다.");
		}else{
			if(getBalance()-amount>0){
				setBalance(getBalance()-amount);
			}else if(amount<0){
				throw new Exception("음수입력!");
			}
			else{
				System.out.println("한도초과로 출금이 불가능합니다.");
			}
		}
	}
	
	public void passTime(int a){
		month=month +a;
		if(month==12){
			setBalance(getBalance()*Math.pow((1+interest), month));
		}
	}
	public void passTime(){	
		setBalance(getBalance()*0);
	}
	
	public double EstimateValue(int a){
		estimateMoney=getBalance()*Math.pow((1+interest), a);
		return estimateMoney;
	}
	
	public double EstimateValue(){
		estimateMoney=getBalance()*(1+interest);
		return estimateMoney;
	}
	public String toString(){
		return String.format("SavingAccount_Balance: %.2f" , getBalance());
	}
}