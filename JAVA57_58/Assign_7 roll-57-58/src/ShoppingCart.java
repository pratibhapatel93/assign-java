package store;
import java.util.*;

public class ShoppingCart{

	private List<Item> itemList = new ArrayList<Item>();
	
	//methods	
	public boolean addItem(Item i){
		return itemList.add(i);

	}

	public boolean removeItem(int i){
		try{
			itemList.remove(i);
		}catch(Exception e){
			System.out.println("ERROR : Cannot remove the item at given position");
			System.out.println("Exception: "+e);
		return false;
		}
		return true;
	}
	
	public double CartPrice(){
		double totalPrice = 0;
		totalPrice = itemList.stream()
			.mapToDouble(i->i.SellingPrice())
			.sum();
		if(totalPrice>50000){
			totalPrice = totalPrice*0.95;
		}else if(totalPrice>100000){
			totalPrice = totalPrice*0.9;
		}
			
		return totalPrice;
	}
	
	public int NoOfUsedItem(){
		int sum = 0;
		for(int i=0;i<itemList.size();++i){
			if(itemList.get(i) instanceof UsedItem){
				++sum;
			}
		}
		return sum;			
	}
}





