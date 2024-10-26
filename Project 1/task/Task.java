/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: task class to store information for task and create it as well
 */

package task;

import java.util.concurrent.atomic.AtomicLong;

public class Task {
		private final String taskID;
		private String taskName;
		private String taskDesc;
		private static AtomicLong idGenerator = new AtomicLong();
		
		// constructors 
		/*
		 * constructor will call task id, task name, and description as default
		 * defaults will scan for empty fields or invalid fields.
		 * in the event that there is an invalid field, the phrase "null" will fill space
		 * character max: task id (10), task name (20), description (50).
		 */
		public Task(String taskName, String taskDesc) {
			
				// task id 
				/* 
				 * task id is created when constructor is used, set to final variable
				 * no other getters/setters to it cannot be changed 
				 * id is static to prevent duplicates
				 */
				this.taskID = String.valueOf(idGenerator.getAndIncrement());
			
				if (taskName == null || taskName.isEmpty()) {
							this.taskName = "NULL";
				} else if (taskName.length() > 20) {
						this.taskName = taskName.substring(0, 20);
				} else {
						this.taskName = taskName;
				}
				
				if (taskDesc == null || taskDesc.isEmpty()) {
						this.taskDesc = "NULL";
				} else if (taskDesc.length() > 50) {
						this.taskDesc = taskDesc.substring(0, 50);
				} else {
						this.taskDesc = taskDesc;
				}
		}
		
		// GETTERS
		public String getTaskID() {
				return taskID;
		}
		
		public String getTaskName() {
				return taskName;
		}	
		
		public String getTaskDesc() {
				return taskDesc;
		}
		
		// setters
		/*
		 * setters applies same rules as constructor
		 */
		public void setTaskName(String taskName) {
				if (taskName == null || taskName.isEmpty()) {
						this.taskName = "NULL";
				} else if (taskName.length() > 20) {
						this.taskName = taskName.substring(0, 20);
				} else {
						this.taskName = taskName;
				}
		}
		
		public void setTaskDesc(String taskDesc) {
				if (taskDesc == null || taskDesc.isEmpty()) {
						this.taskDesc = "NULL";
				} else if (taskDesc.length() > 50) {
						this.taskDesc = taskDesc.substring(0, 50);
				} else {
						this.taskDesc = taskDesc;
				}
		}
}
