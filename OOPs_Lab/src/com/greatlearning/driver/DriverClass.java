package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {

	public static final CredentialService credserv=new CredentialService();
	public static final Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter first name");
		String firstName=sc.nextLine();
		
		System.out.println("Enter last name");
		String lastName=sc.nextLine();
		
		Employee emp1=new Employee(firstName,lastName);
		String generatedEmail;
		String generatedPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		
		int departmentNumber=sc.nextInt();
		
		sc.close();
		
		switch(departmentNumber) {
		
		case(1):
			generatedPassword=credserv.generatePassword();
			generatedEmail=credserv.generateEmailAddress(firstName, lastName,"Technical");
			credserv.showCredentials(emp1, generatedEmail, generatedPassword);
			break;
			
		case(2):
			generatedPassword=credserv.generatePassword();
			generatedEmail=credserv.generateEmailAddress(firstName, lastName,"Admin");
			credserv.showCredentials(emp1, generatedEmail, generatedPassword);
			break;
		case(3):
			generatedPassword=credserv.generatePassword();
			generatedEmail=credserv.generateEmailAddress(firstName, lastName,"HR");
			credserv.showCredentials(emp1, generatedEmail, generatedPassword);
			break;
		case(4):
			generatedPassword=credserv.generatePassword();
			generatedEmail=credserv.generateEmailAddress(firstName, lastName,"Legal");
			credserv.showCredentials(emp1, generatedEmail, generatedPassword);
			break;
		default:
			System.out.println("Invalid department");
			break;
			
		}
		
		
	}
	
}
