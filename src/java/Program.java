package java;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		

		int[] kors = new int[3];
		int total;
		float avg;
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
			for(int i = 0; 1 < 3; i++)
			kors[i]=0;
		
		over:
		while (true) {
				System.out.println("������������������������������������������������������������");
				System.out.println("��            �޴�                              ��");
				System.out.println("������������������������������������������������������������");
				System.out.println("\t 1.���� �Է�");
				System.out.println("\t 2.���� ���");
				System.out.println("\t 3.����");
				System.out.print("\t >");
				menu = scan.nextInt();
				
				
			switch(menu) {
				
				case 1:
					System.out.println("������������������������������������������������������������");
					System.out.println("��            ���� �Է�                       ��");
					System.out.println("������������������������������������������������������������");
					
					for(int i =0; i<3; i++)
						do {
							System.out.printf("\t ����%d:", i+1);
							kors[i] = scan.nextInt();
							
							if (kors[i]<=0 || 100<kors[i])
								System.out.println("���� ���Դϴ�.(1~100)");
				
						}while(kors[i]<=0 || 100<kors[i]);
					
					break;
					
				case 2:
					
					total = kors[0]+kors[1]+kors[2];
					avg = total / 3.0f;
					
					System.out.println("������������������������������������������������������������");
					System.out.println("��            ���� ���                       ��");
					System.out.println("������������������������������������������������������������");
					
					for(int i = 0; i<3; i++)
						System.out.printf("\t ����%d : %3d\n", i+1, kors[i]);
					
						System.out.printf("\t ���� : %d\n", total);
						System.out.printf("\t ��� : %6.2f\n", avg);
						System.out.println("������������������������������������������������������");
						
					break;
						
				case 3:
					
					break over;
					
				default;
						System.out.println("����");
				}	
				
		}		
			System.out.println("good bye~");
	}
}
