package com.vinod.SpringBoot.crud.CrudOperation1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import com.vinod.SpringBoot.crud.CrudOperation1.entity.Department;
import com.vinod.SpringBoot.crud.CrudOperation1.service.DepartmentService;

@RestController
public class DepartmentController 
{
	// Annotation
	@Autowired 
	private DepartmentService departmentService;

	// Read operation
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList()
	{
		return departmentService.fetchDepartmentList();
	}

	
	//put    //http://localhost:8082/departments/41 
	// Update operation
	@PutMapping("/departments/{id}")
	public Department
	updateDepartment(@RequestBody Department department,
			@PathVariable("id") Long departmentId)
	{
		return departmentService.updateDepartment(
				department, departmentId);
	}

	
	//delete    //http://localhost:8082/departments/41 
	// Delete operation
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id")
	Long departmentId)
	{
		departmentService.deleteDepartmentById(
				departmentId);
		return "Deleted Successfully";
	}

	//http://localhost:8082/departments/
	// Save operation
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department)
	{
		System.out.println("data "+department.getDepartmentId());
		return departmentService.saveDepartment(department);
	}
}
