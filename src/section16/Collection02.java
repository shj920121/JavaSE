package section16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * List
 * 	컬렉션 프레임웍 중 하나 인터페이스로 순서가 있는 데이터 모음을 다루는 객체
 * 	선형 배열 객체 
 * 	가변 배열 객체 (길이가 정해져 있지 않다.)
 * 	인덱스 값이 있다.
 
 */
public class Collection02 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // ArrayList<String> list = new ArrayList<String>();
		
		// 데이터 저장하기, add 메서드
		list.add("피카츄"); // 인덱스번호 0
		list.add("라이츄"); // 1
		list.add("파이리"); // 2
 		list.add("꼬부기"); // 3
		list.add("버터플"); // 4
		list.add("야도란"); // 5
		list.add("피존투"); // 6
		list.add("또가스"); // 7
		
		// 저장된 데이터 특정 인덱스 값으로 얻어오기
		String pokemon = list.get(6);
		System.out.println("list 6 인덱스 값 : " + pokemon);
		
		// 저장된 데이터 특정 인덱스 값으로 삭제
		list.remove(1);
		System.out.println("저장된 데이터 개수: " + list.size());
		
		System.out.println("1번 인덱스 값: " + list.get(1));
		
		for(int i=0; i < list.size(); i++) {
			System.out.println("list : " + list.get(i));
		}
		
		System.out.println("==========================");
		
		//특정 인덱스 데이터 삽입
		list.add(4, "잠만보"); // 5번째 잠만보 삽입 , 그냥 쓰면 앞에서부터 삽입
		
		//향상된 for문
		for(String name : list) {
			System.out.println("name: " + name);
		}
		
		System.out.println("==========================");
		// LinkedList 삽입 삭제 성능이 좋다.
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("메타몽");
		linkedList.add("ㅇㅂㅇ");
		
		for(String pokemon2 : linkedList) {
			System.out.println("pokemon2 : " + pokemon2);
		}
		
		System.out.println("==========================");
		
		//ArrayList와 동일한 기능 + Thread Safe
		List<String> vec = new Vector<String>();
		vec.add("슈퍼맨");
		vec.add("배트맨");
		
		for(String hero : vec) {
			System.out.println("hero : " + hero);
		}
		
		
	}
}
