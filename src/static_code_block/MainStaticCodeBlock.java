package static_code_block;

public class MainStaticCodeBlock {

	public static void main(String[] args) {
		
		//MainStaticCodeBlock m1=new MainStaticCodeBlock();
		//MainStaticCodeBlock m2=new MainStaticCodeBlock();
		//MainStaticCodeBlock m3=new MainStaticCodeBlock();
		//MainStaticCodeBlock m4=new MainStaticCodeBlock();
	
	}
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	static{
		System.out.println("static 1");
		sayHello();
	}
	
	static {
		System.out.println("static 2");
	}
	
	static {
		System.out.println("static 3");
	}

}
