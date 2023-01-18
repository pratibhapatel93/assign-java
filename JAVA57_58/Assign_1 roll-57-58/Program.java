class Program{

	public static void main(String[] args){
	//declaring vars
	int id,age,hours;
	double rate;
	//getting data from cmd
	id = Integer.parseInt(args[0]);
	age = Integer.parseInt(args[1]);
	hours = Integer.parseInt(args[2]);
	rate = Double.parseDouble(args[3]);
	//obj
	Employee e1 = new Employee(id,age,hours,rate);
	e1.PrintEmployee();
	
	}	

}
