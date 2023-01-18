package store;
public class UsedItem extends Item{
	//fields
	private double DiscountPercentage;
	
	//constructor
	public UsedItem(int _id,double _cp,int _qty,double _diss){
		super(_id,_cp,_qty);
		DiscountPercentage = _diss;	
	}
	//methods
	public double SellingPrice(){
		return super.SellingPrice()*(1-DiscountPercentage/100.00);
	}


}
