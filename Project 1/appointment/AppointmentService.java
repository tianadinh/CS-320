/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: Appointment service class helps support appointment and its foundation by adding deleting and updating information
 */

package appointment;

import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {
		// Begin with Array list to contain list for appointments 
		public ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
		
		// Display appointment list to check for errors to the console
		public void displayAppointmentList() {
				for (int counter = 0; counter < appointmentList.size(); counter++) {
						System.out.println("\t Appointment ID: " + appointmentList.get(counter).getAppointmentID());
						System.out.println("\t Appointment Date: " + appointmentList.get(counter).getAppointmentDate());
						System.out.println("\t Appointment Description: " + appointmentList.get(counter).getAppointmentDesc());
				}
		}

		// insert new appointment using the constructor, then assign according to the list 
		public void addAppointment(Date appointmentDate, String appointmentDesc) {
				// new appointment creation
				Appointment appointment = new Appointment(appointmentDate, appointmentDesc);
				appointmentList.add(appointment);
		}
		
		// by using the appointment id, return object
		// if id cannot be found, use default values in place of it 
		public Appointment getAppointment(String appointmentID) {
				Appointment appointment = new Appointment(null, null);
				for (int counter = 0; counter < appointmentList.size(); counter++) {
						if (appointmentList.get(counter).getAppointmentID().contentEquals(appointmentID)) {
								appointment = appointmentList.get(counter);
						}
				}
				return appointment;
		}
		/*
		 * next is to create an method to delete appointment
		 * to find the correct appointment to delete, use appointment id 
		 * report back to console if no duplicate id found
		 */
		public void deleteAppointment(String appointmentID) {
				for (int counter = 0; counter < appointmentList.size(); counter++) {
						if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
								appointmentList.remove(counter);
								break;
						}
						if (counter == appointmentList.size() - 1) {
								System.out.println("Appointment ID: " + appointmentID + " not found.");
						}
				}
		}

				// date update for appointment.
		public void updateAppointmentDate(Date updatedDate, String appointmentID) {
				for (int counter = 0; counter < appointmentList.size(); counter++) {
						if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
								appointmentList.get(counter).setAppointmentDate(updatedDate);
								break;
						}
						if (counter == appointmentList.size() - 1) {
								System.out.println("Appointment ID: " + appointmentID + " not found.");
						}
				}
		}

				// description update for appointment.
		public void updateAppointmentDesc(String updatedString, String appointmentID) {
				for (int counter = 0; counter < appointmentList.size(); counter++) {
						if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
								appointmentList.get(counter).setAppointmentDesc(updatedString);
								break;
						}
						if (counter == appointmentList.size() - 1) {
								System.out.println("Appointment ID: " + appointmentID + " not found.");
						}
				}
		}
}
