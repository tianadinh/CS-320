/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: Contact service class for supporting contact list by adding, deleting, and updating the contact list
 * It will also update names, addresses, numbers
 */

package contact;

import java.util.ArrayList;

public class ContactService {
		// begin with Array to contain list of appointments
		public ArrayList<Contact> contactList = new ArrayList<Contact>();
		
		// display contact list for error checking to console 
		public void displayContactList() {
				for (int counter = 0; counter < contactList.size(); counter++) {
						System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
						System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
						System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
						System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
						System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
				}	
		}
		
		// new contact list added by contact constructor, and assign new contact
		public void addContact(String firstName, String lastName, String number, String address) {
				// new contact created
				Contact contact = new Contact(firstName, lastName, number, address);
				contactList.add(contact);
		}
		
		/* 
		 * use contact id, return object
		 * if duplicate id is not found, return contact to default values
		 */
		public Contact getContact(String contactID) {
				Contact contact = new Contact(null, null, null, null);
				for (int counter = 0; counter < contactList.size(); counter++) {
						if (contactList.get(counter).getContactID().contentEquals(contactID)) {
								contact = contactList.get(counter);
						}
				}
				return contact;
		}

		/*
		 * delete contact method below
		 * by using contact id, the correct contact can be removed from the list 
		 * if no duplicates are found, report to console of no duplicates
		 * method of finding duplicates is used for all updates below
		 */
		public void deleteContact(String contactID) {
				for (int counter = 0; counter < contactList.size(); counter++) {
						if (contactList.get(counter).getContactID().equals(contactID)) {
								contactList.remove(counter);
								break;
						}
						if (counter == contactList.size() - 1) {
								System.out.println("Contact ID: " + contactID + " not found.");
						}
				}
		}
		
		// first name update
		public void updateFirstName(String updatedString, String contactID) {
				for (int counter = 0; counter < contactList.size(); counter++) {
						if (contactList.get(counter).getContactID().equals(contactID)) {
								contactList.get(counter).setFirstName(updatedString);
								break;
				}
						if (counter == contactList.size() - 1) {
								System.out.println("Contact ID: " + contactID + " not found.");
						}
				}
		}

		// last name update
		public void updateLastName(String updatedString, String contactID) {
				for (int counter = 0; counter < contactList.size(); counter++) {
						if (contactList.get(counter).getContactID().equals(contactID)) {
								contactList.get(counter).setLastName(updatedString);
								break;
				}
						if (counter == contactList.size() - 1) {
								System.out.println("Contact ID: " + contactID + " not found.");
						}
				}
		}	

		// phone number update
		public void updateNumber(String updatedString, String contactID) {
				for (int counter = 0; counter < contactList.size(); counter++) {
						if (contactList.get(counter).getContactID().equals(contactID)) {
								contactList.get(counter).setNumber(updatedString);
								break;
				}
						if (counter == contactList.size() - 1) {
								System.out.println("Contact ID: " + contactID + " not found.");
						}
				}
		}

		// address update 
		public void updateAddress(String updatedString, String contactID) {
				for (int counter = 0; counter < contactList.size(); counter++) {
						if (contactList.get(counter).getContactID().equals(contactID)) {
								contactList.get(counter).setAddress(updatedString);
								break;
				}
						if (counter == contactList.size() - 1) {
								System.out.println("Contact ID: " + contactID + " not found.");
						}
				}
		}
}
