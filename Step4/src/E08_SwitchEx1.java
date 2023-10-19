
public class E08_SwitchEx1 {
/*
 * switch는 case 옆에 있는 비교값과 일치하면
 * 일치하는 순간부터 switch 내부의 코드들을 전부 순서대로 실행한다. (break를 만나거나, 끝날때까지)
 * break는 switch를 강제로 종료시키는 키워드
 * switch에서 비교가 가능한 값은 정수, 문자, 문자열만 가능
 * default : 위에 case에  맞는 값이 없을 때 실행되는 영역
 * 
 * switch(값) {
 * 	case 비교값:
 * 		실행할 코드;
 * 		...
 * 		[break;]
 * 	case 비교값:
 * 		실행할 코드;
 * 		...
 * 		[break;]
 * 	default:
 * 		실행할 코드;
 * 		...
 * }
 * 
 * 정해진 범위가 너무 넓으면 if문으로 쓴다.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 2;
		
		switch(no) { // 정수,문자열만 들어간다 // 실행할 지점
		case 1: // 값만 들어간다.(상수) , 위에 값과 타입이 일치해야한다.
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default: // else
			System.out.println("????");
		}
	}

}
