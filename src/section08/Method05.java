package section08;
/*
 * 
 * 
 * 
 */
public class Method05 {
	public static void main(String[] args) {
		
		String name = getName();	// getName()이 반환되어 '홍깃동'이 된다.
		
		System.out.println("name: " + name);
		System.out.println("getName() : " + getName()); //반환값이 있어서 가능
		
	}
	
	
	// 6. 인자는 없지만 리턴이 있는 경우 -> 메서드를 실행하여 연산결과 값 반환
	public static String getName() {
		String name = "홍깃동";
		
//		return name;
		return "홍길동";
	}
	
}
