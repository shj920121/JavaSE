package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	// 학생정보 저장할 배열
//	private StudentVO[] arr;
	private ArrayList<StudentVO> list;
	// 저장할 위치를 나타낼 인덱스 변수
	private int idx;
	private char[] getstudentName;

	// 생성자에서는 학생정보 배열을 생성, 길이는 5
	public StudentService() {
//		arr = new StudentVO[5];
		list = new ArrayList<StudentVO>();
		// 중간중간 테스트해볼 데이터 만들어두기
//		arr[idx++] = new StudentVO("1111", "홍길동", "컴퓨터공학과", 3.1);
//		arr[idx++] = new StudentVO("2222", "김철수", "경영학과", 2.3);
//		arr[idx++] = new StudentVO("3333", "이기영", "생활체육학과", 4.2);
//		arr[idx++] = new StudentVO("4444", "박영수", "법학과", 1.5);
		list.add(new StudentVO("1111", "홍길동", "컴퓨터공학과", 3.1));
		list.add(new StudentVO("2222", "김철수", "경영학과", 2.3));
		list.add(new StudentVO("3333", "이기영", "생활체육학과", 4.2));
		list.add(new StudentVO("4444", "박영수", "법학과", 1.5));
		
	}

	// 학생정보 등록하는 기능
	public void registerStudent(Scanner sc) {
		System.out.println("\n학생정보 등록을 시작합니다...........");
		// 1. 학생정보 입력
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		
		//학생정보 등록시 학번이 동일한 학생이 있으면 등록작업을 취소
		if(list.contains(new StudentVO(studentNo, null, null, 0))) {
			System.out.println("동일한 학번을 가진 학생이 있습니다.");
			System.out.println("학생등록 작업을 취소합니다.");
			return;
		}
		
		System.out.print("이름 : ");
		String studentName = sc.nextLine();
		System.out.print("학과 : ");
		String major = sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		// 2. 입력받은 학생정보를 배열에 저장
		// 단 배열에 공간이 모자르면 배열개수를 3개씩 증가
		list.add(new StudentVO(studentNo, studentName, major, score));
//		if (idx == arr.length) { // 공간체크
//			StudentVO[] temp = new StudentVO[arr.length + 3];
//			System.arraycopy(arr, 0, temp, 0, arr.length);
//			arr = temp;
//		}
//		arr[idx++] = new StudentVO(studentNo, studentName, major, score);
		System.out.println("학생정보 등록 완료");
	}

	public void printAllStudent() {
		System.out.println("학생 정보 전체 출력.....");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(getRank(list.get(i).getScore()) + " " + list.get(i));
		}
	}
//		for (int i = 0; i < idx; i++) {
//			System.out.println(getRank(arr[i].getScore()) + " " + arr[i]);
//		}
//	}

	// if(arr[i].getStudentNo() == studentNo) (X)
	// 문자형(참조형)은 기본적으로 메모리 주소를 비교하기때문에 안된다.
	private int searchStudentNo(String studentNo) {
		return list.indexOf(new StudentVO(studentNo, null, null, 0));
		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getStudentNo().equals(studentNo)) {
//				return i;
//			}
//		}
//		return -1; // 검색 결과가 없을때, indexOf 에서 -1의 특징
	}

	// 스캐너를 새로 생성하면 다른곳의 쓰던 스캐너가 끊기때문에
	// 메인에서 생성한 스캐너를 돌려쓸 수 있게 해줌

	public void searchStudent(Scanner sc) {
		System.out.println("학생정보 검색......");

		System.out.print("검색할 학생의 학번 : ");
		String studentNo = sc.nextLine(); // 단축키 nL 활용

		int i = searchStudentNo(studentNo);

		if (i == -1)
			System.out.println(studentNo + " 학번 검색 결과가 없습니다.");
		else
			System.out.println("검색결과\n" + list.get(i));

		System.out.println(studentNo + " 학번 검색 결과가 없습니다.");
	}

	public void updateStudent(Scanner sc) {
		System.out.print("수정할 학번 입력 : ");
		String studentNo = sc.nextLine();

//		for(int i=0; i < idx; i++)
//		if(arr[i].getStudentNo().equals(studentNo)) 

		int i = searchStudentNo(studentNo);

		if (i == -1)
			System.out.println(studentNo + " 학번 검색 결과가 없습니다.");
		else
			list.get(i).setStudentNo(sc.nextLine());
			System.out.print("학번 : ");
			list.get(i).setStudentName(sc.nextLine());
			System.out.print("이름 : ");
			list.get(i).setMajor(sc.nextLine());
			System.out.print("학과 : ");
			list.get(i).setScore(sc.nextDouble());
			System.out.print("평점 : ");
			sc.nextLine();
//			list.set(i, null)
			System.out.println("데이터 수정 완료.");
	}

	public void deleteStudent(Scanner sc) {
		System.out.println("학생정보 삭제......");
		System.out.print("삭제할 학생의 학번 : ");
		String studentNo = sc.nextLine();

		if(list.remove(new StudentVO(studentNo, null, null, 0)))
			System.out.println("데이터 삭제 완료");
		else {
			System.out.println(studentNo + " 학번 검색 결과가 없습니다.");
		}
//		int i = searchStudentNo(studentNo);
//
//		if (i == -1)
//			System.out.println(studentNo + " 학번 검색 결과가 없습니다.");
//		else {
//			list.remove(i);
//			for (int j = 0; j < list.size() - 1; j++) {
//				idx--;
//			}
//			idx--;
			System.out.println("데이터 삭제 완료");
		}
	

	private int getRank(double score) {
		int rank = 1; // 1등으로 놓고 하나씩 비교시작

//		for (int i = 0; i < idx; i++) {
//			if (score < arr[i].getScore())
//				rank++;
//		}
		for (int i = 0; i < list.size(); i++) {
			if (score < list.get(i).getScore())
				rank++;
		}
		return rank;
	}

	public void topRankStudent() {
		System.out.println("석차 1등.....");

//		for (int i = 0; i < idx; i++) {
//			if (getRank(arr[i].getScore()) == 1) {
//				System.out.println(arr[i]);
//				break;
//			}
//		}
		for (int i = 0; i < list.size(); i++) {
			if (getRank(list.get(i).getScore()) == 1) {
				System.out.println(list.get(i));
				break;
			}
		}

	}

	public void searchNameStudent(Scanner sc) {
		System.out.println("학생정보 검색....");
		
		System.out.print("검색할 학생의 이름 : ");
		String studentName = sc.nextLine(); // nL
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getStudentName().indexOf(studentName) != -1)
				System.out.println(list.get(i));
		}
//		for(int i=0; i<idx; i++) {
//			if(arr[i].getStudentName().indexOf(studentName) != -1)
//				System.out.println(arr[i]);
//		}
	}

	
		
		
	
	
	
	
	
	
	
	
	
	
	
	

}