package switch_case;

public class MainSwitchCaseChar {

	public static void main(String[] args) {

		char bal = 'a';
		
		switch (bal) {
		case 'e': {
			System.out.println("Çox zəif");
		}break;
		case 'd': {
			System.out.println("Zəif");
		}break;
		case 'c': {
			System.out.println("Kafi");
		}break;
		case 'b': {
			System.out.println("Yaxşı");
		}break;
		case 'a': {
			System.out.println("Əla");
		}break;
		default:
			System.out.println("Siyahıda olmayan bal");
		}

	}

}
