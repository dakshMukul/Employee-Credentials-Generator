package com.firstproject.service;

import com.firstproject.model.Employee;

public interface ICredentialsService {
	String generatePassword();

	String getEmailAddress(String firstName, String lastname,String department);

	void showCredentials(Employee employee , String email, String generatePassord);

}
