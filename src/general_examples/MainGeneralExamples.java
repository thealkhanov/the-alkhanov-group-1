package general_examples;

public class MainGeneralExamples {

	public static void main(String[] args) {

		String mySentence = "Java çox önəmli bir proqramlaşdırma dilidir";
		String yekunNetice = "";
		System.out.println(mySentence);

		String[] sozlerMassivi = mySentence.split(" ");
		for (String soz : sozlerMassivi) {
			char ilkSimvol = soz.charAt(0); //J ç ö b p d
			ilkSimvol=Character.toUpperCase(ilkSimvol);  //J Ç Ö B P D
			String alinanSoz = ilkSimvol + soz.substring(1); // Ö + nəmli
			yekunNetice += alinanSoz+" ";
		}
		System.out.println(yekunNetice);
	}

}
