package my.math;

public class MathUtil{
	
	//advance methods
	public static boolean isEven(int n){
		return n%2 == 0;
	}
	public static boolean isOdd(int n){
		return n%2 != 0;
	}
	public static boolean isPrime(int n){
		//n==1 - false
		//n==2 or 3 - true
		if(n==1){return false;}
		if(n==2 || n==3){return true;}

		for(int i=3;i<n;++i){
			if(n%i == 0){
				return false;
			}
		}

		return true;
	}
	public static int countPrime(int n,int m){
		int lower,higher,count=0;
		if(n<m){
			lower = n;
			higher = m;
		}else{
			lower = m;
			higher = n;
		}
		for(int i=lower;i<higher;i++){
			if(isPrime(i)){
				count+=1;
			}
		}		
		return count;
	}
	public static int reverse(int n){
		int x = 0;
		int digit = 0;
		while(n>0){
			digit = n%10;
			x = x*10+digit;
			n = n/10;
		}
		return x;
	}
	public static int digitsCount(int n){
		int digits = 0;
		do{
			n = n/10;
			digits += 1;
		}while(n>0);

		return digits;
	}

}
