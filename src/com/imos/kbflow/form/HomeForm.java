/**
 * 
 */
package com.imos.kbflow.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Data;

import com.imos.kbflow.bean.Task;
import com.imos.kbflow.form.model.ColumnModel;
import com.imos.kbflow.form.model.TaskRow;

/**
 * @author Pintu
 *
 */
@ManagedBean(name="homePage")
@SessionScoped
@Data
public class HomeForm implements Serializable {
	
	private List<ColumnModel> columnsList = new ArrayList<>();
	
	private TaskRow taskrows;
	
	private String[] headers = {"Work to do", "New Work", "Work in Progress", "Test Status", "Ready for build"};
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2787766428015407342L;

	@PostConstruct
	public void configuration() {
		
		populateColumns();
		
		populateTable();
	}

	public void populateTable() {
		taskrows = new TaskRow();
		taskrows.getAllTaskList().get(0).add(new Task());
		taskrows.getAllTaskList().get(1).add(new Task());
		taskrows.getAllTaskList().get(2).add(new Task());
		taskrows.getAllTaskList().get(3).add(new Task());
		taskrows.getAllTaskList().get(4).add(new Task());
	}
	
	public void populateColumns() {
		for (String columnHeader : headers) {
			columnsList.add(new ColumnModel(columnHeader, columnHeader.toLowerCase()));
		}
	}
	
}
