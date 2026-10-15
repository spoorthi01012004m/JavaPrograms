package com.stringbuffer;

public class ToDoList {
	StringBuffer sb;

	public ToDoList(StringBuffer sb) {
		super();
		this.sb = sb;
	}

	public void addTask(String taskToAdd) {
		sb.append(taskToAdd);

	}
	public void updateTask(String updateTask) {
		sb.insert(sb.length(), updateTask);
	}
	public void removeTask(StringBuffer taskToRemove) {
		taskToRemove.delete(0, sb.length());
	}

}
