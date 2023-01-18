import store.*;
class Program{

public static void main(String[] args){
	//entering items and used items
	ShoppingCart cart = new ShoppingCart();
	//Id ,cost-d,qty,dis%
	System.out.println("Entering items into list.");
	cart.addItem(new Item(1,100,5));
	cart.addItem(new Item(2,90,4));
	cart.addItem(new Item(3,80,3));
	cart.addItem(new Item(4,50,2));
	cart.addItem(new Item(5,10,1));
	cart.addItem(new Item(6,20,0));
	cart.addItem(new Item(7,100,1));
	cart.addItem(new Item(8,105,2));
	cart.addItem(new Item(9,140,3));
	cart.addItem(new Item(10,180,4));
	cart.addItem(new Item(10,180,5));
	cart.addItem(new UsedItem(1,100,5,40));
	cart.addItem(new UsedItem(2,90,4,99));
	cart.addItem(new UsedItem(3,80,3,90));
	cart.addItem(new UsedItem(4,50,2,80));
	cart.addItem(new UsedItem(5,10,1,70));
	cart.addItem(new UsedItem(6,20,0,60));
	cart.addItem(new UsedItem(7,100,1,50));
	cart.addItem(new UsedItem(8,105,2,40));
	cart.addItem(new UsedItem(9,140,3,30));
	cart.addItem(new UsedItem(10,180,4,20));
	cart.addItem(new UsedItem(10,180,5,10));
	
	System.out.println("Total price of cart : "+cart.CartPrice());
	System.out.println("Deleting first 5 items in cart.");
	
	cart.removeItem(0);
	cart.removeItem(0);
	cart.removeItem(0);
	cart.removeItem(0);
	cart.removeItem(0);

	System.out.println("Total price of cart now: "+cart.CartPrice());
	System.out.println("Total number of used items in cart: "+cart.NoOfUsedItem());
	
	

}

}
