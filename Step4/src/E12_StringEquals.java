
public class E12_StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "안녕하세요";
		String str2 = new String("안녕하세요"); // new -> 메모리 하나 만들겠다
		String str3 = str2;
		
		// 참조형은 메모리 주소값으로 비교
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str1 );
System.out.println("================");		
		// 실제 내용으로 비교
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
		
	}                         

}
