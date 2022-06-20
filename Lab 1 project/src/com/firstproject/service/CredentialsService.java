package com.firstproject.service;

import java.util.Random;

import com.firstproject.model.Employee;

public class CredentialsService implements ICredentialsService {

	@Override
	public String generatePassword() {
		String capitalLetters ="ABCDEFGHTJKLMNOPQRSTUWXYZ";
		String smallCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacter = "@#$%!";
		String values = capitalLetters + smallCaseLetters +numbers+ specialCharacter;
		
		StringBuffer strBuffer = new StringBuffer("");
		Random random = new Random();
		
		 for(int index = 0; index<8;index++) {
			int ramdomCharacter = random.nextInt(values.length());
			 strBuffer.append(values.charAt(ramdomCharacter));
		 }
		 return strBuffer.toString();
	}

	@Override
	public String getEmailAddress(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".abc"+".com";
	}

	@Override
	public void showCredentials(Employee employee, String email, String generatePassord) {
		System.out.println("Dear "+employee.getFirstName()  + "your generated credentials are as follows ");
		System.out.println("Email ->" + email);
		System.out.println("password ->" + generatePassword());
		
	}
	

}
