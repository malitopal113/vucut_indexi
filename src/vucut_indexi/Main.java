package vucut_indexi;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kilo;
		double boy, index;
		
		
		
		System.out.println("Vücut Indexi Hesaplama");
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
		boy = input.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = input.nextInt();
		
		index = kilo / (boy * boy);
		
		System.out.println("Vücut Kitle İndeksiniz: " + index);
				

	}

}
