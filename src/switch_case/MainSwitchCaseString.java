package switch_case;

public class MainSwitchCaseString {

	public static void main(String[] args) {

		String bal = "a".toUpperCase();
		
		switch (bal) {
		case "E": {
			System.out.println("Çox zəif");
		}break;
		case "D": {
			System.out.println("Zəif");
		}break;
		case "C": {
			System.out.println("Kafi");
		}break;
		case "B": {
			System.out.println("Yaxşı");
		}break;
		case "A": {
			System.out.println("Əla");
		}break;
		default:
			System.out.println("Siyahıda olmayan bal");
		}

	}

}
