package section08;
/*
 * 메서드(Method)
 * 	객체지향 ㅍ프로그래밍에서 하나의 특별한 목적의 작업을 수행하기 위해
 * 	설계된 코드의 집합.
 * 	객체의 기능!
 * 
 * 	메서드의 구조
 * 	(접근제한자) (static) 반환타입 메서드이름(매개변수타입 매개변수명) {
 * 		메서드 코드
 * 		(return 반환값;)
 * }
 * 
 * 
 */
public class Method01 {
	public static void main(String[] args) {
		hello();  // 메서드 호출. 메인에서 호출해서 실행이 된다.
	}
	
	
	//메서드 선언 , 메인에 정의된 코드가 아니기에 실행은 되지 않는 상태 (실행대기)
	// 1. 인자가 없다, void -> 반환값 없음 즉 리턴 X -> 호출시 실행하고 끝나는 메서드
	public static void hello() {
		System.out.println("Hello, world!");
	}
	
}
