package bank;
public abstract class Loan{
      private double principle;	
      private double period;
   
	//constructor
	public Loan (double principle,double period)
        {
              this.principle = principle;
	      this.period = period;
        }
       // getter setter
        public double Getprinciple(){
		return principle;
	}
 	public void setprinciple(double principle) {
               this.principle = principle;
	}

        public double Getperiod(){
		return period;
	}
	public void setperiod(double period){
		this.period = period;
	}
        //methods   
       	public double getrate(){
		return 5;
	}
        
       	public double getEMI() 
        {
          double emi;
          emi = principle*(1+getrate()*period/100)/(12*period);
	  return emi;
        } 
} 
