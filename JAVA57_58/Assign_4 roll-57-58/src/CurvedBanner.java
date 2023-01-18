package bannerpackage;

public class CurvedBanner extends Banner{
	private double radius; 
	//constructors
	public CurvedBanner(){
		super(20,5);
		radius = 0.1;
	}
	public CurvedBanner(double w,double h,double r){
		super(w,h);
		radius = r;
	}

	public double area(){
		return super.area()-0.86*radius*radius;
	}

}
