package string_builder;

public class MainStringExercises {

	public static void main(String[] args) {
		
		System.out.println("D�vr ba�lad�");
		String s="Java";
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<100000000;i++) {
			//s+="Java";  -> Java, JavaJava, JavaJavaJava, JavaJavaJavaJava
			sb.append("Java");
		}
		System.out.println("D�vr bitdi");
	}

}
