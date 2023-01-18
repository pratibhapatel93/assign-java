package series;
public abstract class Sequence{

public double Sum(int count){
	double total = 0;
	for(int i=0;i<=count;++i){
		total += Next();
	}
	return total;
	
}

//abstract method
public abstract double Next();

}
