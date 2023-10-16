/*
 * 구구단 2~9단 까지 출력
 *  --2 단--
 *  --3 단--
 *  --4 단--
 *  ...
 *  --8 단--
 *  --9 단--
 */
public class E04_LoopInLoop {
	public static void main(String[] args) {
		
		// --2 단-- ~ --9 단--
		for(int dan = 2; dan<10; dan++) {
			System.out.printf("--%d 단--\n",dan);
		//1~9까지 곱한 결과
		for(int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}			
		}
		System.out.println("============================");
		
		//while로 변경
		int dan2 = 2;
		int i = 1;
		while(dan2 < 10) {
			System.out.printf("--%d 단--",dan2);
			 
			}
	}
}
