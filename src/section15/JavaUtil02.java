package section15;

import java.util.Random;

public class JavaUtil02 {
	public static void main(String[] args) {
		
		int[] iArray = new int[45];
		
		for(int i = 0; i < iArray.length; i++) {
			iArray[i] = i+1;
		}
		
		Random ran = new Random();
		
		// 1~45 셔플
		for(int i = 0; i < iArray.length; i++) {
			// 0~44 난수 값 반환
			int cIndex = ran.nextInt(45);
			
			
			// 임시변수로 값이 덮어씌여져서 없어지는것을 방지하고 스왑해준다.
			int tmp = iArray[i];
			iArray[i] = iArray[cIndex];
			iArray[cIndex] = tmp;
		}
		// 셔플된 수중 앞에 6개 뽑기
		for(int i = 0; i < 6; i++) {
			
			System.out.print(iArray[i] + "/");
		}
		
		
	}
}
