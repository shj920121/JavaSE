package section05;
/*
 * 2 X 1 = 2	3 X 1 = 3	4 X 1 = 4
 * 2 X 2 = 2	3 X 1 = 3	4 X 1 = 4
 * 2 X 3 = 2	3 X 1 = 3	4 X 1 = 4
 * 2 X 4 = 2	3 X 1 = 3	4 X 1 = 4
 * 2 X 5 = 2	3 X 1 = 3	4 X 1 = 4
 * 2 X 6 = 2	3 X 1 = 3	4 X 1 = 4
 * 2 X 7 = 2	3 X 1 = 3	4 X 1 = 4
 * 2 X 8 = 2	3 X 1 = 3	4 X 1 = 4
 * 2 X 9 = 2	3 X 1 = 3	4 X 1 = 4
 * 
 * 
 * 
 * 
 */
public class LoopHomeWork2 {
	public static void main(String[] args) {
		
		for(int k = 0; k < 3; k++) {
			System.out.println("k = " + k);
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 3; j++) {
					int dan = j + 2 + (k * 3);
					int num = i + 1;
				
				if (dan > 9) break;
				System.out.print(dan+"x"+num+"="+dan*num+"\t");
				
//				if(dan < 10) {
//					//System.out.printf("%dX%d=%d\t", dan, num, dan*num); // 탭키 escape \t
//					System.out.print(dan+"x"+num+"="+dan*num+"\t");
//				}
			}
				System.out.println(); // 개행
			}
			System.out.println(); // 개행
		}
		
		
	}
}
