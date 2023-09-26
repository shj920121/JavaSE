package section08;
/*
 * 
 * 
 * 
 */
public class Method07 {
	public static void main(String[] args) {
		
		int[] values = {23, 7, 88, 45, 1, 3, 19};
		
		double[] result = summary(values);  // 반환
		
		System.out.println("합계: " + result[0]);
		System.out.println("평균: " + result[1]);
		
	}
	
	public static double[] summary(int[] values) {
		
		// result[0]에는 합계 , result[1]에는 평균
		
		double[] result = new double[2];
		
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		
		double avg = sum / (double)values.length;  // int에서 int를 나누면 정수로 안나옴 그래서 double로 해줌
		result[0] = sum;
		result[1] = avg;
		
		
		return result;
		
	}
	
	
}
