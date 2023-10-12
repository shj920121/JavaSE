package section15;

import section15.access1.Soccer;

/*
 * 
 * java.lang 패키지
 * 	자바에서 기본으로 제공해주는 패키지
 * 	import 없이 사용이 가능하다. 
 * 
 * Object 클래스
 * 	자바에서 모든 클래스의 최상위 부모 클래스
 * 	명시하지 않아도 모든 클래스는 Object를 상속 받는다.
 * 
 * 	대표 메서드
 * 	equals() 메서드 : 두 객체가 동일한 객체면 true, 동일하지 않으면 false를 반환한다.
 * 
 *  hashcode() 메서드 : 객체의 메모리 번지를 이용, 해시코드를 만들어 리턴
 *  
 *  toString() 메서드 : 객체의 문자 정보를 리턴, 즉 객체를 문자열로 표현
 *  
 *  clone() 메서드 : 객체 복사 (단 Cloneable 인터페이스 상속받은 객체만 사용가능)
 * 
 */
public class JavaLang01 {
	
	public static void main(String[] args) {
		
		
		Soccer soccer1 = new Soccer("리버풀", "리버풀", "1892", "프리미어리그");
		Soccer soccer2 = new Soccer("리버풀", "리버풀", "1892", "프리미어리그");
		
		
		System.out.println(soccer1);
		System.out.println(soccer1.toString()); // object에 정의되어 있는 메서드이기 때문에 그냥 사용가능
		System.out.println(soccer2);
		System.out.println(soccer2.toString()); // object에 정의되어 있는 메서드이기 때문에 그냥 사용가능 , 같은 내용이어도 문자 정보가 다르다
		
		if(soccer1.equals(soccer2)) { // 같은 내용이어도 다른 객체임
			System.out.println("soccer1 과 soccer2는 같다.");
		} else { 
			System.out.println("soccer1 과 soccer2는 다르다.");
		}
		
		System.out.println(System.identityHashCode(soccer1));
		System.out.println(System.identityHashCode(soccer2));
		
		System.out.println(soccer1.hashCode());
		System.out.println(soccer2.hashCode());
		
	}
}
