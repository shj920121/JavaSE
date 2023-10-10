package section13;
/*
 * 내부클래스 컴파일 
 * 	outer$Inner.class
 * 
 * 내부클래스도 외부클래스 안에서 코드가 작성되지만 별도의 클래스이기에
 * 컴파일시 별도로 생성된다.
 * 
 * 
 */
public class OuterClass02 {
	public static void main(String[] args) {
//		OuterClass02.InnerClass.info();
		new OuterClass02.InnerClass().info();
		
		// 객체생성 - 타입 변수명 = new 타입();
		OuterClass02.InnerClass inner = new OuterClass02.InnerClass();
		inner.info();
		
		
	}
	
	static class InnerClass {
		public void info() {
			System.out.println("static 내부클래스의 일반메서드 입니다.");
		}
	}
	
}
