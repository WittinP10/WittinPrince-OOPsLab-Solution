package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface ICredentialService {

	public String generatePassword();
	
	public String generateEmailAddress(String firstName,String lastName,String department);
	
	public void showCredentials(Employee emp,String email,String generatePassword);
	
}
