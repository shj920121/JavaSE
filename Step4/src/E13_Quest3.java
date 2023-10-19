import java.util.Scanner;

/*
 * 100~95 A+
 * 94~90  A
 * 89~85  B+
 * 84~80
 * 
 */


public class E13_Quest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 > ");
		int score = sc.nextInt();
		
		switch(score/5) {
		case 20 :
		case 19 :
			System.out.println("A+");
			break;
		case 18 :
			System.out.println("A");
			break;
		case 17 :
			System.out.println("B+");
			break;
		case 16 : 
			System.out.println("B");
			break;
		case 15 : 
			System.out.println("C+");
			break;
		case 14 : 
			System.out.println("C");
			break;		
		case 13 : 
			System.out.println("D+");
			break;
		case 12 : 
			System.out.println("D");
			break;
		default : 
			System.out.println("F");
		
	}
		
	}

}
