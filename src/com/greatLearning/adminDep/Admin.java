package com.greatLearning.adminDep;

import com.greatLearning.superDep.Super;

public class Admin extends Super {
	public String departmentName() {
		return "Admin Department";
	}
	public String getTodaysWork () {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
