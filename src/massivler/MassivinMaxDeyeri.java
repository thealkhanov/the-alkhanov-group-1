package massivler;

public class MassivinMaxDeyeri {
public static void main(String[] args) {
	
	int enBoyuk=0;
	int[] a = new int [] {10,20,30,40,50};
	
	for(int i:a) {
		if(i>enBoyuk) {
			enBoyuk=i;
		}
	}
	System.out.println(enBoyuk);
}
}
