package com.vinod.SpringBoot.crud.CrudOperation1.service;

import java.util.List;

import com.vinod.SpringBoot.crud.CrudOperation1.entity.Department;

public interface DepartmentService
{
	// Save operation
    Department saveDepartment(Department department);
 
    // Read operation
    List<Department> fetchDepartmentList();
 
    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);
 
    // Delete operation
    void deleteDepartmentById(Long departmentId);

}
