package switch_case;

import enum_examples.Cins;

public class MainSwitchCaseEnum {

	public static void main(String[] args) {

		Cins c = Cins.FEMALE;
		
		switch (c) {
		case MALE: {
			System.out.println("Kişi");
		}break;
		case FEMALE: {
			System.out.println("Qadın");
		}break;
		
		default:
			System.out.println("Bilinməyən məlumat");
		}

	}

}
