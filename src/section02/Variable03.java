package section02;
/*
 * 3. 정수형
 * 	byte 크기는 1byte 이고 -128 ~ +127 까지 표현가능  ex) 오버플로우 byte에서 +127 다음은 -128이 되는 현상 , 언더플로우
 * 	short 크기는 2byte 이고 -32,768 ~ +32,767 까지 표현가능
 * 	int 크기는 4byte 이고 -2,147,483,648 ~ +2,147,483,647 까지 표현가능
 *  long 크기는 8byte 이고 -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 까지 표현가능  
 *  
 *  Ctrl + s 저장
 *  Ctrl + Shift + s 전체파일 저장
 *  
 */
public class Variable03 {
	public static void main(String[] args) {
		byte num1 = 20;
		
		//byte num5 = 128; 
		//byte에서 저장할 수 있는 숫자범위 (-128~+127)초과되서 에러
		
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//byte over flow
		num1 += 120;  // num1 = num1 + 120;
		System.out.println(num1);
		
	}
}
