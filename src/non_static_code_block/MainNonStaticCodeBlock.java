package non_static_code_block;

public class MainNonStaticCodeBlock {

	{
	System.out.println("Object code block-1");	
	}
	
	{
	System.out.println("Object code block-2");	
	}
	
	
	public static void main(String[] args) {
		
		MainNonStaticCodeBlock m1=new MainNonStaticCodeBlock();
		MainNonStaticCodeBlock m2=new MainNonStaticCodeBlock();
		MainNonStaticCodeBlock m3=new MainNonStaticCodeBlock();
	}

}
