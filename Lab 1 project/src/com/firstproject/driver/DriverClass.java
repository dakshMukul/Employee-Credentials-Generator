package com.firstproject.driver;

import java.util.Scanner;

import com.firstproject.model.Employee;
import com.firstproject.service.CredentialsService;

public class DriverClass {
	private static final CredentialsService credentialsService = new CredentialsService();
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please entre Your first name and last name");
		String firstName = sc.nextLine();
		String lastname = sc.nextLine();
		
		Employee employee = new Employee(" firstName ", "lastname");
		String generateEmail;
		String generatPassword;
		
		System.out.println("Please entre the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int departmentNumber = sc.nextInt();
		
		switch(departmentNumber) {
		case 1: {generatPassword = credentialsService.generatePassword();
		         generateEmail = credentialsService.getEmailAddress(firstName,lastname,"Tehchnical");
		         credentialsService.showCredentials(employee, generateEmail, generatPassword);
		}     break;
		case 2: {generatPassword = credentialsService.generatePassword();
                 generateEmail = credentialsService.getEmailAddress(firstName,lastname,"Admin");
                 credentialsService.showCredentials(employee, generateEmail, generatPassword);
}     break;
		case 3: {generatPassword = credentialsService.generatePassword();
                generateEmail = credentialsService.getEmailAddress(firstName,lastname,"Human Resourse");
                credentialsService.showCredentials(employee, generateEmail, generatPassword);
}     break;
		case 4: {generatPassword = credentialsService.generatePassword();
                generateEmail = credentialsService.getEmailAddress(firstName,lastname,"Legal");
                credentialsService.showCredentials(employee, generateEmail, generatPassword);
}     break;
		
		}
	}

}
