
public class E05_ElseIfEx {
/*
 * else if
 * 		if문으로 구성된 조건문에서 두번째 조건문부터 담당하는 문법
 * 
 * else if (조건식 {
 * 		실행문
 * 		...
 * 		...
 * 		...
 * }
 * 
 * 
 */
	public static void main(String[] args) {
		// 성인 20세 이상, 고등학생 17~19, 중학생 14~16, 초등학생 8~13, 미취학 아동
		
		int age = 16;
/*		
	if(age > 7 && age < 14) {
		System.out.println("초등학생");
	} else if(age > 16 && age < 20) {
		System.out.println("고등학생");
	} else if(age > 14 && age < 17) {
		System.out.println("중학생");
	} else if(age >= 0 && age < 8) {
		System.out.println("미취학 아동");
	} else {
		System.out.println("성인");
	}
*/		
// 범위가 정해진 데이터는 최대한 간결하게 		
		if(age > 19) {
			System.out.println("성인");
		} else if (age > 16) {
			System.out.println("고등학생");
		} else if (age > 13) {
			System.out.println("중학생");
		} else if (age > 7) {
			System.out.println("초등학생");
		} else {
			System.out.println("미취학 아동");
		}
//=========================================		
		if(age < 8) {
			System.out.println("미취학 아동");
		} else if (age < 14) {
			System.out.println("초등학생");
		} else if (age < 17) {
			System.out.println("중학생");
		} else if (age < 20) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
	}

}
