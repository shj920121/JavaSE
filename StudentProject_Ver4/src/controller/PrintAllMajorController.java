package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class PrintAllMajorController implements Controller {
//학과목록 -> 문자열,리스트
	@Override
	public void execute(Scanner sc) {
		System.out.println("전체 학과 목록 조회......");
		ArrayList<String> list = StudentService.getInstance().getMajorList();
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}

}
