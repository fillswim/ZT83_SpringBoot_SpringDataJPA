package com.fillswim.spring.springboot.zt83_springboot_springdatajpa.service;

import com.fillswim.spring.springboot.zt83_springboot_springdatajpa.dao.EmployeeRepository;
import com.fillswim.spring.springboot.zt83_springboot_springdatajpa.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
//    @Transactional // За транзакционность будет отвечеть Spring Boot Repository
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {

        Employee employee = null;

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        // Проверка: не пустой ли Optional вернулся?
        if (optionalEmployee.isPresent()) {
            employee = optionalEmployee.get();
        }

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {

        List<Employee> employees = employeeRepository.findAllByName(name);
        return employees;
    }
}
