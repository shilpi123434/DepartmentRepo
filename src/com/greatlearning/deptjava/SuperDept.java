package com.greatlearning.deptjava;

 class SuperDept extends Department {
	
	 public SuperDept(String name, String dept) {
		super(name, dept);
		// TODO Auto-generated constructor stub
	}


	String departmentName () {
		return "Super dept";
		 
	 }
	String getTodaysWork() {
		return " No work as of now";
		
	}
	String getWorkDeadline() {
		return "Nil";
		
		
	}
	String  isTodayAHoliday() {
		return "Today is not a holiday ";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
