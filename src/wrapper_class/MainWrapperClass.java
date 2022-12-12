package wrapper_class;

public class MainWrapperClass {

	public static void main(String[] args) {
		
		int a=5;
		//a. -> heç nə gəlmədi
		
		Integer a1=5;
		System.out.println("int(eger) a-ların müqayisəsi: "+a1.equals(a));
		
		byte b=4;
		Byte b1=43;
		System.out.println("byte b-lərin müqayisəsi: "+b1.equals(b));
		
		boolean b2=true;
		Boolean b3=true;
		System.out.println(b3.parseBoolean("false"));
		
		int t=10;
		Integer t1=112;
		t=t1; //wrapper class -> primitiv tip = AutoBoxing
		System.out.println("t-nin dəyəri: "+t);

		int p=22;
		Integer p1=66;
		p1=p; //primitiv tip -> wrapper class = UnBoxing
		System.out.println("p1-in dəyəri: "+p1);
		
	}

}
