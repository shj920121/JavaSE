import java.util.Scanner;

/*
 * 숫자 두개를 입력해서 두 숫자의 뺄셈 결과를
 * 무조건 양수로 나오게끔 출력
 */

public class E07_Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 두개를 입력하세요 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = n1 - n2;
		
		
		
		  if(result > 0) { 
			  System.out.println(result); 
		  	} else {
		  	  System.out.println(-result); 
		  }
		  
		  System.out.println("============1");
		  
		  if(n1-n2 > 0) { 
			  System.out.println(n1-n2); 
			  } else {
		      System.out.println(-(n1-n2)); 
		  }
		 
		
		System.out.println("============2");
		
		if(n1 > n2)
			System.out.println(n1-n2);
		else
			System.out.println(n2-n1);
		
	}

}
