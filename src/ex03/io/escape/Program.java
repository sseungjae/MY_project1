package ex03.io.escape;
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
	
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│       school record         │");
		System.out.println("└─────────────────────────────┘");
		
		System.out.println("language1 : 0");
		System.out.println("language2 : 0");
		System.out.println("language3 : 0");
		System.out.println("total score : 0");
		System.out.println("average : 0.00\n");
		System.out.println("──────────────────────────────");
		
	}
}