package com.adm.ser.inter;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.adm.ser.model.Department;

@FeignClient("DEPT-PROD")
public interface DeptFeignClient {

	@GetMapping("/dept/data")
	public String getMsg();
	
	@GetMapping("/dept/msg")
	public String getshowInfo();
	
	@GetMapping("/dept/one")
	public Department getOne();

	@GetMapping("/dept/all")
	public List<Department> getList();
}
