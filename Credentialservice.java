package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface Credentialservice {
	String generateEmailId(String firstname, String lastname, String dept);
	String generatePassWord();
	void showDetails(Employee e1);
	

}
