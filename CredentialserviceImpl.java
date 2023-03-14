package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialserviceImpl implements Credentialservice {

	public String generateEmailId(String firstname, String lastname, String dept) {
	
		return firstname+lastname+"@"+dept+"gl.com";
	}

	public String generatePassWord() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String splchart = "!@#$%^&*";
		String combined = caps+lower+nums+splchart;
		String mypassword = "";
		
		
		Random random = new Random();
		for(int i =0;i<8;i++) {
		
		mypassword = mypassword + String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return mypassword;
		
		
		
		
	}

	
	public void showDetails(Employee e1) {
		System.out.println("First name of the employee  " +e1.getFirstname());
		System.out.println("Last name of the employee "+ e1.getLastname());
		System.out.println("Email Id of the employee  "+ e1.getEmail());
		System.out.println("Password of the employee "+ e1.getPassword());
		// TODO Auto-generated method stub
		
	}



}
