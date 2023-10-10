package section12.access2;

public interface Cat {

	public static final int PAW = 4; // 인터페이스에서 변수는 상수이다. static final을 생략해도 상수임. static 상수. 정적 상수
	
	public abstract void eat();
	
	public abstract void sleep();
	
	public void hunt(); // abstract 생략가능, 키워드를 생략해도 추상메서드임
	

	
	
}
