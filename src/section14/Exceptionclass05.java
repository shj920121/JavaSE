package section14;

import section14.access1.NumberPrinter;

/*
 * throws
 * 	자바에서 메서드나 생성자가 예외를 던질 수 있음을 선언하는 키워드
 * 	메서드가 예외를 처리하지 않고 해당 예외를 호출하는 곳으로 넘기고자 할 때 사용.
 * 
 * 
 * 
 */
public class Exceptionclass05 {
	public static void main(String[] args) throws InterruptedException { // 이번엔 jvm이 알아서 예외처리해라
		NumberPrinter np = new NumberPrinter();
		
		// 첫번째 예외처리 방법 try ~ catch
//		try {
//			np.printNumber();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// 두번째 예외처리 방법 throws(미루기)
		np.printNumber();
		
		// throw 키워드 - 강제로 익셉션 발생시키기
		throw new NullPointerException(); 
		
	}
}
