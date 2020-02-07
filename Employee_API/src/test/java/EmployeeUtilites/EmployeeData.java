package EmployeeUtilites;

import java.util.HashMap;

public class EmployeeData {

	public static HashMap<String, String> map = new HashMap<String, String>();

	public static HashMap<String, String> PostRequest() {
		map.put("id", "10");
		map.put("employee_name", "Adhambi");
		map.put("employee_salary", "20000");
		map.put("employee_age", "28");
		return map;
	}
}