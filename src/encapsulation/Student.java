package encapsulation;

public class Student {

	public String name = "Tahir";
	public String password = "2022";
	private int score = 81;

	public int giveMeScoreInfo(String pass) {
		if (pass.equals(password)) {
			return score;
		} else {
			return 0;
		}
	}
}
