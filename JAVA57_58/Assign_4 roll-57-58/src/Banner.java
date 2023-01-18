package bannerpackage;

public class Banner{
	//fields
	private double height;
	private double width;
	//constructors
	public Banner(){
		width  = 20;
		height = 5;
	}
	public Banner(double w,double h){
		width = w;
		height = h;
	}

	//methods
	public void resize(double w,double h){
		if(w>=h){
			width = w;
			height = h;
		}
	}
	public double area(){
		double area = 0;		
		area = width * height;
		return area;
	}

}
