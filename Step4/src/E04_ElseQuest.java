import java.util.Scanner;

public class E04_ElseQuest {
/*
 * 사용자로부터 나이를 입력 받아서
 * 입력받은 나이가 20세 이상이면 성ㄱ인 이라고 출력
 * 입력받는 나이가 20세 미만이면 미성년자라고 출력
 * if - else 이용
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("나이를 입력하시오 > ");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if (age >= 20) { 
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		
		
		
		String age2 = age >= 20 ? "성인입니다." : "미성년자입니다.";
		System.out.println(age2);	
		
		
	}

}
