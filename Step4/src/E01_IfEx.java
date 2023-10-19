
public class E01_IfEx {
/*
 * if 문
 * 		조건식이 true이면 if문에 붙어있는 { 실행영역 } 에 있는 코드를 실행
 * 		조건식이 false면 해당 if문을 건너뜀
 * 
 * 조건식 : 관계연산자와 논리연산자를 이용한 수식, 결과는 true/false로 나오는 수식
 * 
 * if(조건식) {
 * 		실행할 코드...
 * 		실행할 코드...
 * 		실행할 코드...
 * 		실행할 코드...
 * }
 */
	public static void main(String[] args) {
		
		int n = -10;
		
		if( n < 0 ) { // true , false의 내용
			System.out.println("음수입니다.");
		}
		if( n == 0 ) {
			System.out.println("0 입니다.");
		}
		if( n > 0 ) { 
			System.out.println("양수입니다.");
		}
// 위에서부터 순차적으로 실행
// if문만 쓰면 비효율
		
// 연산자 우선순위
// 증감 -> 사칙 -> 관계 -> 논리 순으로 실행
	
	}

}
