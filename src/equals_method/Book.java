package equals_method;

public class Book {

	int price;
	String name;
	
	@Override
	public boolean equals(Object o) {
		
		Book b=(Book)o;
		if(this.name == b.name && this.price == b.price) {
			return true;
		}
		return false;
	}
	
	
}
