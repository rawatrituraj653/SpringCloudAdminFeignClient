package com.adm.ser.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department {


	private Integer deptNo;
	private String deptName;
	private String location; 
}
