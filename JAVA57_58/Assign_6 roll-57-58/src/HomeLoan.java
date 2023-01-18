package bank;

public class HomeLoan extends Loan implements Discountable{
	//constructor
	public HomeLoan(double _principle, float _period ){
	        super(_principle,_period);
	}
	public double getdiscount(){
		return super.getEMI()*0.95;	
	}
 	public float GetRate(){
	      float rate;
	
	if(super.Getprinciple()<=2000000){
		rate = 10;
	}
        else
	{
		rate = 11;
	}
 	//rate +1%if princ > 250000
	
	if(super.Getprinciple()>25000){
		rate = rate+1;
	}
	return rate;
	}
}
