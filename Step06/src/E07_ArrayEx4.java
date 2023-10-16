import java.util.Arrays;

public class E07_ArrayEx4 {
	public static void main(String[] args) {
		int arr[] = {3,5,6,2,6,-4,0,1,13};
		
		for(int n : arr) {
			System.out.print(n + " ");
			n++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
