package com.greatlearning.deptjava;

 class Tech extends Department {

	public Tech(String name, String dept) {
		super(name, dept);
		// TODO Auto-generated constructor stub
	}
	String departmentName () {
		return "Tech dept";
		 
	 }
	String getTodaysWork() {
		return " Complete coding of module 1";
		
	}
	String getWorkDeadline() {
		return "Complete by EOD";
		
		
	}
	String getTechStackInformation() {
		return "core java ";
		
	}
	 
	

}
