package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class TopRankStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("석차 1등 학생......");
		
		
		StudentVO vo = StudentService.getInstance().topRankStudent();
		System.out.println(vo);
		if(vo == null)
			System.out.println("학생 데이터가 하나도 없습니다.");
		else
			System.out.println(vo);
	}
}
