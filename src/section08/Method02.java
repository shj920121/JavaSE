package section08;
/*
 * 
 * 
 * 
 */
public class Method02 {
	public static void main(String[] args) {
		printName("도라에몽"); // printName 호출
		printName("짱구"); // printName 호출
		
//		int name = 0; // 타입이 맞지 않아서 컴파일 에러
		String name = "맹구";
		printName(name);
	}	
	
	// 2. 인자가 있는 상태 , 리턴 X (void) -> 매개변수 값을 받아
	//
	public static void printName(String name) { // String name = "도라에몽";
		System.out.println("이름: " + name);
		System.out.println("이름: " + name);
	
	}
	
}
