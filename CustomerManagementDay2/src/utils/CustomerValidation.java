package utils;

import core.Customer;
import CustomExceptions.CustomerExp;
import enums.ServicePlan;
import java.time.LocalDate;
import java.util.List;

public class CustomerValidation {
	public static ServicePlan validateServicePlan(String plan) throws IllegalArgumentException,CustomerExp
	{
//		return ServicePlan.valueOf(plan.toUpperCase());
		try {
			return ServicePlan.valueOf(plan.toUpperCase());
		}
		catch(IllegalArgumentException e){
			throw new CustomerExp("Plan is not valid");
		}
	}
	
	public static double validateAmount(ServicePlan plan,double amount) throws CustomerExp
	{

		if(plan.getPlanCharges()!=amount)
		{
			throw new CustomerExp("Supscription fees as maintioned");
		}
		return plan.getPlanCharges();
	}
	
	//parsing the date(i.e converting string to date)
	public static LocalDate parseDate(String dob)
	{
		return LocalDate.parse(dob);
	}
	//validating fo duplicate emails
	
	public static String checkDuplicateEntries(String email,List<Customer> list) throws CustomerExp
	{
		if(list.contains(new Customer(email)))
		{
			throw new CustomerExp("Email already exists");
		}
		else {
			return email;
		}
		
	}
	public static Customer findByEmail(String email,List<Customer> list) throws CustomerExp
	{
		int index=list.indexOf(new Customer(email));
		if(index==-1)
		{
			throw new CustomerExp("Invalid Email id");
		}
		else
		{
			return list.get(index);	
		}
	}
	
	public static Customer validateAll(String firstName, String lastName, String email, String password, double registrationAmount,
			String dob, String plan,List<Customer> list) throws IllegalArgumentException,CustomerExp
	{
		ServicePlan plan1=validateServicePlan(plan);
		LocalDate dob1=parseDate(dob);
		registrationAmount=validateAmount(plan1,registrationAmount);
		email=checkDuplicateEntries(email,list);
		return new Customer(firstName, lastName, email, password, registrationAmount,
			 dob1,plan1);	
	}
}
