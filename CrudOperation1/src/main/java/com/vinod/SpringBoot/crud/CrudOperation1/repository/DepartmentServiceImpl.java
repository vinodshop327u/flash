package com.vinod.SpringBoot.crud.CrudOperation1.repository;



// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.SpringBoot.crud.CrudOperation1.entity.Department;
import com.vinod.SpringBoot.crud.CrudOperation1.service.DepartmentService;



@Service
public class DepartmentServiceImpl implements DepartmentService 
{

	@Autowired
    private DepartmentRepository departmentRepository;
 
 
 
    // Read operation
    public List<Department> fetchDepartmentList()
    {
        return (List<Department>)
            departmentRepository.findAll();
    }



    // Save operation
    @Override
    public Department saveDepartment(Department department)
    {
    	System.out.println("data "+department.getDepartmentId());
        return departmentRepository.save(department);
    }

    // Update operation
    @Override
    public Department
    updateDepartment(Department department,
                     Long departmentId)
    {
        Department depDB
            = departmentRepository.findById(departmentId)
                  .get();
 
        if (Objects.nonNull(department.getDepartmentName())
            && !"".equalsIgnoreCase(
                department.getDepartmentName())) {
            depDB.setDepartmentName(
                department.getDepartmentName());
        }
 
        if (Objects.nonNull(
                department.getDepartmentAddress())
            && !"".equalsIgnoreCase(
                department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(
                department.getDepartmentAddress());
        }
 
        if (Objects.nonNull(department.getDepartmentCode())
            && !"".equalsIgnoreCase(
                department.getDepartmentCode())) {
            depDB.setDepartmentCode(
                department.getDepartmentCode());
        }
 
        return departmentRepository.save(depDB);
    }
 



 // Delete operation
    @Override
    public void deleteDepartmentById(Long departmentId)
    {
        departmentRepository.deleteById(departmentId);
    }
 
    
    
}
