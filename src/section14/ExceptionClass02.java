package section14;

public class ExceptionClass02 {
	public static void main(String[] args) {
	String str = null; 
//	System.out.println("str 첫번째 글자: " + str.charAt(0)); //str이 null이라서 charAt을 참조할 수 없어서 에러 발생
	
	int num1 = 10;
	int num2 = 0;
	int result = 0;
	
	
		try {
			result = num1 / num2;
			System.out.println("result: " + result);			
			System.out.println("str 첫번째 글자: " + str.charAt(0));
			
		} catch (ArithmeticException ae) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
		} catch (NullPointerException ne) {
			System.out.println("null 익셉션 발생!");
		} catch (Exception e) {  // Exception이 가장 밑에 있어야한다. 
			System.out.println("관리자에게 문의하세요!");
			e.printStackTrace();
		}
		
	
	
	
	}
}
