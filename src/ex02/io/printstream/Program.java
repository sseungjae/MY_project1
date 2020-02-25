package ex02.io.printstream;
public class Program {
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
		avg = total / 3;
		
		//------------성적 출력 코드------------
	
		System.out.print("┌─────────────────────────────┐");
		System.out.print("│       school record         │");
		System.out.print("└─────────────────────────────┘");
		
		System.out.print("language1 : 0");
		System.out.print("language2 : 0");
		System.out.print("language3 : 0");
		System.out.print("total score : 0");
		System.out.print("average : 0.00");
		System.out.print("──────────────────────────────");
		
	}
}