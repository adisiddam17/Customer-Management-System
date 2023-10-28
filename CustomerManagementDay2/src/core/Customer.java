//1. Customer class (core class)
//state  : customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//Must generate customer ids automatically : auto increment)
//PK(UID) : email
//
//Add suitable constructors.
package core;
import java.time.LocalDate;
import enums.ServicePlan;

public class Customer {
	private  int customerId;
	private String firstName,lastName,email,password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idCounter;
	
	static {
		idCounter=16200;
	}

	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		idCounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.customerId=idCounter;
	}
	
	public Customer(String email) {
		super();
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	
	@Override
	public String toString() {
		return "Customer Details : \ncustomerId=" + customerId + "\nfirstName=" + firstName + "\nlastName=" + lastName + "\nemail="
				+ email + "\nregistrationAmount=" + registrationAmount + "\ndob=" + dob
				+ "\nplan=" + plan +"\n---------------------------------------------------" ;
	}

	@Override
	public boolean equals(Object anotherObject)
	{
		return this.email.equals(((Customer)anotherObject).email);
	}
	
	
	
	
}
