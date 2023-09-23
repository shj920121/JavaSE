package section02;
/*
 * 변수 (Variable) : 데이터를 저장하고 참조하기 위한 메모리 공간을 나타내는 이름
 * 					변수는 이름을 통해 해당 메모리 공간에 접근하고 값을 읽거나 수정할 수 있다.
 * 
 * 변수 선언 및 초기화
 *  자료형 변수명 		(변수 선언)
 * 	자료형 변수명 = 값; (초기화) - 처음 값을 대입함
 * 
 * 기본 자료형(8가지)	
 * 	자바에서 기본적으로 제공해주는 자료형
 * 		정수형 - byte, short, int, long
 * 		실수형 - float, double
 * 		문자형 - char
 * 		논리형 - boolean
 * 
 */
public class Variable {
	public static void main(String[] args) {
		
		int num1 = 10; // 정수형 변수 선언하고 값 대입하기
		
		double num2 = 3.14; // 실수형 변수 선언하고 값 대입하기
		
		String str = "Hello"; // 문자형 변수 선언하고 값 대입하기
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(str);
		
		
		
		
		
	}
}
