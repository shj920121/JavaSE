package section14.access1;

public class NumberPrinter {

	public void printNumber() throws InterruptedException { // 실행하는곳에서 예외처리 해달라 떠넘기는것
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
			Thread.sleep(1000);
		}
		
	}
}
