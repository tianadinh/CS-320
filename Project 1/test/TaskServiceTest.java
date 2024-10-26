/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: test class for task service 
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import Task.Task;
import Task.TaskService;


public class TaskServiceTest {
	
			/*
			 * tests for the task service class
			 * each test creates a new service with default values in the spaces 
			 * the service will ask for adjustments to change to the list and the 
			 * results will check if they meet expectations 
			 * 
			 * each task creates a new task id, so the tests will be work with the task id
			 * the @Order annotation keeps the tests in order
			 * 
			 * for proof that the task id is valid, remove service.displayTaskList(); comment
			 * before each assertion
			 */

			@Test
			@DisplayName("Test to Update task name")
			@Order(1)
			void testUpdateTaskName() {
					TaskService service = new TaskService();
					service.addTask("Task Name", "Description");
					service.updateTaskName("Updated Task Name", "3");
					service.displayTaskList();
					assertEquals("Updated Task Name", service.getTask("3").getTaskName(), "Task name was not updated.");
			}

			@Test
			@DisplayName("Test to Update task description.")
			@Order(2)
			void testUpdateTaskDesc() {
					TaskService service = new TaskService();
					service.addTask("Task Name", "Description");
					service.updateTaskDesc("Updated Description", "1");
					service.displayTaskList();
					assertEquals("Updated Description", service.getTask("1").getTaskDesc(), "Task description was not updated.");
			}
			
			@Test
			@DisplayName("Test to ensure that service correctly deletes tasks.")
			@Order(5)
			void testDeleteContact() {
					TaskService service = new TaskService();
					service.addTask("Task Name", "Description");
					service.deleteTask("0");
					// to check if contact list is empty, create a new empty contact list for comparison
					ArrayList<Task> taskListEmpty = new ArrayList<Task>();
					service.displayTaskList();
					assertEquals(service.taskList, taskListEmpty, "The contact was not deleted.");
			}
			
			@Test
			@DisplayName("Test to ensure that service can add a task.")
			@Order(6)
			void testAddContact() {
				TaskService service = new TaskService();
				service.addTask("Task Name", "Description");
				service.displayTaskList();
				assertNotNull(service.getTask("0"), "Task was not added correctly.");
			}
	}

