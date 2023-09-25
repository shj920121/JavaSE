package section07;
/*
 * 상수
 * 	처음 할당된 값이 변경되지 않는 변수
 * 	final 예약어 사용
 * 	보통 대문자로 선언한다.
 * 
 * 
 */
public class Constant {
	static final double PI = 3.141592;  // 상수는 일반적으로 대문자로 표시해준다.
	public static void main(String[] args) {
		// 원의 반지름
		int r = 10;
		
		// PI = 3.2; 다시 선언하면 컴파일 에러가 난다. 상수는 수정불가
		
		double area = PI * r * r;
		System.out.println("원의넓이 : " + area);
		
		area = Math.PI * Math.pow(r,2);
		System.out.println("원의 넓이2: " + area);
		
	}
}
