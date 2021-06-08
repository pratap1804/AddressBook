package com.address;

public class AddressBookDetails {

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book");
		
	}
	
	public class PersonalInformation {
		
		private String firstName;
		private String lastName;
		private int age;
		private String address;
		private String city;
		private String state;
		private int zip;
		private int phoneNumber;
		private String eMail;
		
	
	PersonalInformation(String firstName, String lastName, int age, String address, String city, String state, int zip, int phoneNumber, String eMail){
		
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.age=age;
		 this.address=address;
		 this.city=city;
		 this.state=state;
		 this.zip=zip;
		 this.phoneNumber=phoneNumber;
		 this.eMail=eMail;
		}
	
	public PersonalInformation(String firstName) {
	    this.firstName = firstName;
		}


	public PersonalInformation(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
		}
	
	
	public String getfirstName() {
	return firstName;	
		}
	
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
		}
	
	
	public String getlastName() {
		return lastName;
		}
	
	public void setLastName(String lastName) {
	    this.lastName = lastName;
		}
	
	
	public int getAge() {
		return age;
		}
	
	public void setAge(int age) {
		this.age = age;
		}
	
	public String getaddress() {
		return address;
		}
	
	public void setAddress( String address) {
		this.address = address;
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
	
	public int getZip() {
		return zip;
		}
	
	public void setZip(int zip) {
		this.zip = zip;
		}
	
	
	public int getPhoneNumber() {
		return phoneNumber;
		}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
		}
	
	public String getEmail() {
		return eMail;
		}
	
	public void setEmail(String eMail) {
		this.eMail = eMail;
		}
	
	}
}
