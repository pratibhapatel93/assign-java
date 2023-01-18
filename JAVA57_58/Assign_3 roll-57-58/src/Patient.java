package hospital;

public class Patient{

	//fields
	private int patientId;
	private String patientName;
	private int bedType;
	private int noOfDays;

	//constructos
	public Patient(int id,String name,int bed,int days){
		patientId = id;
		patientName = name;
		bedType = bed;
		noOfDays = days;
	}

	//access modifiers
	public int getPatientId(){return patientId;}
	public String getPatientName(){return patientName;}
	public int getBedType(){return bedType;}
	public int getNoOfDays(){return noOfDays;}
	
	public void setPatientId(int x){patientId = x;}
	public void setPatientName(String s){patientName = s;}
	public void setBedType(int x){bedType = x;}
	public void setNoOfDays(int x){noOfDays = x;}
	
	//methods
	private int getPricePerDay(){
		int price = 0;
		switch(bedType){
			case 1: 
				price = 500;
				break;
			case 2:
				price = 350;
				break;
			case 3:
				price = 200;
				break;
			default:	
				price =  100;
		}	
		return price;
	}

	public double getBillAmount(){
		double amount;
		amount = noOfDays * getPricePerDay();
		return amount;
	}

}
