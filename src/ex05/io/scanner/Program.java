package ex05.io.scanner;

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
		
		//------------���� �Էºκ�------------
		System.out.println("��������������������������������������������������������������");
		System.out.println("��    school record input      ��");
		System.out.println("��������������������������������������������������������������");
		System.out.print("language1:");
		kor1 = rd.nextInt();
		
		int validate = (0<=kor1 && kor1<=100)?1:0;
		System.out.println(validate);
		
		System.out.print("language2:");
		kor2 = rd.nextInt();
		System.out.print("language3:");
		kor3 = rd.nextInt();		
		
		//------------���� ��� �ڵ�------------
	
		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;
		
		System.out.println("��������������������������������������������������������������");
		System.out.println("��       school record         ��");
		System.out.println("��������������������������������������������������������������");
		
		System.out.printf("\t language1 : %3d\n", kor1);
		System.out.printf("\t language2 : %3d\n", kor2);
		System.out.printf("\t language3 : %3d\n", kor3);
		System.out.printf("\t total score : %3d\n", total);
		System.out.printf("\t average : %6.2f\n", avg);
		System.out.println("������������������������������������������������������������");
		
	
	}
}