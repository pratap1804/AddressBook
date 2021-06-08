import java.util.Scanner;

public class AddressBookDetails {

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book");

		PersonalInformation person = new PersonalInformation();
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


	PersonalInformation(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		firstName = sc.nextLine();
		System.out.println("Enter Last Name: ");
		lastName = sc.nextLine();
		System.out.println("Enter Age of The Person: ");
		age = sc.nextInt();
		System.out.println("Enter Address: ");
		address = sc.nextLine();
		System.out.println("Enter The City: ");
		city = sc.nextLine();
		System.out.println("Enter State: ");
		state = sc.nextLine();
		System.out.println("Enter PinCode: ");
		zip = sc.nextInt();
		System.out.println("Enter Phone Numner: ");
		phoneNumber = sc.nextInt();
		System.out.println("Enter E-Mail: ");
		eMail = sc.nextLine();

		}
	}
}
