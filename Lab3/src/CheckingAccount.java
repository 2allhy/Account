public class CheckingAccount extends Account{
	super(balance);
	private double credit_limit;
	private double interest;  //����
	private double loan_interest;  //��������
	
	double balance;
	public void debit(double s){
		if(s>credit_limit){
			System.out.print("Can't debit\n");
		}
		if(balance<0){
			System.out.print("Debit amount exceeded account balance\n");
		}
	}
	
	public void nextMonth(){
		if(balance>0){
			balance=balance+balance*interest;
		}
		if(balance<0){
			balance=balance+ balance*loan_interest;
		}
	}
}