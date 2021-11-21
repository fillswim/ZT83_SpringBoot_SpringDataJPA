package com.fillswim.spring.springboot.zt83_springboot_springdatajpa.dao;



import com.fillswim.spring.springboot.zt83_springboot_springdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// <Тип данных, Тип первичного ключа>
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Методы работы с данными Spring Data JPA прописывает автоматически
    // Spring Boot сам создает класс, который имплементирует данный интерфейс

    // Добавление дополнительного метода по получению работников по имени
    // Данный метод (при правильном нименовании) реализуется Spring-ом автоматически
    public List<Employee> findAllByName(String name);

}
