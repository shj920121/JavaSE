package controller;

import java.util.Scanner;

import service.EmployeeService;
import vo.EmployeeVO;

public class UpdateEmployeeController implements Controller {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("사원정보 수정......");
		
		System.out.print("수정할 학생의 사원번호를 입력하세요. : ");
		String EmployeeNo = sc.nextLine();
		
//		ctrl shift o 임포트
		EmployeeVO vo = EmployeeService.getInstance().searchEmployeeNo(EmployeeNo);
		
		if(vo == null) {
			System.out.println(EmployeeNo + " 수정할 데이터가 없습니다.");
			return;
		}
				System.out.print("수정할 이름 : ");
				vo.setEmployeeName(sc.nextLine());
				System.out.print("수정할 부서명 : ");
				vo.setDepartment(sc.nextLine());
				System.out.print("수정할 급여 : ");
				vo.setSalary(sc.nextInt());
				sc.nextLine();
				System.out.println("데이터 수정 완료.");
	}

}
