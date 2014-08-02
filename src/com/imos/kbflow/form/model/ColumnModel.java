/**
 * 
 */
package com.imos.kbflow.form.model;

import java.io.Serializable;

import lombok.Data;


/**
 * @author Pintu
 *
 */
@Data
public class ColumnModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3504050067894850249L;
	
	private String header, description, methodName;
	private int maxTaskCount;
	
	public ColumnModel(String header, String description) {
		this(header, description, 0);
	}
	
	public ColumnModel(String header, String description, int maxTaskCount) {
		this(header, description, null, maxTaskCount);
	}
	
	public ColumnModel(String header, String description, String methodName, int maxTaskCount) {
		this.header = header;
		this.description = description;
		this.maxTaskCount = maxTaskCount;
		this.methodName = methodName;
	}
}
