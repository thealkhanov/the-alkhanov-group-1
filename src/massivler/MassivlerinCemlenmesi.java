package massivler;

public class MassivlerinCemlenmesi {
public static void main(String[] args) {
	
	int [] myMassiv = {1,2,3,4,5,6,7,8,9};

	int massivSumElements=0;
	for (int i = 0; i < myMassiv.length; i++) {
		massivSumElements+=myMassiv[i];
	}
	System.out.println(massivSumElements);
}
}
