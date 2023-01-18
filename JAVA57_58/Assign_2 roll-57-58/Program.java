import my.math.*;
class Program{

	public static void main(String[] args){
		// getting vars
		int n = 0;
		int m = 0;	

		//checking if user has given arguments	
		if(args.length<=0){
			System.out.println("Inputs Not Found");
			return;
		}
		
		//getting args from command line
		n = Integer.parseInt(args[0]);		
		if(args.length>1){
			m = Integer.parseInt(args[1]);
		}


		//is even
		if(MathUtil.isEven(n)){
			System.out.println("Given Number is Even");
		}
		//is odd
		if(MathUtil.isOdd(n)){
			System.out.println("Given Number is Odd");
		}
		//is prime
		if(MathUtil.isPrime(n)){
			System.out.println("Given Number is Prime");
		}else{
			System.out.println("Given Number is not Prime");
		}
		//is prime count
		if(args.length>=2){
			System.out.printf("Number of Prime Numbers Between %d - %d : %d%n",n,m,MathUtil.countPrime(n,m));
		}
		//reverse
		System.out.printf("Reverse : %d %n",MathUtil.reverse(n));
		//digits count
		System.out.printf("Number of Digits in %d : %d %n",n,MathUtil.digitsCount(n));
	}


}
