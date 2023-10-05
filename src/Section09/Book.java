package Section09;

public class Book {
	// 속성
		public String title;  // 제목
		public int price;     // 가격
		public int totalPage; // 쪽수
		public String author; // 저자
		
		
	//생성자 - 생성 이후 바로 실행된다 , 초기화를 해야 할때 주로 사용된다.
		public Book() {
			this.title = "멘토시리즈 자바";
			this.price = 32000;
			this.totalPage = 603;
			this.author = "김며웅";
		}
		
		
		
		public void printInfo() {
			System.out.println("Title: " + title);
			System.out.println("Price: " + price);
			System.out.println("TotalPage: " + totalPage);
			System.out.println("Author: " + author);
		}
		
}
