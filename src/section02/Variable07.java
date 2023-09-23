package section02;
/*
 * 
 * 형변환
 * 	1. 업캐스팅
 * 		-표현 범위가 큰 데이터형으로 변환하기
 * 		-자동으로 가능
 * 		-데이터 손실이 없다.
 * 	2. 다운캐스팅
 * 		-표현 범위가 더 작은 데이터형으로 변환하기
 * 		-명시적으로 해야한다.
 * 		-데이터 손실이 있을 수 있다.
 */
public class Variable07 {
	public static void main(String[] args) {
		// 업캐스팅 예
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형변환
		System.out.println("iInt: " + iInt);
		
		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형변환
		System.out.println("iDouble: " + iDouble);
		
		// 다운캐스팅 예
		/*
		int iInt2 = 130;
		byte iByte2 = iInt2;
		*/
		// 오류 발생
		
		int iInt2 = 130;
		byte iByte2 = (byte)iInt2; // (byte)를 넣어줌으로써 강제 형변환
		System.out.println("iByte2: " + iByte2); // 오류는 없어졌지만 오버플로우로 데이터 손실된 값 -126이 출력
		
		// 실수 -> 정수 형변환 예
		float iFloat2 = 3.1415f;
		int iInt3 = (int)iFloat2;
		System.out.println("iInt3: " + iInt3);
		
	}
}
