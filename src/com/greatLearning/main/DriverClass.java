package com.greatLearning.main;

import com.greatLearning.adminDep.Admin;
import com.greatLearning.hrDep.Hr;
import com.greatLearning.techDep.Tech;

public class DriverClass {

	public static void main(String[] args) {
		Admin a = new Admin();
		Hr b = new Hr();
		Tech c = new Tech();
		System.out.println();
		System.out.println(" Welcome to "+a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println();
		System.out.println(" Welcome to "+b.departmentName());
		System.out.println(b.doActivity());
		System.out.println(b.getTodaysWork());
		System.out.println(b.getWorkDeadline());
		System.out.println(b.isTodayAHoliday());
		System.out.println();
		System.out.println(" Welcome to "+c.departmentName());
		System.out.println(c.getTodaysWork());
		System.out.println(c.getWorkDeadline());
		System.out.println(c.getTechStackInformation());
		System.out.println(c.isTodayAHoliday());
		System.out.println();
		
		
		

	}

}
