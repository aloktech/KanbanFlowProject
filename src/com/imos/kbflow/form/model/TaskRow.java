/**
 * 
 */
package com.imos.kbflow.form.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import com.imos.kbflow.bean.Task;

/**
 * @author Pintu
 *
 */
@Data
public class TaskRow {
	
	private List<List<Task>> allTaskList = new ArrayList<>();
	
	private List<Task> allNewList = new ArrayList<>();
	private List<Task> allocatedList = new ArrayList<>();
	private List<Task> inProgressList = new ArrayList<>();
	private List<Task> testStatusList = new ArrayList<>();
	private List<Task> readyForBuildList = new ArrayList<>();
	
	public TaskRow() {
		allTaskList.add(allNewList);
		allTaskList.add(allocatedList);
		allTaskList.add(inProgressList);
		allTaskList.add(testStatusList);
		allTaskList.add(readyForBuildList);
	}
}
