package section02;
/*
 * 4. 실수형
 * 	실수를 저장할 수 있는 자료형
 * 	float	(4byte)	:	부동소수점 형식으로 소수점 7자리까지 표현가능
 *  double	(8byte)	:	부동소수점 형식으로 소수점 15자리까지 표현가능
 */
public class Variable04 {
	public static void main(String[] args) {
		double marathon = 42.195;
		//double marathon = 42.195d;
		
		//숫자 뒤에 f를 붙여주지 않으면 오류가 난다. double도 원칙은 숫자 뒤에 d를 붙여주어야 하지만 일반적으로는 생략한다.
		//float halfMarathon = 21.0975;
		float halfMarathon = 21.0975f;
		
		long num6 = 21464836463L;
		//long num6 = 21464836463; 숫자 리터럴 값이 int 범위를 초과하는 경우 L을 붙여 long형임을 컴파일러에게 알려야 한다. int형은 i를 일반적으로 생략한다?
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다.");
		System.out.println("하프마라톤은 " + halfMarathon + "km를 달립니다.");
		
		//2진수 값 대입 0b로 시작
		byte num7 = 0b0100;
		System.out.println(num7); //출력은 10진수로 출력 
		
		//8진수 값 대입
		short num8 = 010;
		System.out.println(num8);
		
		//16진수 값 대입 0x로 시작
		int num9 = 0xFF;
		System.out.println(num9);
		
		
		
	}
}
