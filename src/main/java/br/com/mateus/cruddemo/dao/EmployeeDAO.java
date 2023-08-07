package br.com.mateus.cruddemo.dao;

import br.com.mateus.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
