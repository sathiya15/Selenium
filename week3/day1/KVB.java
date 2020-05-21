package week3.day1;

public class KVB extends RBI {

	public void loanInterestRate(String personalLoan) {
		
		System.out.println("loanInterestRate is : "+personalLoan);
	}
	public static void main(String[] args) {
		KVB kvb = new KVB();
		kvb.loanInterestRate("0%");
		kvb.loanInterestRate("7%");
		
	}
}
