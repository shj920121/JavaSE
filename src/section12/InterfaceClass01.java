package section12;

import section12.access2.Cat;
import section12.access2.HouseCat;
import section12.access2.PersianCat;
import section12.access2.Playable;

/*
 * 
 * 안터페이스(Interface)
 * 	추상 메서드의 집합으로, 클래스에서 다중상속과 느슨한 결합을 지원하며,
 * 	클래스의 동작을 정의하고 확장하는데 사용된다.
 * 
 */
public class InterfaceClass01 {
	public static void main(String[] args) {
		
//		Cat.PAW = 3; // 상수는 변경이 안된다
		System.out.println(Cat.PAW);
		
//		Cat cat1 = new PersianCat();
		Cat cat1 = new HouseCat(); // 수정이 용이하게 의존성?을 결합성?을 낮춘다.
		eat(cat1);
		
		System.out.println("====================");
		
//		cat1.play(); // 다형성 , 호출안됌
		HouseCat hCat = (HouseCat) cat1;
		hCat.play(); // play 메서드 사용가능
		
		Playable pCat = hCat;
	    pCat.play(); // 다형성으로 접근
//	    pCat.eat(); // 에러 playable에는 play만 사용가능
	    
//	    cat1 = hCat = pCat 형변환
		
	}
	
	public static void eat(Cat cat ) {
		cat.eat();
	}
	
}
