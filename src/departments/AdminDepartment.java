package departments;

//Creating 'AdminDepartment' class which has 'SuperDepartment' as its superclass

public class AdminDepartment extends SuperDepartment {
	
	// creating departmentName method which returns string
	

	public String departmentName() {
		
		// initializing string
		
		String s1 = "Admin Department";
		
		// return string
		
		return s1;
	}
	
	/// creating 'getTodaysWork' method which returns string

	public String  getTodaysWork() {
		
		String s2  ="Complete your document submission";
		
		
		return s2;
	}
	
	// creating 'getWorkDeadline' method 

	public String getWorkDeadline() {
		
		String s3= "Complete by EOD";
		
		
		return s3;
	}

	public String isTodayAHoliday() {
		
		String s4= "Today is a holiday";
		
		return s4;
	}

	
	
	

	
	
	

}
