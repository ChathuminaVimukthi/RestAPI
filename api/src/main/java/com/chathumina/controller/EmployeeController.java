package com.chathumina.controller;

import com.chathumina.modal.Employee;
import com.chathumina.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Controller
@Path("/")
@Component
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GET
    @Path("employee")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee listEmployee() throws IOException {
        Employee employee = employeeService.getEmployee(38);
        return employee;
    }

    @GET
    @Path("test/{Id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> listEmployees(@PathParam("Id") String Id){
        List<Employee> listEmployee = employeeService.getAllEmployees();
        return listEmployee;
    }


    @POST
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee someEmployee(){
        Employee employee = new Employee();
        employee.setAddress("AA");
        employee.setName("SSS");
        employee.setEmail("EE");
        employee.setTelephone("33333");
        employee.setId(22);

        return employee;
    }

}
