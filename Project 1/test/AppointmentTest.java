/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: test class for appointment 
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.Calendar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Appointment.Appointment;

public class AppointmentTest {
	
		/*
		 * the tests are for appointment class
		 * the first 2 tests are to ensure the space is not > than constraint 
		 * characters max: task id (10), description (50)
		 * 
		 * the last 2 tests ensure the field is not invalid
		 * appointment id will not be tested because an appointment cannot be created when empty.
		 * cannot be updated because there is no option to update it 
		 */
		private Date Date(int i, int january, int j) {
				return null;
		}
	
		@Test
		@DisplayName("Appointment ID cannot have more than 10 characters")
		void testAppointmentIDWithMoreThanTenCharacters() {
				Appointment appointment = new Appointment(Date(2024, Calendar.JANUARY, 1), "Description");
				if (appointment.getAppointmentID().length() > 10) {
						fail("Appointment ID has more than 10 characters.");
				}
		}	

		@Test
		@DisplayName("Task Description cannot have more than 50 characters")
		void testAppointmentDescWithMoreThanFiftyCharacters() {
				Appointment appointment = new Appointment(Date(2024, Calendar.JANUARY, 1), "123456789 is nine characters long" 
								+ "123456789 is another nine characters long" 
								+ "123456789 is another nine characters long"
								+ "123456789 is another nine characters long");
				if (appointment.getAppointmentDesc().length() > 50) {
					fail("Appointment Description has more than 50 characters.");
				}
		}
	
		@Test
		@DisplayName("Appointment Date cannot be before current date")
		void testAppointmentDateBeforeCurrent() {
				Appointment appointment = new Appointment(Date(2024, Calendar.JANUARY, 1), "Description");
				if (appointment.getAppointmentDate().before(new Date())) {
						fail("Appointment Date is before current date.");
				}
		}

		@Test
		@DisplayName("Task Date shall not be null")
		void testAppointmentDateNotNull() {
				Appointment appointment = new Appointment(null, "Description");
				assertNotNull(appointment.getAppointmentDate(), "Appointment Date was null.");
	}
	
		@Test
		@DisplayName("Task Description shall not be null")
		void testAppointmentDescNotNull() {
				Appointment task = new Appointment(Date(2024, Calendar.JANUARY, 1), null);
				assertNotNull(task.getAppointmentDesc(), "Appointment Description was null.");
		}
}

