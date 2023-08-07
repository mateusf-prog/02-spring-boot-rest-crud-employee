package br.com.mateus.cruddemo.service;

import br.com.mateus.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
