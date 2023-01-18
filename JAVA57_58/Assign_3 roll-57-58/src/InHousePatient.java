package hospital;

public class InHousePatient extends Patient{
	//fields
	private float discount;

	//accessors
	public float getDiscount(){
		return discount;
	}
	public void setDiscount(float _discount){
		discount = _discount;
	}

	public InHousePatient(int id,String s,int bed,int days,float dis){
		super(id,s,bed,days);
		discount = dis;
	}
	
	public double getBillAmount(){
		double amount = super.getBillAmount();
		amount = amount - amount * discount/100;
		return amount;		
	}
}
