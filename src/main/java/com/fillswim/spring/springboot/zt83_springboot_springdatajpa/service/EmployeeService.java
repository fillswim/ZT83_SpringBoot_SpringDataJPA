package com.fillswim.spring.springboot.zt83_springboot_springdatajpa.service;





import com.fillswim.spring.springboot.zt83_springboot_springdatajpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
