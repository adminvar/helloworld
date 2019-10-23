package com.programcreek.helloworld.test;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.programcreek.helloworld.model.Employee;

public class EmployeeManagerTest {

	@Test
	public void testEmployeeManagerisEmpty1() {
		  ArrayList<Employee> employeeList = new ArrayList<Employee>();
		  assertTrue(employeeList.isEmpty());
	
		 employeeList.add(new Employee("1", "Mike", "Smith"));
		 employeeList.add(new Employee("2", "John", "Taylor"));
		 employeeList.add(new Employee("3", "Dave", "Wilson"));	
		 assertFalse("should have three element", employeeList.isEmpty());
	}

	@Test
	public void testGetEmployeeList() {
		 ArrayList<Employee> employeeList = new ArrayList<Employee>();
		 
	
		 employeeList.add(new Employee("1", "Mike", "Smith"));
		 employeeList.add(new Employee("2", "John", "Taylor"));
		 employeeList.add(new Employee("3", "Dave", "Wilson"));	
		 //System.out.println(employeeList.get(0));
		// assertEquals("Taylor", employeeList.get(1).toString());
		   // assertEquals("John", employeeList.get(2));
		   // assertEquals("Dave", employeeList.get(3));
		 assertNotNull(employeeList);
	}

}
