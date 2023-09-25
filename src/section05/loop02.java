package section05;
/*
 * 2. do ~ while문
 * 	while문과 비슷하지만, 최초 한번은 무조건 실행된다.
 */
public class loop02 {
	public static void main(String[] args) {
		int count = 100;
		do {
			//반복 실행할 코드 영역
			System.out.println(count);
			count++;
		} while (count <100);  // 최초 한번은 무조건 실행되기에 100부터 시작하여 조건이 맞지 않아도 한번은 실행
	}

}
