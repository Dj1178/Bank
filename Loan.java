//Daniel Jazowski
//This is an abstract super class that implement LoanConstants
public abstract class Loan implements LoanConstants{
	private int loanNumber;
	private String lastName;
	private double numLoan;
	private double interestRate;
	private double term;
	
	public Loan(int a, String b, double c, double d) {
		loanNumber=a;
		lastName=b;
		numLoan=c;
		if(d!=shortTerm||d!=mediumTerm||d!=longTerm) {
			term=shortTerm;
		}else {
			term=d;
		}
	}
	
	public String toString() {
		return "A loan with the number "+loanNumber+", last name: "+ lastName+", loan amount: "+numLoan+" and a term of "+ term+" years.";
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
