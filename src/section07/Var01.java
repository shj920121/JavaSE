package section07;
/*
 * 
 * 변수 (Variable)
 * 	데이터를 저장하고 조작하는데 사용되는 식별자로서의 이름을 가진 메모리 위치 입니다.
 * 
 * 변수 선언 및 초기화
 * 	자료형(Type) 변수명 = 값 또는 참조값;
 * 
 * 1. 타입에 따른 변수
 * 		기본형 - 예약어 되어있다, 소문자 시작, 직접 값을 저장하고 있다.
 * 			8가지 byte int long float double short boolean
 * 		참조형 - 기본형 외 나머지 전부! , 참조(주소)값을 가지고 있다, 일반적으로 대문자로 시작
 * 			ex) String, Math
 * 2. 선언 위치에 따른 변수
 * 
 * 		전역변수 - 클래스안에 선언된 변수(멤버변수)
 * 				초기화 하지 않으면 디폴트 값이 들어간다.
 * 				ex)
 * 				boolean -> false
 * 				정수형 -> 0
 * 				실수형 -> 0.0d
 * 				참조형 -> null
 * 
 * 		지역변수 - 메서드 또는 생성자 안에 선언된 변수
 * 				메서드 종료시 같이 소멸된다.
 * 				매개변수도 지역변수이다. ex) public static void area(int r) 여기서 r이 매개변수 또는 인자라고 한다.
 * 				지역변수는 반드시 초기화를 해줘야 한다.
 * 
 *
 * 
 * 
 */
public class Var01 {
	// 전역변수 (클래스내부 선언된 변수)
	static int globalVar = 10;
	static int globalVar2;
	static double globalVar3;
	static boolean globalVar4;
	static String globalVar5;
	
	public static void localMethod() {
		// 지역변수 선언
		int localVar = 20;
		System.out.println("전역변수 호출하기 : " + globalVar);
		System.out.println("지역변수 호출하기 : " + localVar); // 선언된 클래스 안에서만 사용가능
	}
	
	public static void localMethod2() {
		System.out.println("전역변수 호출하기 : " + globalVar);
	 // System.out.println("지역변수 호출하기 : " + localVar); // 지역변수는 에러가 난다.
	}
	
	public static void localMethod3() {
		int localVar;   // 선언한 이후 초기화를 안해주어서 워닝이 뜸
		//int locaVar = 0;   //이렇게 초기화를 해주어야함
		//String str = null; //이렇게 초기화를 해주어야함
		System.out.println("전역변수 호출하기 : " + globalVar2);
		System.out.println("전역변수 호출하기 : " + globalVar3);
		System.out.println("전역변수 호출하기 : " + globalVar4);
		System.out.println("전역변수 호출하기 : " + globalVar5);
     // System.out.println("지역변수 호출하기 : " + localVar);  // 지역변수는 초기화를 해주고 다시 선언
	}
	
	public static void main(String[] args) {
		
		localMethod3();
		
	}
}
