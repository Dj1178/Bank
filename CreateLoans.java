//Daniel Jazowski
//This is a main file that creates 5 different loans and prints them to the console.

import javax.swing.JOptionPane;


public class CreateLoans {

	public static void main(String[] args) {
		Loan[] list= new Loan[5];
		JOptionPane.showMessageDialog(null, "Welcome to your online bank.");
		double primeInterestRate= Double.parseDouble(JOptionPane.showInputDialog("What is the current prime interest rate?")); 
		for(int i=0;i<5;i++) {
			int opt = Integer.parseInt(JOptionPane.showInputDialog("What kind of loan would you like to have? [1]Business or [2]Personal"));
			if(opt!=1&&opt!=2) {
				while(true) {
					opt = Integer.parseInt(JOptionPane.showInputDialog("Please enter a 1 or a 2"));
					if(opt==1||opt==2) {
						break;
					}
				}
			}
			int a = Integer.parseInt(JOptionPane.showInputDialog("Please enter a loan number."));
			String b= JOptionPane.showInputDialog("Please enter your last name.");
			
			int c = Integer.parseInt(JOptionPane.showInputDialog("Please enter a loan amount under 500,000."));
			
			while(c>500000) {
				c=Integer.parseInt(JOptionPane.showInputDialog("Please enter a loan amount less than 500,000."));
				if(c<=500000) {
					break;
				}
			}
			int d= Integer.parseInt(JOptionPane.showInputDialog("Please enter a term length, 1 years, 3 years, or 5 years."));
			if(opt==1) {
				BusinessLoan bl= new BusinessLoan(a,b,c,d,primeInterestRate);
				list[i]=bl;
			}else if(opt==2) {
				PersonalLoan pl= new PersonalLoan(a,b,c,d,primeInterestRate);
				list[i]=pl;
			}
		}
		for(int i=0;i<5;i++) {
			JOptionPane.showMessageDialog(null, list[i].toString());
		}
	}

}
