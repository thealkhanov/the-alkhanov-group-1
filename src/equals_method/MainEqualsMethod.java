package equals_method;

public class MainEqualsMethod {

	public static void main(String[] args) {
		
		Book b1=new Book();
		b1.name="Java";
		b1.price=150;
		
		Book b2=new Book();
		b2.name="HTML";
		b2.price=150;

		b1=b2;
		boolean b= b1.equals(b2);
		System.out.println(b);
	}

}
