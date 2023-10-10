package section03;
/*
 * 
 * 5. 대입 연산자
 * 	=
 * 	복합대입 연산자 : 연산 결과를 왼쪽에 있는 변수에 연산 후 저장 (누적)
 * +=, -=, *=, /=, %=
 * 
 */
public class Operator05 {
	public static void main(String[] args) {
		int num = 23;
		
		num += 4; // num = num + 4; 와 같다.
		System.out.println("num: " + num);		
		num -= 5;
		System.out.println("num: " + num);
		
		System.out.println("=====================");
		
		int n = 10;
		//n = n + 10;
		n += 10;
		System.out.println(n);
		n -= 5;
		System.out.println(n);
		n *= 3;
		System.out.println(n);
		n /= 7;
		System.out.println(n);
		n %= 3;
		System.out.println(n);
		//-----------------------------
		String address = "서울시 ";
		address += "강서구 ";
		address += "화곡동 ";
		address += "OO빌라 101호 ";
		System.out.println(address);
	}
}
