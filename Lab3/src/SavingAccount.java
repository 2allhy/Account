
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
	
	public void debit(double money){
		if(month<=12){
			System.out.println("아직 출금할 수 없습니다.");
		}else{
			if(getBalance()-money>0){
				setBalance(getBalance()-money);
			}else{
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
	public double EstimateValue(int a){
		setBalance(getBalance()*Math.pow((1+interest), a));
		return getBalance();
	}
	public String toString(){
		return String.format("SavingAccount_Balance: %.2f" , getBalance());
	}
}