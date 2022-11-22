package methods;

public class MainMethodOverloading {
public static void main(String[] args) {
	
	MainMethodOverloading m = new MainMethodOverloading();
	m.sum(3, 5);
	
}
	
public void sum(int a, int b) {
	System.out.println(a+b);
}

public void sum(String a, int b, int c) {
	
}

public void sum(String a, int b) {
	System.out.println("salam");
}

public void sum(String a,String b) {
	
}

}
