/*
 * Student: Tiana Dinh
 * Class: CS-320
 * Date: 13 October 2024
 * Info: test class for task 
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Task.Task;

public class TaskTest {
			/* 
			 * these tests are for the task class
			 * the first 3 tests ensure space does not pass the character max
			 * character max: task id (10), task name (20), description (50).
			 * 
			 * the last 2 tests check the space foe invalid or empty
			 * task id will not be tested because a task id cannot be created 
			 * this is not changeable 
			 */

			@Test
			@DisplayName("Task ID cannot have more than 10 characters")
			void testTaskIDWithMoreThanTenCharacters() {
					Task task = new Task("Name", "Description");
					if (task.getTaskID().length() > 10) {
							fail("Task ID has more than 10 characters.");
					}
			}

			@Test
			@DisplayName("Task Name cannot have more than 20 characters")
			void testTaskNameWithMoreThanTwentyCharacters() {
					Task task = new Task("OllyOllyOxenFreeOllyOllyOxenFree", "Description");
					if (task.getTaskName().length() > 20) {
							fail("Task Name has more than 20 characters.");
					}
			}

			@Test
			@DisplayName("Task Description cannot have more than 50 characters")
			void testTaskDescWithMoreThanFiftyCharacters() {
					Task task = new Task("Name", "123456789 is nine characters long" 
								+ "123456789 is another nine characters long" 
								+ "123456789 is another nine characters long"
								+ "123456789 is another nine characters long");
					if (task.getTaskDesc().length() > 50) {
							fail("Task Description has more than 50 characters.");
					}
			}

			@Test
			@DisplayName("Task Name shall not be null")
			void testTaskNameNotNull() {
					Task task = new Task(null, "Description");
					assertNotNull(task.getTaskName(), "Task Name was null.");
			}
	
			@Test
			@DisplayName("Task Description shall not be null")
			void testTaskDescNotNull() {
					Task task = new Task("Name", null);
					assertNotNull(task.getTaskDesc(), "Task Description was null.");
			}
}

