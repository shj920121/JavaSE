package section05;

public class Loop04 {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {
			// i : 0  j : 0 1 2 3 4 5 6   print: *******
			// j가 7이면 false이기 때문에 이제 줄바꿈
			// i : 1  j : 0 1 2 3 4 5 6   print: *******
			// ...
			// i : 6  j : 0 1 2 3 4 5 6   print: *******
			for(int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈용
		}
		
		for(int i = 0; i < 7; i++) {
			
			for(int j = 0; j < i+1; j++) {
				// i : 0 j : 0 			print: *
				// i : 1 j : 0 1 		print: **
				// i : 2 j : 0 1 2		print: ***
				// i : 3 j : 0 1 2 3	print: ****
				// i : 4 j : 0 1 2 3 4	print: *****
				
				
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈용
	}
}
}