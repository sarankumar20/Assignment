package weekly_assignment;

public class Assignment1_Employee_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Create a Java program to store and print the following employee details:
		 1.Employee ID
         2.Age
         3.Salary
         4.Department Initial
         5.Whether the employee is permanent
         Use appropriate primitive data types.
		 */
		
		int Employee_ID = 1001;
		byte Age = 28;
		double Salary = 55000.50;
		char Department_initial = 'T';
		boolean permanent = false;
		System.out.println("Employee_ID :"+Employee_ID +"\nAge:" +Age + "\nSalary:" +String.format("%.2f", Salary) + "\nDepartment_initial:" +Department_initial + "\npermanent:" +permanent);
	}

}
