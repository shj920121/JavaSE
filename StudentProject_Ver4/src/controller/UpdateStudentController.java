package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class UpdateStudentController implements Controller {
	@Override
	public void execute(Scanner sc) {
		
	System.out.println("학생정보 수정......");
	
	System.out.print("수정할 학생의 학번을 입력하세요. : ");
	String studentNo = sc.nextLine();
	
//	ctrl shift o 임포트
	StudentVO vo = StudentService.getInstance().searchStudentNo(studentNo);
	
	if(vo == null) {
		System.out.println(studentNo + " 수정할 데이터가 없습니다.");
		return;
	}
			System.out.print("이름 : ");
			vo.setStudentName(sc.nextLine());
			System.out.print("학과 : ");
			vo.setMajor(sc.nextLine());
			System.out.print("평점 : ");
			vo.setScore(sc.nextDouble());
			sc.nextLine();
			System.out.println("데이터 수정 완료.");
	}
}