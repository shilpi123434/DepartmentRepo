package departments;

public class HrDepartment extends SuperDepartment {
	
	

	public String departmentName() {
		
		String s1 ="Hr Department";
		
		
		return s1;
	}

	public String doActivity() {
		
		String s2=" Team lunch ";
		
		
		return s2;
	}

	public String getTodaysWork() {
		
			String s3="Fill today's worksheet and mark your attendance";
			
		
		return s3;
		
	}

	public String getWorkDeadline() {
		
		String s4=" Complete by EOD";
		
		
		return s4;
	}

	public String isTodayAHoliday() {
		
		String s5="Today is a holiday";
		
		return s5;
	}

}
