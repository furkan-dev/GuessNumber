//
//
// coder : furkan-dev
//
// licensed by gnu-general-license
//
//

import java.util.Scanner;

public class HelloWorld {
	
	public static void main (String args[]){
		
		System.out.println("-----------------------------Welcome-----------------------------");
		
		System.out.println("Aklýnýzdan bir sayý tutun..");
		
		System.out.println("Bu sayýyý 3 ile çarpýn..");
		
		System.out.println("Þimdi elde ettiðiniz sonuca 2 ekleyin..");
		
		System.out.println("Bu sonucu da 5 ile çarpýn..");
			
		System.out.println("Son olarak son elde ettiðiniz sayýdan 2 çýkarýn ve son sonucu buraya yazýn: ");
		
		Scanner input = new Scanner(System.in);
		
		int sonuc = input.nextInt();
		
		int tutulanSayi;
		
		tutulanSayi = (((sonuc + 2) / 5) - 2) / 3;
		
		System.out.print(tutulanSayi);
		
		

	}
}