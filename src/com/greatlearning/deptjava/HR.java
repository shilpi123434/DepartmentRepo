package com.greatlearning.deptjava;

 class HR extends Department {
	 

	public HR(String name, String dept) {
		super(name, dept);
		// TODO Auto-generated constructor stub
	}
	
	String departmentName () {
		return "HR dept";
		 
	 }
	String getTodaysWork() {
		return " Fill today's worksheet and mark your attendance";
		
	}
	String getWorkDeadline() {
		return "Complete by EOD";
		
		
	}
	String  doActivity() {
		return "team lunch";
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
