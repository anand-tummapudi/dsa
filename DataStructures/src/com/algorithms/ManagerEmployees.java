package com.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerEmployees {
	
	static Map<String,Integer> res = new HashMap<>();
	
	public static void main(String []args) {
		
		HashMap<String,String> employeeMap = new HashMap<>();
		
		employeeMap.put("A","C");
		employeeMap.put("B","C");
		employeeMap.put("C","F");
		employeeMap.put("D","E");
		employeeMap.put("E","F");
		employeeMap.put("F","F");
		
		populateRes(employeeMap);
		
		System.out.println(res.toString());
		
	}

	private static void populateRes(HashMap<String, String> employeeMap) {
	
		Map<String,List<String>> managerEmpMap = new HashMap<String,List<String>>();
		
		for(Map.Entry<String,String> entry:employeeMap.entrySet()) {
			String employee = entry.getKey();
			String manager = entry.getValue();
			
			if(!employee.equals(manager)){
				List<String> directRepList = managerEmpMap.get(manager);
				if(directRepList ==null) {
					directRepList = new ArrayList<>();
					managerEmpMap.put(manager, directRepList);
				}
				
				directRepList.add(employee);
			}
		}
		
		for(String manager:employeeMap.keySet())
			populateResult(manager,managerEmpMap);
	}

	private static int populateResult(String manager, Map<String, List<String>> managerEmpMap) {
		// TODO Auto-generated method stub
		
		int total = 0;
		
		if(!managerEmpMap.containsKey(manager)) {
			res.put(manager, 0);
		}else if(res.containsKey(manager)) {
			total = res.get(manager);
		}else {
			List<String> directRepEmpList = managerEmpMap.get(manager);
			total = directRepEmpList.size();
			
			for(String directRepEmp:directRepEmpList){
				total+=populateResult(directRepEmp,managerEmpMap);
			}
			
			res.put(manager, total);
		}
		
	return total;
	}
	
	
	
	
}
