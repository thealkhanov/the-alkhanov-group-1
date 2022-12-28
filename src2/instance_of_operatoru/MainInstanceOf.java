package instance_of_operatoru;

public class MainInstanceOf {

	public static void main(String[] args) {
		//BMW - riyaziyyat, Kia - ədəbiyyat, Car - qutu

		Car c = new Kia();
		
		if(c instanceof Kia) {
			Kia k=(Kia)c;     //c-ni Kia-ya cast etdik
			k.kiaGo();
		}
		
		if(c instanceof BMW) {
			BMW b=(BMW)c;     //c-ni BMW-yə cast etdik
			b.BMWGo();
		}
		
		}

}
