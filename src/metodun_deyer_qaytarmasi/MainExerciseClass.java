package metodun_deyer_qaytarmasi;

public class MainExerciseClass {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.age=25;
		s.name="Adil";
		
		SalaryCalculator calculator = new SalaryCalculator();
		System.out.println("Əvvəlki maaş: "+s.salary);
		//calculator.calculateSalary(s);
		s.salary=calculator.calculateSalary(s); 
		System.out.println("Sonrakı maaş: "+s.salary);
		
		
		calculator.myMethod(1);
		
	}
	
	
	
}
