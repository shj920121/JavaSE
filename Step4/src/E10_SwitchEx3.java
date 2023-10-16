import java.util.Scanner;

public class E10_SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("명령어 입력 > ");
		String str = sc.next(); // 단어 하나 입력 받기 // nextLine 문장
		
		switch(str) {
		case "register":
			System.out.println("회원 정보 등록 기능을 실행 합니다.");
			break;
		case "delete":
			System.out.println("회원 정보 삭제 기능을 실행 합니다.");
			break;
		case "update":
			System.out.println("회원 정보 수정 기능을 실행 합니다.");
			break;
		default:
			System.out.println("잘못된 명령어를 입력하셨습니다.");
		}
	}

}
