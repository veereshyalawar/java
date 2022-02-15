
public class wages_month_uc5 {
	public static void main(String[] args) {
		
	       int Is_Full_Time = 1;
	       int EmpHrs = 8;
	       int emp_wages_pHr = 20;
	       int emp_daily_wage = 0;
	       int emp_mnthly_wage = 0;
	       int days_in_mnth = 20;
	        double empCheck = Math.floor(Math.random() * 10) % 2;
			 
			
	    	if (empCheck == Is_Full_Time);
	    	
	    	   emp_daily_wage = (EmpHrs * emp_wages_pHr);
	    	    
	           System.out.println("employ daily salary :" + emp_daily_wage);

	           emp_mnthly_wage = (days_in_mnth * emp_daily_wage );
	           
	           System.out.println("employ monthly salary :" +  emp_mnthly_wage);       		   
	}
}
