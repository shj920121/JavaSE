import java.util.Arrays;

public class E08_ArrayEx5 {
	public static void main(String[] args) {
		
		String str = "Hello World";
		
		char[] arr = str.toCharArray();
		
		System.out.println(Arrays.toString(arr)); // 문자열을 문자열 배열로 변환하는 방법
		
		arr[4] = 'O';
		
		System.out.println(Arrays.toString(arr));
		
		str = new String(arr);// 문자열 배열을 String으로 생성하는 방법
		System.out.println(str);
		
	}
}
