import bank.*;
 
class program {
 	public static double GetTotalEMI(Loan[] l){
		double totalEMI = 0;
		for(int i = 0; i<l.length; ++i){
			totalEMI+=l[i].getEMI();
		}
		return totalEMI;
	}

 	public static double GetTotalPrinciple(Loan[] l){
		double totalPrinciple = 0;
		for(int i = 0; i<l.length; ++i){
			totalPrinciple+=l[i].Getprinciple();
		}
			return totalPrinciple;
	}

	public static void main(String[] args){
		
		Loan[] loan = {
			new HomeLoan(50000,2),
			new PersonalLoan(70000,5),
			new HomeLoan(50000,2),
			new PersonalLoan(70000,5),
			new HomeLoan(50000,2),
			new PersonalLoan(70000,5),
			new HomeLoan(50000,2),
			new PersonalLoan(70000,5)};
	
		System.out.printf("Total EMI %f%n.",GetTotalEMI(loan));
	
		System.out.printf("Total Principle %f%n.",GetTotalPrinciple(loan));
	
	}

}


