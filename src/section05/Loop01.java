package section05;
/*
 * 반복문
 * 	특정한 부분의 코드가 반복적으로 수행될 수 있도록 하는 명령어
 * 
 * 1. while문 (무한루프가 필요할때 주로 쓴다)
 * 	while(조건식) {
 * 		반복 수행할 코드
 * }
 *  break문
 *  	반복문에서 break명령어는 해당 반복문을 즉시 종료하는 명령어
 * 
 * coutinue문
 * 		반복문에서 해당 반복을 건너뛰고 다음 반복을 실행하도록 강제하는 명령어
 * 
 * 
 * 
 * ctrl shift f : 들여쓰기 정리 (주석은 제대로 적용못시킴)
 * alt shift a : 새로 편집 모드
 * alt 방향키 : 줄이동
 * ctrl shift y : 대문자 소문자 변경
 * ctrl shift x : 
 * 
 * ex)
 * int count = 0;
 * while(true) {          필요에 의해 중단할때 true를 false로 바꿔준다
 * 		system.out.println(i);
 * }
 * 
*	for(int i = 0; true; i++) {
*	system.out.println(i);
*	}
*
*	// while문을 이용하여 0~99까지 출력
		int count = 0;
		while(count < 100) {
			System.out.println(count);
			count++;
*
*int count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			count++;
			if(count == 100)
					isRun = false;
*
*int count = 0;
		while(true) {
			System.out.println(count);
			count++;
			if(count == 100)
				break;
		}
*
*/

public class Loop01 {
	public static void main(String[] args) {
		int i = 1;
		while (i < 100) {
			i++;
			if (i % 3 == 0) // 3의 배수를 스킵한다.
				continue; // 하던 반복을 멈추고 실행을 시키지않으며 다시 처음부터 반복시작
			System.out.println(i);

		}

	}
}

/*
 * for(int i = 0; i < 100; i++) { system.out.println(i); }
 */
