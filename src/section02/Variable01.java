package section02;
/*
 * cpu에서 전기신호가 강한것이 1, 약한것이 0
 * bit - 최소 공간 단위  1bit는 0과 1중 하나만
 * 8bit = 1byte
 * 1024byte = 1Kb
 * 1024Kb = 1Mb
 * 1024Mb = 1Gb
 * 1024Gb = 1T
 * 
 * 1. 논리형(boolean)
 * 	true 또는 false 두가지 값을 가지는 기본 자료형 , 크기는 1byte
 *  선언방법 : boolean 변수명;
 */
public class Variable01 {
	public static void main(String[] args) {
		//논리형 변수 선언하기
		boolean isBool;
		// 선언한 변수에 값 대입하기
		isBool = true;
		
		System.out.println("논리형 변수에 저장된 값: " + isBool);
		
		// 논리형 변수 값 변경하기
		isBool = false;
		
		
		//조건문에 논리형변수 사용하기
		if(isBool) {
			System.out.println("isBool값은 \"true\" 입니다.");
		} else {
			System.out.println("isBool값은 \"false\" 입니다.");
		}
		
		
		
		
		
	}
}
