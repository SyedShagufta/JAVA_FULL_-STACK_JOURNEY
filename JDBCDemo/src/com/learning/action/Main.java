package com.learning.action;

import java.sql.SQLException;

import com.learning.bean.Employee;
import com.learning.dao.AddEmployee;
import com.learning.dao.DeleteEmployee;
import com.learning.dao.PrintAllEmployees;

public class Main {

	public static void main(String[] args) throws SQLException {

		
		
		 Employee emp = new Employee(4, 10000, "Kashifa");
		 AddEmployee.addEmployee(emp);
		 
		 

		DeleteEmployee.deleteEmployeeById(4);

		PrintAllEmployees.printAllEmployees();

	}

}
