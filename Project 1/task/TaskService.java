/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: task service class to support tasks for adding, deleting, and updating tasks.
 */

package task;

import java.util.ArrayList;

public class TaskService {
	 	// being using Array list to hold list of tasks
		public ArrayList<Task> taskList = new ArrayList<Task>();
		
		// show list of tasks to console to check for errors 
		public void displayTaskList() {
				for (int counter = 0; counter < taskList.size(); counter++) {
						System.out.println("\t Task ID: " + taskList.get(counter).getTaskID());
						System.out.println("\t Task Name: " + taskList.get(counter).getTaskName());
						System.out.println("\t Task Description: " + taskList.get(counter).getTaskDesc());
				}
		}
		
		// insert new task using constructor from task class, assign new task to list
		public void addTask(String taskName, String taskDesc) {
					// new task created
					Task task = new Task(taskName, taskDesc);
						taskList.add(task);
		}
		
		/*
		 *  use task id, return object
		 *  if duplicate id is not found, return object to default values
		 */
		public Task getTask(String taskID) {
				Task task = new Task(null, null);
				for (int counter = 0; counter < taskList.size(); counter++) {
						if (taskList.get(counter).getTaskID().contentEquals(taskID)) {
								task = taskList.get(counter);
						}
				}
				return task;
		}
		/*
		 * deleting task
		 * using task id can find correct task to delete from list 
		 * if reaching end of list without duplicate id, report to console
		 * the method explained above is applied to all other update methods moving forward
		 */
		public void deleteTask(String taskID) {
				for (int counter = 0; counter < taskList.size(); counter++) {
						if (taskList.get(counter).getTaskID().equals(taskID)) {
								taskList.remove(counter);
								break;
						}
						if (counter == taskList.size() - 1) {
								System.out.println("Task ID: " + taskID + " not found.");
						}
				}
		}

		// task name update
		public void updateTaskName(String updatedString, String taskID) {
				for (int counter = 0; counter < taskList.size(); counter++) {
						if (taskList.get(counter).getTaskID().equals(taskID)) {
								taskList.get(counter).setTaskName(updatedString);
								break;
						}
						if (counter == taskList.size() - 1) {
								System.out.println("Task ID: " + taskID + " not found.");
						}
				}
		}

		// task description update
		public void updateTaskDesc(String updatedString, String taskID) {
				for (int counter = 0; counter < taskList.size(); counter++) {
						if (taskList.get(counter).getTaskID().equals(taskID)) {
								taskList.get(counter).setTaskDesc(updatedString);
								break;
						}
						if (counter == taskList.size() - 1) {
								System.out.println("Task ID: " + taskID + " not found.");
						}
				}
		}
}

