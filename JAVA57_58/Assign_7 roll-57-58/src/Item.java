package store;

public class Item{
	//members
	private int Id;
	private double CostPerUnit;
	private int Qty;

	//constructor
	public Item(int _id, double _cp,int _qty){
		Id = _id;
		CostPerUnit = _cp;
		Qty = _qty; 
	}
	//methods
	public double SellingPrice(){
		return CostPerUnit * 1.10;
	}

}
