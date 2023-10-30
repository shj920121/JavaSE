package controller;

import java.util.Scanner;

import service.EmployeeService;

public class DeleteEmployeeController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원정보 삭제......");   

		System.out.print("삭제할 사원정보의 사원번호 : ");
		String EmployeeNo = sc.nextLine();
		
		if(EmployeeService.getInstance().deleteEmployee(EmployeeNo))
			System.out.println("사원정보 삭제 완료");
		else
			System.out.println("사원번호에 해당하는 사원이 없습니다.");
	}	

}
