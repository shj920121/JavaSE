package Section09;
/*
 * 
 * 생성자
 * 	객체를 생성할 때 실행되는 반환값 없는 메서드
 * 	클래스명과 동일하다.
 * 	객체 초기화 목적에 주로 사용된다.
 * 	
 * 
 */
public class Constructor01 {
	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title = "이방인";
		book1.price = 1000;
		book1.totalPage = 100;
		book1.author = "앎카뮈";
		

		
		book1.printInfo();
		
		System.out.println("=======================");
		
		Book book2 = new Book();
		book2.printInfo();
		
		
		
	}
}
