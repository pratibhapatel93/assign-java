import hospital.Patient;
import hospital.InHousePatient;

class Program{
	
	public static void displayPatient(Patient p){	
		System.out.println("*********************************");	
		System.out.printf("Patient ID   : %d%n",p.getPatientId());
		System.out.printf("Patient Name : %s%n",p.getPatientName());
		System.out.printf("Bed Type     : %d%n",p.getBedType());
		System.out.printf("No Of Days   : %d%n",p.getNoOfDays());
		System.out.println("----------------------------------");
		System.out.printf("Total bill   : %f%n",p.getBillAmount());
		System.out.println("**********************************");
		System.out.printf("%n%n");	
	
	}

	public static void main(String[] args){
		Patient p1 = new Patient(100,"pushpak",1,10);
		InHousePatient p2 = new InHousePatient(200,"Siddhant",1,10,20);

		displayPatient(p1);
		displayPatient(p2);
	}	

}
