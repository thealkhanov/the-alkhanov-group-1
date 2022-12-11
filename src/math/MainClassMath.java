package math;

public class MainClassMath {

	public static void main(String[] args) {
		
		double myENumber=Math.E;
		double myPiNumber=Math.PI;
		double myOwnPiNumber=3.14;
		double kesrEdedYuxari=2.1;
		double kesrEdedAsagi=92.9;
		double myPersonalNumber=5.5;
		double kokaltiOlacaqEdedim=9;
		double ucuncuDerecedenKokalti=27;
		
		
		System.out.println("E ədədinin dəyəri: "+myENumber);
		System.out.println("Pi ədədinin dəyəri: "+myPiNumber);
		System.out.println("Mənim öz yazdığım pi ədədi: "+myOwnPiNumber);
		System.out.println("Modulun çıxardığı nəticə: "+Math.abs(-10));
		System.out.println("Yuxarıya doğru yuvarlaqlaşdırma: "+Math.ceil(kesrEdedYuxari));
		System.out.println("Aşağıya doğru yuvarlaqlaşdırma: "+Math.floor(kesrEdedAsagi));
		System.out.println("İki ədəddən böyük olanı: "+Math.max(36.100551, 36.1001256));
		System.out.println("İki ədəddən kiçik olanı: "+Math.min(13, 5));
		System.out.println("Yazılan iki ədədin qüvvəti: "+Math.pow(36, 4)); //ilk daxil odlunan:rəqəm,ikinci:qüvvət
		System.out.println("[0-1) arasındakı random ədəd: "+Math.random());
		System.out.println("Yuvarlaqlaşdırılan ədəd: "+Math.round(myPersonalNumber));
		System.out.println("Daxil edilən ədədin kökaltı nəticəsi: "+Math.sqrt(kokaltiOlacaqEdedim));
		System.out.println("Daxil edilən ədədin 3-cü dərəcədən kökaltısı: "+Math.cbrt(ucuncuDerecedenKokalti));
		
		
		
	}
	
}
