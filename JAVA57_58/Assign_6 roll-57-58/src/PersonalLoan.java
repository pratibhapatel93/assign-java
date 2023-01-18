package bank;
public class PersonalLoan extends Loan implements Taxable {
	//constructor
	public PersonalLoan(double pri, double per){
	  	super(pri, per);
	}
	
	public double gettax() {
		return super.getEMI() * 1.05;
	} 
	
	public double getrate() {
		double rate;
		if(super.Getprinciple() <= 500000) {
			rate = 15;
		}
		else {
			rate = 16;
		}
	return rate;
	}
	
	
}
