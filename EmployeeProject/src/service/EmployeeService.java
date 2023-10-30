package service;

import java.util.ArrayList;

import org.json.JSONArray;

import vo.EmployeeVO;

public class EmployeeService {
	private static EmployeeService instance = new  EmployeeService();
	private ArrayList<EmployeeVO> list;
	private EmployeeService() {
		list = new ArrayList<EmployeeVO>();

	}

	public static EmployeeService getInstance() {
		if(instance == null)
			instance = new EmployeeService();
		return instance;
	}

	public EmployeeVO searchEmployeeNo(String employeeNo) {
		return null;
	}

	public boolean deleteEmployee(String employeeNo) {
		return list.remove(new EmployeeVO(employeeNo, null, 0, null));
	}

	public String employeeToJson() {
		JSONArray arr = new JSONArray(list);
		return arr.toString();



		

	
	}
}