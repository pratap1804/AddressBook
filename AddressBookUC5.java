package com.addressbook;

import java.util.*;

public class AddressBook {
	
	HashMap<String, Person>list = new HashMap<String, Person>();

	Scanner sc = new Scanner(System.in);

	static AddressBook book = new AddressBook();
	public static void Main(String[] args) {
	}
	public static void main(String args[]) {
	book.getUserChoice();
	}

	@Override
	protected void finalize() throws Throwable {
		sc.close();
	}
	
	public void updateContact() {
	System.out.println("Enter E-mail");
	String Email = sc.next();
	
	if(list.containsKey(Email) == false) {
		System.out.println("E-mail Not Found");
		updateContact();
	}
	
	Person person = list.get(Email);
	System.out.println("1: First Name");
	System.out.println("2: Last Name");
	System.out.println("3: Address");
	System.out.println("4: City");
	System.out.println("5: State");
	System.out.println("6: Zip");
	System.out.println("7: Phone Number");
	
	int option = sc.nextInt();
	
	switch(option) {
	
	case 1:
		System.out.println("Enter First Name");
		String firstName = sc.nextLine();
		person.setFirstName(firstName);
		break;
	case 2:
		System.out.println("Enter Last Name");
		String lastName = sc.nextLine();
		person.setLastName(lastName);
		break;
	case 3:
		System.out.println("Enter Address");
		String address = sc.nextLine();
		person.setAddress(address);
		break;
	case 4:
		System.out.println("Enter City");
		String city = sc.nextLine();
		person.setCity(city);
		break;
	case 5:
		System.out.println("Enter State");
		String state = sc.nextLine();
		person.setState(state);
		break;
	case 6:
		System.out.println("Enter Zip");
		String zip = sc.nextLine();
		person.setZip(zip);
		break;
	case 7:
		System.out.println("Enter Phone Number");
		String phoneNumber = sc.nextLine();
		person.setPhoneNumber(phoneNumber);
		break;
	default:
		System.out.println("Enter Valid Input");
		}
	}

	public void deleteContact() {
		System.out.println("Enter E-mail");
		String eMail = sc.nextLine();
		if(!list.containsKey(eMail)) {
			System.out.println("Enter Correct E-mail");
				deleteContact();
		}
		list.remove(eMail);
		System.out.println("Conatct Deleted");
	}
	
	private Person getUserInput() {
		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Last Name: ");
		String lastName = sc.nextLine();
		
		System.out.println("Enter Address: ");
		String address = sc.nextLine();
		
		System.out.println("Enter City:");
		String city = sc.nextLine();
		
		System.out.println("Enter State: ");
		String state = sc.nextLine();
		
		System.out.println("Enter Zip: ");
		String zip = sc.nextLine();
		
		System.out.println("Enter E-mail: ");
		String eMail = sc.nextLine();
		
		System.out.println("Enter Phone Number: ");
		String phoneNumber = sc.nextLine();
		
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setCity(city);
		person.setState(state);
		person.setZip(zip);
		person.setEmail(eMail);
		person.setPhoneNumber(phoneNumber);
		return person;
	}
	
	void getUserChoice() {
		boolean condition = false;
		while(!condition) {
			System.out.println("Enter 1 For Adding A Contact");
			System.out.println("Enter 2 For Displaying Contacts");
			System.out.println("Enter 3 For Update A Contact");
			System.out.println("Enter 4 For Deleting A Contact");
			System.out.println("Enter 5 To Do Nothing");
			int userOption = sc.nextInt();
			
			switch(userOption) {
			case 1:
				Person person = book.getUserInput();
				list.put(person.getEmail(), person);
				break;
				
			case 2:
				System.out.println(list);
				break;
				
			case 3:
				book.updateContact();
				break;
			case 4:
				book.deleteContact();
				break;
			case 5:
				condition =true;
				default:
					System.out.println("Pass A Valid Argument");
				}
			}
		}
	}
