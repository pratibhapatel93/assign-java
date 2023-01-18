class Employee{
	//data members
	private int eid;
	private int age;
	private int hours;
	private double rate;

	//consatructors
	public Employee(){
		eid = 100;
		age = 25;
		hours = 62;
		rate = 250;
	}
	public Employee(int _eid,int _age,int _hours,double _rate){
		eid = _eid;
		age = _age;
		hours = _hours;
		rate = _rate;
	}

	//methods
	public double getNetIncome(){
		double netIncome;
		int overTime = 0;
		if(hours>56){
			overTime = hours - 56;
		}
		netIncome = hours*rate+overTime*100;
		return netIncome;
	}

	public void PrintEmployee(){
		System.out.println("****************************");
		System.out.printf("Printing Employee's data\n");
		System.out.printf("Employee's ID          : %d\n",eid);
		System.out.printf("Employee's Age         : %d\n",age);
		System.out.printf("Employee's total hours : %d\n",hours);
		System.out.printf("Employee's hourly rate : %f\n",rate);
		System.out.printf("Employee's NET INCOME  : %f\n",getNetIncome());
		System.out.println("****************************");
	}

}
