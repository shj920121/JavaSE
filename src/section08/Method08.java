package section08;

public class Method08 {
	public static void main(String[] args) {
		int num = 10;
		valTest(num);
		System.out.println(num);
		
		System.out.println("=================");
		
		int[] values = {1, 2, 3, 4, 5};
		
		refTest(values);
		
		
		for(int value : values) { // int value에 values의 요소들이 차례로 하나씩 대입이 된다.
			System.out.println(value);
		}
		
	}
	
	public static void valTest(int num) {
		
		num = 4; // 지역변수라 num값을 아무리 바꿔줘도 매개변수 num값은 바뀌지 않느다
		
	}
	
	public static void refTest(int[] values) {
		
		values[1] = 10;  // values의 1번값을 10을 변경 , 참조형 변수라 주소값을 받아서 변경가능
		
	}
	
}
