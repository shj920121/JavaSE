package section01;

/*
 * 여러줄 주석
 */

// 한줄 주석
public class Comment {
	public static void main(String[] args) {
		
		System.out.println("Hello, Java!");
		int r = 10;
		area(r);
	}
	/** JavaDoc 주석
	 * 원의 넓이를 구하는 메서드
	 * @param r - 반지름
	 */
	public static void area(int r) {		
		// 원의 넓이
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("원의 넓이 : " + area);
		
	}
}
