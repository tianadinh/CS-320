/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: test class for contact class
 */

package test;

import org.junit.jupiter.api.Test;

import Contact.Contact;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

		/*
		 * testing for contact class
		 * the first 5 tests will ensure the space is not empty or no longer than character max.
		 * character max: first name and last name (10), phone number (10), and address (30).
		 * 
		 * the last 4 tests will be for checking if the space if invalid or empty. 
		 * contact id will not be tested because there is not a way to have a contact id when invalid space.
		 * cannot be updated because there is no option to update it 
		 */
		@Test
		@DisplayName("Contact ID cannot have more than 10 characters")
		void testContactIDWithMoreThanTenCharacters() {
				Contact contact = new Contact("FirstName", "LastName", "PhoneNumber", "Address");
				if (contact.getContactID().length() > 10) {
						fail("Contact ID has more than 10 characters.");
				}
		}

		@Test
		@DisplayName("Contact First Name cannot have more than 10 characters")
		void testContactFirstNameWithMoreThanTenCharacters() {
				Contact contact = new Contact("JohnSmith", "LastName", "xxxxNumber", "Address");
				if (contact.getFirstName().length() > 10) {
						fail("First Name has more than 10 characters.");
				}
		}
		
		@Test
		@DisplayName("Contact Last Name cannot have more than 10 characters")
		void testContactLastNameWithMoreThanTenCharacters() {
				Contact contact = new Contact("FirstName", "OllyOllyOxenFree", "xxxxNumber", "Address");
				if (contact.getLastName().length() > 10) {
						fail("Last Name has more than 10 characters.");
				}
		}

		@Test
		@DisplayName("Contact phone number is exactly 10 characters")
		void testContactNumberWithMoreThanTenCharacters() {
				Contact contact = new Contact("FirstName", "LastName", "0000000000", "Address");
				if (contact.getNumber().length() != 10) {
						fail("Phone number length does not equal 10.");
				}
		}

		@Test
		@DisplayName("Contact address cannot have more than 30 characters")
		void testContactAddressWithMoreThanThirtyCharacters() {
				Contact contact = new Contact("FirstName", "LastName", "xxxxNumber",
				"123456789 is nine characters long" + "123456789 is another nine characters long");
				if (contact.getAddress().length() > 30) {
						fail("Address has more than 30 characters.");
				}
		}

		@Test
		@DisplayName("Contact First Name shall not be null")
		void testContactFirstNameNotNull() {
				Contact contact = new Contact(null, "LastName", "xxxxNumber", "Address");
				assertNotNull(contact.getFirstName(), "First name was null.");
		}

		@Test
		@DisplayName("Contact Last Name shall not be null")
		void testContactLastNameNotNull() {
				Contact contact = new Contact("FirstName", null, "xxxxNumber", "Address");
				assertNotNull(contact.getLastName(), "Last name was null.");
		}

		@Test
		@DisplayName("Contact Phone Number shall not be null")
		void testContactPhoneNotNull() {
				Contact contact = new Contact("FirstName", "LastName", null, "Address");
				assertNotNull(contact.getNumber(), "Phone number was null.");
		}

		@Test
		@DisplayName("Contact Address shall not be null")
		void testContactAddressNotNull() {
				Contact contact = new Contact("FirstName", "LastName", "xxxxNumber", null);
				assertNotNull(contact.getAddress(), "Address was null.");
		}
}
