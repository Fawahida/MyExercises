package com.cg.eis.exception;

import org.apache.log4j.Logger;



class salaryException  extends Exception {
	
	salaryException()
	{
		super("Please check your salary");
	}
	
}

public class EmployeeException 
{
	static Logger log = Logger.getLogger(EmployeeException.class.getName());
	
	public void display()
	{
		log.info("display called");
	}
	
	public void userSalary(int salary) throws salaryException
	{
		if (salary <3000)
		{
			throw new salaryException();

		}
		else
		{
			log.info("your salary is maintained ");
		}
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeException obj = new EmployeeException();
		try
		{
			obj.userSalary(2760);
		}
		catch(salaryException e)
		{
			log.info(e.getMessage());
		}
		

	}

}
