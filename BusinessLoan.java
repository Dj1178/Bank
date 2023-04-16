//Daniel Jazowski
//This class is a type of loan that extends the super class loan
public class BusinessLoan extends Loan {
	public BusinessLoan(int a, String b, int c, int d, double e) {
		super(a,b,c,d);
		double newInterest= e+1;
		this.setInterestRate(newInterest);
	}
}
