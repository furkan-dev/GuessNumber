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
		
		System.out.println("Akl�n�zdan bir say� tutun..");
		
		System.out.println("Bu say�y� 3 ile �arp�n..");
		
		System.out.println("�imdi elde etti�iniz sonuca 2 ekleyin..");
		
		System.out.println("Bu sonucu da 5 ile �arp�n..");
			
		System.out.println("Son olarak son elde etti�iniz say�dan 2 ��kar�n ve son sonucu buraya yaz�n: ");
		
		Scanner input = new Scanner(System.in);
		
		int sonuc = input.nextInt();
		
		int tutulanSayi;
		
		tutulanSayi = (((sonuc + 2) / 5) - 2) / 3;
		
		System.out.print(tutulanSayi);
		
		

	}
}