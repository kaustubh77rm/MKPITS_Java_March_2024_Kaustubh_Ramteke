package assgn_14.linkedlist.assignment6;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskManagementSystem {
	LinkedList<Task> linkedList;

	public TaskManagementSystem() {
		linkedList = new LinkedList<Task>();
	}

	public void addtask(Task task) {
		linkedList.add(task);
	}

	public void removeById(String id) {
		Iterator<Task> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Task task = iterator.next();
			if (task.getTaskidString().equals(id)) {
				iterator.remove();
				System.out.println("Task with id " + id + " deleted.");
				return;
			}
		}
		System.out.println("Task with id " + id + " not found.");
	}

	public void searchById(String id) {
		Iterator<Task> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Task task = iterator.next();
			if (task.getTaskidString().equals(id)) {
				System.out.println("Task found: " + task);
				return;
			}
		}
		System.out.println("Task with id " + id + " not found.");
	}

	public void sort() {
		Collections.sort(linkedList, new DatesComparator());
	}

	public void display() {
		for (Task task : linkedList) {
			System.out.println(task);
		}
	}
}
