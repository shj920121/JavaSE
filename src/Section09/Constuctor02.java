package Section09;

public class Constuctor02 {
	public static void main(String[] args) {
//		Movie movie = new Movie();  -매개변수값을 넣어주지 않으면 오류
		Movie movie = new Movie("타이타닉", "재난", 194);
		
		movie.printInfo();
	}
}
