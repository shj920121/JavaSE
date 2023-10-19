import java.util.Scanner;

public class E06_ElseIfQuest {
/*
 *  점수 하나를 입력 받아서
 *  	100~90 A
 *  	 89~80 B
 *  	 79~70 C
 *  	 69~60 D
 *  	 59~ 0 F
 *  성적등급을 출력
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if (score > 89) 
			System.out.println("A");
		  else if (score > 79 ) 
			System.out.println("B");
		  else if (score > 69) 
			System.out.println("C");
		  else if (score > 59) 
			System.out.println("D");
		  else 
			System.out.println("F");
//한줄은  중괄호 생략가능
		
	}

}
