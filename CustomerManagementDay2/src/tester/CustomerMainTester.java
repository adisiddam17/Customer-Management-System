//
//Solve these options
//
//1. Sign up (customer registration)
//
//2. Sign in (login)
//i/p : email n password
//
//3. Change password
//i/p : email n old password n new password
//
//4. Un subscribe customer
//i/p : customer email
//
//5. Display all customers.
//
//0. Exit 

package tester;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import core.Customer;
import enums.ServicePlan;
import static utils.CustomerValidation.*;
import java.util.Scanner;

public class CustomerMainTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> cArrayList = new ArrayList<Customer>(); // upCasting
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"MENU : \n1.Sign up \n2.Sign in \n3.Change password \n4.Unsubscribe Customer \n5.Display All Customers \n6.ToAddData \n0.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out
								.println("Enter firstName, lastName, email, password,  registrationAmount, dob , plan");
						Customer validatedCustomer = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), cArrayList);
						cArrayList.add(validatedCustomer);
						System.out.println("Sign Up Done");
						break;
					case 2:
						System.out.println("Enter email:");
						validatedCustomer = findByEmail(sc.next(), cArrayList);
						System.out.println("Enter password : ");
						if (sc.next().equals(validatedCustomer.getPassword())) {
							System.out.println("You're signed in");
						}
						break;
					case 3:
						System.out.println("Enter email:");
						validatedCustomer = findByEmail(sc.next(), cArrayList);
						System.out.println("Enter old password : ");
						if (sc.next().equals(validatedCustomer.getPassword())) {
							System.out.println("Enter New password : ");
							validatedCustomer.setPassword(sc.next());
							System.out.println("Password updated...");
						}
						break;
					case 4:
						System.out.println("Enter email:");
						cArrayList.remove(new Customer(sc.next()));
						System.out.println("Customer removed successfully...");
						break;
					case 5:
						System.out.println("----------------Displaying Customers-----------------");
						for (Customer c : cArrayList) {
							System.out.println(c);
						}
						break;
					case 6:

						Customer c1 = validateAll("Aditi", "Siddam", "adi@gmail", "adi123", 2000, "2001-02-17", "GOLD",
								cArrayList);
						Customer c2 = validateAll("Akanksha", "Barbade", "akki@gmail", "akki123", 5000, "2001-10-29",
								"DIAMOND", cArrayList);
						Customer c3 = validateAll("Pratiksha", "Gaikwad", "pratu@gmail", "pratu123", 2000, "2001-10-17",
								"GOLD", cArrayList);
						Customer c4 = validateAll("Aniket", "Waghmare", "ani@gmail", "ani123", 1000, "2001-03-19",
								"SILVER", cArrayList);
						Customer c5 = validateAll("NEHA", "SONAR", "neha@gmail", "neha123", 2000, "2001-11-17", "GOLD",
								cArrayList);
						cArrayList.add(c1);
						cArrayList.add(c2);
						cArrayList.add(c3);
						cArrayList.add(c4);
						cArrayList.add(c5);
						System.out.println("Data added successfully!!");

						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}

//OUTPUT:
//	MENU : 
//		1.Sign up 
//		2.Sign in 
//		3.Change password 
//		4.Unsubscribe Customer 
//		5.Display All Customers 
//		6.ToAddData 
//		0.Exit
//		6
//		Data added successfully!!
//		MENU : 
//		1.Sign up 
//		2.Sign in 
//		3.Change password 
//		4.Unsubscribe Customer 
//		5.Display All Customers 
//		6.ToAddData 
//		0.Exit
//		1
//		Enter firstName, lastName, email, password,  registrationAmount, dob , plan
//		Tushar Modhave t@gmail t1 2000 2000-12-27 GOLD
//		Sign Up Done
//		MENU : 
//		1.Sign up 
//		2.Sign in 
//		3.Change password 
//		4.Unsubscribe Customer 
//		5.Display All Customers 
//		6.ToAddData 
//		0.Exit
//		2
//		Enter email:
//		t@gmail
//		Enter password : 
//		t1
//		You're signed in
//		MENU : 
//		1.Sign up 
//		2.Sign in 
//		3.Change password 
//		4.Unsubscribe Customer 
//		5.Display All Customers 
//		6.ToAddData 
//		0.Exit
//		3
//		Enter email:
//		t@gmail
//		Enter old password : 
//		t1
//		Enter New password : 
//		t123
//		Password updated...
//		MENU : 
//		1.Sign up 
//		2.Sign in 
//		3.Change password 
//		4.Unsubscribe Customer 
//		5.Display All Customers 
//		6.ToAddData 
//		0.Exit
//		2
//		Enter email:
//		t@gmail
//		Enter password : 
//		t123
//		You're signed in
//		MENU : 
//		1.Sign up 
//		2.Sign in 
//		3.Change password 
//		4.Unsubscribe Customer 
//		5.Display All Customers 
//		6.ToAddData 
//		0.Exit
//		4
//		Enter email:
//		t@gmail
//		Customer removed successfully...
//		MENU : 
//		1.Sign up 
//		2.Sign in 
//		3.Change password 
//		4.Unsubscribe Customer 
//		5.Display All Customers 
//		6.ToAddData 
//		0.Exit
//		5
//		----------------Displaying Customers-----------------
//		Customer Details : 
//		customerId=16201
//		firstName=Aditi
//		lastName=Siddam
//		email=adi@gmail
//		registrationAmount=2000.0
//		dob=2001-02-17
//		plan=SERVICE PLAN : GOLD  PRICE : 2000.0
//		---------------------------------------------------
//		Customer Details : 
//		customerId=16202
//		firstName=Akanksha
//		lastName=Barbade
//		email=akki@gmail
//		registrationAmount=5000.0
//		dob=2001-10-29
//		plan=SERVICE PLAN : DIAMOND  PRICE : 5000.0
//		---------------------------------------------------
//		Customer Details : 
//		customerId=16203
//		firstName=Pratiksha
//		lastName=Gaikwad
//		email=pratu@gmail
//		registrationAmount=2000.0
//		dob=2001-10-17
//		plan=SERVICE PLAN : GOLD  PRICE : 2000.0
//		---------------------------------------------------
//		Customer Details : 
//		customerId=16204
//		firstName=Aniket
//		lastName=Waghmare
//		email=ani@gmail
//		registrationAmount=1000.0
//		dob=2001-03-19
//		plan=SERVICE PLAN : SILVER  PRICE : 1000.0
//		---------------------------------------------------
//		Customer Details : 
//		customerId=16205
//		firstName=NEHA
//		lastName=SONAR
//		email=neha@gmail
//		registrationAmount=2000.0
//		dob=2001-11-17
//		plan=SERVICE PLAN : GOLD  PRICE : 2000.0
//		---------------------------------------------------
//		MENU : 
//		1.Sign up 
//		2.Sign in 
//		3.Change password 
//		4.Unsubscribe Customer 
//		5.Display All Customers 
//		6.ToAddData 
//		0.Exit
//
