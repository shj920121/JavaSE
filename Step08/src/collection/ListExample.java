package collection;

import java.util.ArrayList;

/*
 * List 특징
 * 		1. 데이터 중복 O
 * 		2. 리스트에 등록된 데이터 순서가 보장됨
 * 
 * 		ArrayList : 리스트에서 데이터를 배열로 관리
 * 		LinkedList : 리스트에서 데이터를 노드 단위로 관리
 * 
 */

public class ListExample {
	public static void main(String[] args) {
		//리스트 생성한 부분, <저장할 데이터 타입(참조형만 가능)>
		ArrayList<String> list = new ArrayList<String>(); // list에 String을 저장하는 용도로 쓰겠다
		ArrayList<Integer> list1 = new ArrayList<Integer>(); // <>안에 refernence형만 가능
		
		//데이터 추가
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("js/jQuery");
		list.add("jsp");
		System.out.println(list);
		
		//데이터 삭제 - 인덱스 번호로 삭제
		list.remove(3);
		System.out.println(list);
		
		//데이터 삭제 - 값을 기준으로 삭제 1개만
		list.remove("java");
		System.out.println(list);
		
		//리스트에 저장된 데이터 개수
		System.out.println(list.size());
	}
	
	
}
