/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: test class for appointment service
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import Appointment.Appointment;
import Appointment.AppointmentService;

public class AppointmentServiceTest {

				/*
				 * the tests below will be for the AppointmentServiceClass
				 * each tests forms new service with default values in the spaces.
				 * the service request for adjustments to list and results in testing 
				 * to ensure the spaces match expectations
				 * 
				 * each point created has new appointment id, so tests depend on the appointment id 
				 * @Order annotation is used to keep tests in an order based off appointment id 
				 * 
				 * in order to check appointment id is correct, 
				 * remove service.displayAppointmentList(); comment before each one
				 */
	
				public Date Date(int i, int january, int j) {
						java.util.Date Date = null;
						return Date;
				}
	
				@Test
				@DisplayName("Test to Update appointment date")
				@Order(1)
				void testUpdateAppointmentDate() {
						AppointmentService service = new AppointmentService();
						service.addAppointment(Date(2022, Calendar.JANUARY, 1), "Description");
						service.updateAppointmentDate(Date(3022, Calendar.FEBRUARY, 2), "7");
						service.displayAppointmentList();
						assertEquals(Date(3022, Calendar.FEBRUARY, 2), service.getAppointment("7").getAppointmentDate(), "Appointment date was not updated.");
				}

				@Test
				@DisplayName("Test to Update appointment description.")
				@Order(2)
				void testUpdateAppointmentDesc() {
						AppointmentService service = new AppointmentService();
						service.addAppointment(Date(2022, Calendar.JANUARY, 1), "Description");
						service.updateAppointmentDesc("Updated Description", "9");
						service.displayAppointmentList();
						assertEquals("Updated Description", service.getAppointment("9").getAppointmentDesc(), "Appointment description was not updated.");
				}

				@Test
				@DisplayName("Test to ensure that service correctly deletes appointments.")
				@Order(3)
				void testDeleteAppointment() {
						AppointmentService service = new AppointmentService();
						service.addAppointment(Date(2022, Calendar.JANUARY, 1), "Description");
						service.deleteAppointment("11");
						// check the appointment list is empty with new empty appointment list in comparison
						ArrayList<Appointment> appointmentListEmpty = new ArrayList<Appointment>();
						service.displayAppointmentList();
						assertEquals(service.appointmentList, appointmentListEmpty, "The appointment was not deleted.");
				}

				@Test
				@DisplayName("Test to ensure that service can add an appointment.")
				@Order(4)
				void testAddAppointment() {
						AppointmentService service = new AppointmentService();
						service.addAppointment(Date(2022, Calendar.JANUARY, 1), "Description");
						service.displayAppointmentList();
						assertNotNull(service.getAppointment("1"), "Appointment was not added correctly.");
				}
	}
	
