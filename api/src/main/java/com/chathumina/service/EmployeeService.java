package com.chathumina.service;

import com.chathumina.modal.Employee;

import java.util.List;

public interface EmployeeService {

    public void addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public void deleteEmployee(Integer employeeId);

    public Employee getEmployee(int employeeid);

    public Employee updateEmployee(Employee employee);

    public String print();
}
