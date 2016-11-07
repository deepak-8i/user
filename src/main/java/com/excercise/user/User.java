package com.excercise.user;

public class User {

	private String firstName;

	private String lastName;

	private String emailId;

	private String password;

	private String rePassword;

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	public String getEmailId() {

		return emailId;
	}

	public void setEmailId(String emailId) {

		this.emailId = emailId;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public String getRePassword() {

		return rePassword;
	}

	public void setRePassword(String rePassword) {

		this.rePassword = rePassword;
	}

	@Override
	public String toString() {

		return "User [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", password=" +
				password + " , Re Password = " + rePassword + "]";
	}
}
