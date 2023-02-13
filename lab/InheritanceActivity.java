class Employee{
	long ID;
	String Name;
	String Address;
	long Phone;
	static double basicSalary;
	double specialallowance = 250.80;
	double hra = 1000.50;

Employee(long ID,String Name,String Address,long Phone, double basicSalary,double specialallowance,double hra){  //this is parametetrized

	this.ID = ID;
	this.Name = Name;
	this.Address = Address;
	this.Phone = Phone;
	this.basicSalary = basicSalary;
	this.specialallowance = specialallowance;
	this.hra = hra;
}

public void calculateSalary(){
	double salary = basicSalary + (basicSalary * specialallowance/100) + basicSalary * hra/100;
	System.out.println(ID);
	System.out.println(Name);
	System.out.println(Address);
	System.out.println(Phone);
	System.out.println("The salary is: "+salary);
	
	
}
public void calculateTransportAllowance () {
	double transportAllowance = 10 * basicSalary/100;	
	System.out.println(transportAllowance);


}


}

class Manager extends Employee{

	Manager(long ID, String Name, String Address, long Phone, double basicSalary, double specialallowance, double hra) {
		super(ID, Name, Address, Phone, basicSalary, specialallowance, hra);
	}
		protected double getBasicSalary() {
			return basicSalary;
		}
		protected void setBasicSalary(double basicSalary) {
			Manager.basicSalary = basicSalary;
		}
		
		@Override
		public void calculateTransportAllowance () {
			double transportAllowance = 15 * basicSalary/100;	
			System.out.println(transportAllowance);
		
	
		}
		
	}


class trainee extends Employee{

	trainee(long ID, String Name, String Address, long Phone, double basicSalary, double specialallowance, double hra) {
		super(ID, Name, Address, Phone, basicSalary, specialallowance, hra);
	}
		// TODO Auto-generated constructor stub
		protected double getBasicSalary() {
			return basicSalary;
		}
		protected void setBasicSalary(double basicSalary) {
			Manager.basicSalary = basicSalary;
		}
		
		@Override
		public void calculateTransportAllowance () {
			double transportAllowance = 10 * basicSalary/100;	
			System.out.println(transportAllowance);
		}
	
}

class InheritanceActivity{
	public static void main(String args[]){
	Manager m =new Manager(126534,"Peter","Chennai India",237844,65000, 0, 0);
	m.calculateSalary();
	m.calculateTransportAllowance();

	trainee t = new trainee(29846,"Jack","Mumbai India",442085,45000,0,0);
	t.calculateSalary();
	t.calculateTransportAllowance();
}

	


}