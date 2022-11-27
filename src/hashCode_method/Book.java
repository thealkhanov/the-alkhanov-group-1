package hashCode_method;

import java.util.Objects;

public class Book {
	
	int pageCount;
	int price;
	String author;
	
	@Override
	public int hashCode() {
		return Objects.hash(author, pageCount, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && pageCount == other.pageCount && price == other.price;
	}
	
}
