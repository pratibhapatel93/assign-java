import series.*;

class Program{

static double compute(Sequence seq,int n){
	
	if(seq instanceof Resetable rst){
		rst.Reset();
	}
	return	seq.Sum(n);

}

public static void main(String[] args){
	int n;
	try{
		n = Integer.parseInt(args[0]);
	}catch(Exception e){
		System.out.printf("Please enter no. terms :%n");
		return;
	}
	
	LinearSequence ls = new LinearSequence(2,5);
	PowerSequence ps = new PowerSequence(3);
	
	System.out.printf("Sum of LinearSequence : %f%n",compute(ls,n));
	System.out.printf("Sum of PowerSequence : %f%n",compute(ps,n));
	System.out.println("After Second itteration");
	System.out.printf("Sum of LinearSequence : %f%n",compute(ls,n));
	System.out.printf("Sum of PowerSequence : %f%n",compute(ps,n));

}


}
