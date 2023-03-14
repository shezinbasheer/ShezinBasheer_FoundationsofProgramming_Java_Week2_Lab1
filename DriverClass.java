package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;

//com.greatlearning.model;
import com.greatlearning.service.CredentialserviceImpl;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CredentialserviceImpl cs = new CredentialserviceImpl();
		System.out.println("Enter First Name");
		String fname = sc.next();
		System.out.println("Enter Last Name");
		String lname = sc.next();
		Employee e1 = new Employee(fname,lname);
		    System.out.println("1. Admin");
		System.out.println("2. HR");		
		System.out.println("3. Techni");
		System.out.println("3. Leg");
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		String genemail ="";
		String genpassword = "";
		switch(choice) {
		
		case 1: 
			
			
			genemail =cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(),"Admin");
			
			break;
		case 2: 
			
			
			genemail = cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(),"HR" );
			
			break;
		case 3: 
		
			
			genemail =cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(),"Techni" );
			
			break;
		case 4: 
			
	
			
			genemail = cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(),"Leg" );
			
			break;
			default:
				
				System.out.println("Please enter a valid choice");
			
		}
		genpassword = cs.generatePassWord();
		e1.setEmail(genemail);
		e1.setPassword(genpassword);
		cs.showDetails(e1);
	
		}
	
			
		
		
		
		
		
		// TODO Auto-generated method stub

	}


