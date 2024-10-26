/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: test class for contact service 
 */

package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import Contact.Contact;
import Contact.ContactService;

import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

		/*
		 * the tests are for contact service class. 
		 * each test has a new service with default values in each space. then the service will 
		 * ask for adjustments on the contact list, and the results should 
		 * test to ensure expectations that everything matches
		 * 
		 * contacts created will automatically assign a contact id, the tests will be based off 
		 * the id, so the @Order annotation will be used to keep tests in order 
		 * 
		 * for proof that the tests are correct, remove service.displayContactList(); before 
		 */
		@Test
		@DisplayName("Test to Update First Name.")
		@Order(1)
		void testUpdateFirstName() {
				ContactService service = new ContactService();
				service.addContact("Dr.", "Smith", "0000000000", "123 Logitech Ave");
				service.updateFirstName("Sven", "9");
				service.displayContactList();
				assertEquals("Sven", service.getContact("9").getFirstName(), "First name was not updated.");
		}	

		@Test
		@DisplayName("Test to Update Last Name.")
		@Order(2)
		void testUpdateLastName() {
				ContactService service = new ContactService();
				service.addContact("Dr.", "Smith", "0000000000", "123 Logitech Ave");
				service.updateLastName("Shirley", "11");
				service.displayContactList();
				assertEquals("Shirley", service.getContact("11").getLastName(), "Last name was not updated.");
		}

		@Test
		@DisplayName("Test to update phone number.")
		@Order(3)
		void testUpdatePhoneNumber() {
				ContactService service = new ContactService();
				service.addContact("Dr.", "Smith", "0000000000", "123 Logitech Ave");
				service.updateNumber("5555550000", "13");
				service.displayContactList();
				assertEquals("5555550000", service.getContact("13").getNumber(), "Phone number was not updated.");
		}

		@Test
		@DisplayName("Test to update address.")
		@Order(4)
		void testUpdateAddress() {
				ContactService service = new ContactService();
				service.addContact("Dr.", "Smith", "0000000000", "123 Logitech Ave");
				service.updateAddress("555 Nowhere Ave", "15");
				service.displayContactList();
				assertEquals("555 Nowhere Ave", service.getContact("15").getAddress(), "Address was not updated.");
		}

		@Test
		@DisplayName("Test to ensure that service correctly deletes contacts.")
		@Order(5)
		void testDeleteContact() {
				ContactService service = new ContactService();
				service.addContact("Dr.", "Smith", "0000000000", "123 Logitech Ave");
				service.deleteContact("17");
				// to check contact list is empty, create a new empty contact list for comparison
				ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
				service.displayContactList();
				assertEquals(service.contactList, contactListEmpty, "The contact was not deleted.");
		}

		@Test
		@DisplayName("Test to ensure that service can add a contact.")
		@Order(6)
		void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Smith", "0000000000", "123 Logitech Ave");
		service.displayContactList();
		assertNotNull(service.getContact("0"), "Contact was not added correctly.");
		}

}

