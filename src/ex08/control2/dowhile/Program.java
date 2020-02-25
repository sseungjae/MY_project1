package ex08.control2.dowhile;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner rd = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while (true) {
		//------------己利 涝仿何盒------------
		System.out.println("ΓΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΔ");
		System.out.println("Β    school record input      Β");
		System.out.println("ΖΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΕ");
		
		do {
			System.out.print("\t language1:");
			kor1 = rd.nextInt();
			
			if (kor1<=0 || 100<kor1)
				System.out.println("Out of range(0~100)");

		}while(kor1<=0 || 100<kor1);
		
		do {
			System.out.print("\t language2:");
			kor2 = rd.nextInt();
			
			if (kor2<=0 || 100<kor2)
				System.out.println("Out of range(0~100)");

		}while(kor2<=0 || 100<kor2);
		
		do {
			System.out.print("\t language3:");
			kor3 = rd.nextInt();
			
			if (kor3<=0 || 100<kor3)
				System.out.println("Out of range(0~100)");

		}while(kor3<=0 || 100<kor3);		
		
		//------------己利 免仿 内靛------------
	
		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;
		
		System.out.println("ΓΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΔ");
		System.out.println("Β       school record         Β");
		System.out.println("ΖΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΕ");
		
		System.out.printf("\t language1 : %3d\n", kor1);
		System.out.printf("\t language2 : %3d\n", kor2);
		System.out.printf("\t language3 : %3d\n", kor3);
		
		System.out.printf("\t total score : %3d\n", total);
		System.out.printf("\t average : %6.2f\n", avg);
		System.out.println("ΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑ");
		}
	
	}
}