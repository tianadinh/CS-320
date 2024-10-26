/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: Appointment class that creates information about appointment(s)
 */

package appointment;

import java.util.concurrent.atomic.AtomicLong;
import java.util.Calendar;
import java.util.Date;

public class Appointment {
		private final String appointmentID;
		private Date appointmentDate;
		private String appointmentDesc;
		private static AtomicLong idGenerator = new AtomicLong();

		// constructor
		/* 
		 * Constructor will take ID, date, and the details as foundation and check if empty/null
		 * In the event that empty/null is happening, the space will be filled in with "Null" for protection
		 * ID has a max of 10 characters, date has a max of 20 characters, and description will have max 50.
		 * 
		 */
		
		@SuppressWarnings("deprecation")
		public Appointment(Date appointmentDate, String appointmentDesc) {
		
				// appointment id generates random id when constructor is used. 
				/* it will has its final variable and no getter/setter can change it 
				 * id will be static and cannot be changed
				 */
				this.appointmentID = String.valueOf(idGenerator.getAndIncrement());

				if (appointmentDate == null) {
						this.appointmentDate = new Date(2022, Calendar.JANUARY, 1);
				} else if (appointmentDate.before(new Date())) {
					throw new IllegalArgumentException("Cannot make appointment before current date.");
				} else {
						this.appointmentDate = appointmentDate;
				}	
			
				if (appointmentDesc == null || appointmentDesc.isEmpty()) {
						this.appointmentDesc = "NULL";
				} else if (appointmentDesc.length() > 50) {
						this.appointmentDesc = appointmentDesc.substring(0, 50);
				} else {
						this.appointmentDesc = appointmentDesc;
				}
		}

				// getters 
				public String getAppointmentID() {
						return appointmentID;
				}
		
				public Date getAppointmentDate() {
						return appointmentDate;
				}
		
				public String getAppointmentDesc() {
						return appointmentDesc;
				}
				
				// setters 
				/*
				 * setter has the same applied rules as constructor 
				 * 
				 */
				@SuppressWarnings("deprecation")
				public void setAppointmentDate(Date appointmentDate) {
						if (appointmentDate == null) {
								appointmentDate = new Date(2022, Calendar.JANUARY, 1);
						} else if (appointmentDate.before(new Date())) {
								throw new IllegalArgumentException("Cannot make appointment before current date.");
						} else {
								this.appointmentDate = appointmentDate;
						}
				}
				
				public void setAppointmentDesc(String appointmentDesc) {
						if (appointmentDesc == null || appointmentDesc.isEmpty()) {
								this.appointmentDesc = "NULL";
						} else if (appointmentDesc.length() > 50) {
								this.appointmentDesc = appointmentDesc.substring(0, 50);
						} else {
								this.appointmentDesc = appointmentDesc;
						}
				}
	}

		
