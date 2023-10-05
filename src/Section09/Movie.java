package Section09;

public class Movie {
	public String title;	//제목
	public String genre;	//장르
	public int runTime;		//상영시간
	
	public Movie(String title, String genre, int runTime) {
		
		System.out.println(title); // 전역변수명과 지역변수명이 같을 경우 지역변수 호출
		
		this.title = title; // 전역변수의 title을 써야할 때 this를 쓴다.
		this.genre = genre;
		this.runTime = runTime;
	}
	
	public void printInfo() {
		System.out.println("title: " + title);
		System.out.println("genre: " + genre);
		System.out.println("runTime: " + runTime);
	}
	
}
