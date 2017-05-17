package com.jay.rr.merchant.model;

public class MRegistrationServiceModel {
	
	private String firstName = null;
	private String lastName = null;
	private String email = null;
	private String password = null;
	private String add1 = null;
	
	private String add2 = null;
	private String add3 = null;
	private String city = null;
	private String state = null;
	private String pincode = null;
	private String mobile = null;
	
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getAdd3() {
		return add3;
	}
	public void setAdd3(String add3) {
		this.add3 = add3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "UserRegistrationServiceModel [firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", add1=" + add1 + ", add2=" + add2 + ", add3=" + add3
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
//	public UserRegistrationServiceModel(String firstName, String lastName, String email, String password,
//			String add1, String add2, String add3, String city, String state, String pincode) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.password = password;
//		this.add1 = add1;
//		this.add2 = add2;
//		this.add3 = add3;
//		this.city = city;
//		this.state = state;
//		this.pincode = pincode;
//	}
	
}
