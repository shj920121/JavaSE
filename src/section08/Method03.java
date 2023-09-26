package section08;
/*
 * 
 * *****오버로딩 ( Overloading)
 * 	클래스 내에서 같은 이름을 가진 메서드를 여러개 정의하ㄴ는 것을 말한다.
 * 	매개변수 개수 또는 타입이 다르면 선언 가능하다.
 * 
 */
public class Method03 {
	public static void main(String[] args) {
		
		printPokemon("025", "피카츄", 250);
		
		
		
		String no = "001";
		String name = "이상해씨";
		int hp = 300;
		
		printPokemon(no, name, hp);
		
		System.out.println("===============================");
		
		printPokemon("001", "이상해씨", "풀타입");
		
		
	}
	


	// 3. 인자가 여러타입 매개변수, 리턴 X
	public static void printPokemon(String no, String name, int hp) {
		System.out.println("No. " + no);
		System.out.println("Name : " + name);
		System.out.println("HP : " + hp);
	}
	// 같은 이름으로
	public static void printPokemon(String no, String name, String type) {
		System.out.println("No. " + no);
		System.out.println("name " + name);
		System.out.println("type " + type);
		
	}
	

	
}
