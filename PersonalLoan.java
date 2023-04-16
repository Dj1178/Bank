//Daniel Jazowski
//This is a type of loan that extends the super class Loan.
public class PersonalLoan extends Loan{
	public PersonalLoan(int a, String b, int c, int d, double e) {
		super(a,b,c,d);
		double newInterest= e+2;
		this.setInterestRate(newInterest);
	}
}
