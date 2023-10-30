package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("---사원정보 프로그램---");
			System.out.println("1. 사원정보 등록");
			System.out.println("2. 사원정보 조회");
			System.out.println("3. 사원정보 수정");
			System.out.println("4. 사원정보 삭제");
			System.out.println("5. 사원정보 전체조회");
			System.out.println("0. 사원정보 프로그램 종료");
		int no = sc.nextInt();
		sc.nextLine();
		
		if(no == 0) break;

		Controller controller = HandlerMapping.getInstance().createController(no);
		if(controller != null)
			controller.execute(sc);
		}
	}
}
