package com.greatlearning.service;
import com.greatlearning.model.*;
import java.util.Random;


public class CredentialService  implements ICredentialService{
	

	public String generatePassword() {
				
		String lowerCase="abcdefghijklmnopqrstuvwx";
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String spclChar="!@#$";
		String number="0123456789";
		String value=upperCase + lowerCase + number + spclChar;
		
		StringBuffer strBuffer=new StringBuffer("");
		Random random=new Random();
		
		for(int i=0;i<8;i++) {
		 
			strBuffer.append(value.charAt(random.nextInt(value.length())));

		}
		
		return strBuffer.toString();
	}
	
	public String generateEmailAddress(String firstName,String lastName,String department) {
		
		return (firstName+lastName+"@"+department+".abc.com").toLowerCase();
		
	}
	
	public void showCredentials(Employee employee,String email,String generatePassword) {
		
		System.out.println("Dear "+employee.getFirstName()+ " your credentilas are as follows ");
		System.out.println("Email--->"+email);
		System.out.println("Password--->"+generatePassword);
		
		
	}
		
}
	
	

