package massivler;

public class CoxOlculuMassivler {
public static void main(String[] args) {
	
	/*int[] massiv = new int [4];  bir ölçülü massiv
	*/
	
	int [][] array2 = new int [2][3];    //iki ölçülü massiv
	
	array2[0][0]=21;
	array2[0][1]=27;
	array2[0][2]=9;
	
	array2[1][0]=81;
	array2[1][1]=26;
	array2[1][2]=13;
	
	for(int[] i:array2) {
		for(int j:i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
}
}
