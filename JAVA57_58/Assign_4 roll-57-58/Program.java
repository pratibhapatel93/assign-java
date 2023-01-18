
	public static void main(String[] args){
		double w=0,h=0,r=0;
		try{
			w = Double.parseDouble(args[0]);
			h = Double.parseDouble(args[1]);
			r = Double.parseDouble(args[2]);
		}catch(Exception e){
			System.out.println("Please Enter Height and width");
			return;
		}	
		CurvedBanner cb = new CurvedBanner(w,h,r);
		System.out.printf("Area of Banner is : %f%n",getArea(cb));
		
	}

}
