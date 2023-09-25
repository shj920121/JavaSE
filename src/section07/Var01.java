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
 * 		전역변수 - 클래스안에 선언된 변수(멤버변수)
 * 		지역변수 - 메서드 또는 생성자 안에 선언된 변수
 * 				메서드 종료시 같이 소멸된다.
 * 				매개변수도 지역변수이다. ex) public static void area(int r) 여기서 r이 매개변수 또는 인자라고 한다.
 * 
 * 
 */
public class Var01 {
	// 전역변수 (클래스내부 선언된 변수)
	static int globalVar = 10;
	public static void localMethod() {
		// 지역변수 선언
	}
}
