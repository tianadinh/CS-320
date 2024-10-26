/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: Contact class to create information and hold it.
 */

package contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
		private final String contactID;
		private String firstName;
		private String lastName;
		private String number;
		private String address;
		private static AtomicLong idGenerator = new AtomicLong();

		
		// constructor 
		/*
		 * constructor has first name, last, name, phone number, and address as default values. 
		 * constructor initially generates a random new id for the contact id space.
		 * 
		 * first name and last name are scanned for empty spaces and invalid spaces. 
		 * if in any case one of those options happen, the space will have the word "null" in place.
		 * characters max: first name (10), last name (10), number (10).
		 * 
		 * if number space is empty, the space will be filled with "0000000000".
		 * 
		 * address applies same condition as first name and last name if space is empty.
		 * character max: address (30)
		 */
	public Contact(String firstName, String lastName, String number, String address) {
		
			// contact id 
			/* 
			 * contact id is created when constructor is used. 
			 * it sets final variable with no other getter/setter (no changes)
			 * id will be static to prevent duplicates
			 */
			this.contactID = String.valueOf(idGenerator.getAndIncrement());
		
		
			// first name
			if (firstName == null || firstName.isEmpty()) {
					this.firstName = "NULL";
			// if first name is > 10, use first 10 letters
			} else if (firstName.length() > 10) {
					this.firstName = firstName.substring(0, 10);
			} else {
					this.firstName = firstName;
			}

			// last name 
			if (lastName == null || lastName.isEmpty()) {
					this.lastName = "NULL";
			} else if (lastName.length() > 10) {
					this.lastName = lastName.substring(0, 10);
			} else {
					this.lastName = lastName;
			}
		
			// number 
			if (number == null || number.isEmpty() || number.length() != 10) {
					this.number = "0000000000";
			} else {
					this.number = number;
			}
		
			// address
			if (address == null || address.isEmpty()) {
					this.address = "NULL";
			} else if (address.length() > 30) {
					this.address = address.substring(0, 30);
			} else {
					this.address = address;
			}
	}
	

			// getters 
			public String getContactID() {
					return contactID;
			}

			public String getFirstName() {
					return firstName;
			}

			public String getLastName() {
					return lastName;
			}

			public String getNumber() {
					return number;
			}

			public String getAddress() {
					return address;
			}
		
			// setters
			/*
			 * setter will follow the same foundation as constructor 
			 */
			public void setFirstName(String firstName) {
					if (firstName == null || firstName.isEmpty()) {
							this.firstName = "NULL";

					// if first name is > 10, use first 10 letters
					} else if (firstName.length() > 10) {
							this.firstName = firstName.substring(0, 10);
					} else {
							this.firstName = firstName;
					}
			}

			public void setLastName(String lastName) {
					if (lastName == null || lastName.isEmpty()) {
							this.lastName = "NULL";
					} else if (lastName.length() > 10) {
							this.lastName = lastName.substring(0, 10);
					} else {
							this.lastName = lastName;
					}
			}

			public void setNumber(String number) {
					if (number == null || number.isEmpty() || number.length() != 10) {
							this.number = "5555555555";
					} else {
							this.number = number;
					}
			}

			public void setAddress(String address) {
					if (address == null || address.isEmpty()) {
							this.address = "NULL";
					} else if (address.length() > 30) {
							this.address = address.substring(0, 30);
					} else {
							this.address = address;
					}
			}
	}

