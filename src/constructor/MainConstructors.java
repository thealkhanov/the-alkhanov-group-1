package constructor;

public class MainConstructors {

	public static void main(String[] args) {
		
		Computer hp = new Computer();
		hp.brand="Omen";
		hp.price=3000;
		System.out.println(hp.brand);
		
		Computer dell = new Computer();
		int qiymet = dell.price;
		System.out.println(qiymet);
		
		Computer asus = new Computer();
		asus.brand="VivoBook";
		asus.price=1800;
		System.out.println(asus.brand);
		System.out.println(asus.price);
		
	}

}
