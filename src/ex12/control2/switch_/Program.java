package ex12.control2.switch_;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		
			int kor1, kor2, kor3;
			int total;
			float avg;
			int menu;
			
			Scanner rd = new Scanner(System.in);
			
			kor1 = 0;
			kor2 = 0;
			kor3 = 0;
			
			over: 
			while (true) {
			//���� �޴�
			System.out.println("��������������������������������������������������������������");
			System.out.println("��          main menu          ��");
			System.out.println("��������������������������������������������������������������");
			System.out.println("\t 1.school record input");
			System.out.println("\t 2.school record");
			System.out.println("\t 3.finish");
			System.out.print("\t>");
			menu = rd.nextInt();
			
			switch(menu) {
			
			case 1:
				//------------���� �Էºκ�------------
				System.out.println("��������������������������������������������������������������");
				System.out.println("��    school record input      ��");
				System.out.println("��������������������������������������������������������������");
				
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
			
			
			case 2:
				//------------���� ��� �ڵ�------------
			
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;
				
				System.out.println("��������������������������������������������������������������");
				System.out.println("��       school record         ��");
				System.out.println("��������������������������������������������������������������");
				
				//for(int n=1; n<3; n++)
				for(int i = 0; i<3; i++)
					System.out.printf("\t language%d : %3d\n", i+1, kor1);
		
				System.out.printf("\t total score : %3d\n", total);
				System.out.printf("\t average : %6.2f\n", avg);
				System.out.println("������������������������������������������������������������");
				
				break;
			case 3:
					break over;
			default:
					System.out.println("error");
			
			}
		
		}
			System.out.println("good bye~");
	}
}