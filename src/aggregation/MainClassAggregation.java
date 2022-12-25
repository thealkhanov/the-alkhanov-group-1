package aggregation;

public class MainClassAggregation {

	public static void main(String[] args) {
		
		RAM r=new RAM();
		r.id=2;
		r.size=16;
		
		Computer c = new Computer();
		c.id=1;
		c.model="Acer";
		c.ram=r;
		
		System.out.println(c);
	}

}
