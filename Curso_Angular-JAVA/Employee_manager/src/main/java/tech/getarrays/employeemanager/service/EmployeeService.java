package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repo.IEmployeeRepo;

import java.util.*;

@Service
public class EmployeeService
{
    private final IEmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(IEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee)
    {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return this.employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees()
    {
        return this.employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee)
    {
        return this.employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) throws UserNotFoundException
    {
        return this.employeeRepo.findEmployeeById(id)
                   .orElseThrow(() -> new UserNotFoundException(" User by id " + id + " was not found"));
    }

    public void deleteEmployee(Long id)
    {
        employeeRepo.deleteEmployeeById(id);
    }
}
