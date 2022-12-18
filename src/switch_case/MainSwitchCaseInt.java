package switch_case;

public class MainSwitchCaseInt {

	public static void main(String[] args) {

		int qiymet = 7;
		
		switch (qiymet) {
		case 1: {
			System.out.println("Çox zəif");
		}break;
		case 2: {
			System.out.println("Zəif");
		}break;
		case 3: {
			System.out.println("Kafi");
		}break;
		case 4: {
			System.out.println("Yaxşı");
		}break;
		case 5: {
			System.out.println("Əla");
		}break;
		default:
			System.out.println("Siyahıda olmayan qiymət");
		}

	}

}
