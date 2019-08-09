package com.adm.ser.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adm.ser.inter.DeptFeignClient;
import com.adm.ser.model.Department;

@RestController
@RequestMapping("/admin")
public class AdminRestController {
 
	@Autowired
	private  DeptFeignClient client;
	
	@GetMapping("/data")
	public String getData() {
		String data=client.getshowInfo();
			
	return "ADMin Prod: "+data+client.getClass().getName();
	}
	
	@GetMapping("/msg")
	public String getMsg() {
		String msg=client.getMsg();
		
		return "Admin Prod:: "+msg+client.toString();
	}
	@GetMapping("/one")
	public Department getDept() {
		
		return client.getOne();
	}
	
	@GetMapping("/all")
	public List<Department> getAll(){
	
		return client.getList();
	}
}
