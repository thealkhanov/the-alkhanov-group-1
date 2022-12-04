package pass_by_value_reference;

public class MainClassPassBy {

	public static void main(String[] args) {
		
		Isci isci1=new Isci();
		maasHesablamaq(isci1);
		System.out.println(isci1.salary);
		
		int salary=150;
		hesabla(salary);
		System.out.println(salary);
	}
	
	
	
	public static void maasHesablamaq(Isci i) {
		i.salary=500;
	}
	
	public static void hesabla(int salary) {
		salary=11;
	}
	
}
