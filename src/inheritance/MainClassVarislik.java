package inheritance;

public class MainClassVarislik {

	public static void main(String[] args) {
		
		Computer toshiba = new Computer();
		toshiba.model="Satelitte C50";
		toshiba.hardDisk=500;
		toshiba.operationSystem="FreeDos";
		toshiba.prosessor="Intel Core i3";
		toshiba.RAM=4;
		toshiba.printInfo();
		
		System.out.println("------------------------------------------------------");
		
		HP proBook = new HP();
		proBook.model="G8-640";
		proBook.hardDisk=512;
		proBook.operationSystem="Windows 10";
		proBook.prosessor="Intel Core i5";
		proBook.RAM=16;
		proBook.color="Qara";
		proBook.printInfo();
		
		System.out.println("------------------------------------------------------");
		
		Acer nitro = new Acer();
		nitro.model="AN515";
		nitro.hardDisk=512;
		nitro.operationSystem="Windows 11";
		nitro.prosessor="Intel Core i5";
		nitro.RAM=16;
		nitro.color="Qara";
		nitro.weight=1;
		nitro.printInfo();
		
		System.out.println("------------------------------------------------------");
		
		Asus tuf = new Asus();
		tuf.model="F15";
		tuf.hardDisk=512;
		tuf.operationSystem="Windows 11";
		tuf.prosessor="Intel Core i7";
		tuf.RAM=16;
		tuf.color="Boz";
		tuf.weight=2;
		tuf.printInfo();
	}

}
