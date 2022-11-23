package variable_arguments;

public class MainVarArgs {
	public static void main(String[] args) {
		//int[] i={10,20,30,40,50,60,70,80,90,5645}
		
		int i = sum(10,20,30,40,50,60,70,80,90,5645);
		System.out.println(i);
		
	}
	
	static int sum(int...i) {
		int result=0;
		for(int a:i) {
			result+=a;
		}
		return result;
		
	}
	
	
	
	/*static int sum(int a, int b) {
		int result=0;
		result=a+b;
		return result;
	}
	
	static int sum(int a,int b,int c) {
		int result=0;
		result=a+b+c;
		return result;
	}*/
	
}
