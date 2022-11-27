package hashCode_method;

public class MainHashCodeMethod {
	public static void main(String[] args) {
		
		Book b1=new Book();
		b1.pageCount=423;
		b1.price=10;
		b1.author="Mark Tven";
		System.out.println(b1.hashCode());
		//System.out.println(b1.price);
		
		
	}
}
