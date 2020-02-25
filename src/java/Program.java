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
				System.out.println("┌────────────────────────────┐");
				System.out.println("│            메뉴                              │");
				System.out.println("└────────────────────────────┘");
				System.out.println("\t 1.성적 입력");
				System.out.println("\t 2.성적 출력");
				System.out.println("\t 3.종료");
				System.out.print("\t >");
				menu = scan.nextInt();
				
				
			switch(menu) {
				
				case 1:
					System.out.println("┌────────────────────────────┐");
					System.out.println("│            성적 입력                       │");
					System.out.println("└────────────────────────────┘");
					
					for(int i =0; i<3; i++)
						do {
							System.out.printf("\t 국어%d:", i+1);
							kors[i] = scan.nextInt();
							
							if (kors[i]<=0 || 100<kors[i])
								System.out.println("범위 밖입니다.(1~100)");
				
						}while(kors[i]<=0 || 100<kors[i]);
					
					break;
					
				case 2:
					
					total = kors[0]+kors[1]+kors[2];
					avg = total / 3.0f;
					
					System.out.println("┌────────────────────────────┐");
					System.out.println("│            성적 출력                       │");
					System.out.println("└────────────────────────────┘");
					
					for(int i = 0; i<3; i++)
						System.out.printf("\t 국어%d : %3d\n", i+1, kors[i]);
					
						System.out.printf("\t 총점 : %d\n", total);
						System.out.printf("\t 평균 : %6.2f\n", avg);
						System.out.println("───────────────────────────");
						
					break;
						
				case 3:
					
					break over;
					
				default;
						System.out.println("오류");
				}	
				
		}		
			System.out.println("good bye~");
	}
}
