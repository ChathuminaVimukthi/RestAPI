package com.chathumina.test;


import com.chathumina.modal.Employee;
import com.chathumina.service.EmployeeService;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestController {

    /*@Autowired
    private EmployeeDAO employeeDAO;*/

    @Autowired
    private EmployeeService employeeService;

    /*@Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        Server jettyServer = new Server(8080);
        jettyServer.setHandler(context);

        ServletHolder jerseyServlet = context.addServlet(ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);

        // Tells the Jersey Servlet which REST service/class to load.
        jerseyServlet.setInitParameter("jersey.config.server.provider.classnames",
                EmployeeController.class.getCanonicalName());

        jettyServer.start();
        jettyServer.join();

    }*/

    /*@Test
    public void testSome() {
        employeeDAO.deleteEmployee(45);
    }*/

    @Test
    public void testDelete() {
        employeeService.deleteEmployee(38);
    }

    @Test
    public void testAdd(){
        Employee employee = new Employee();
        employee.setTelephone("11111");
        employee.setEmail("gsjdghs");
        employee.setName("fgefde");
        employee.setAddress("sdhfgsdjf");

        employeeService.addEmployee(employee);
    }

    @Test
    public void testGetList(){
       List<Employee> list = employeeService.getAllEmployees();
       for (Employee lst:list){
           System.out.println(lst.getId());
       }
    }

    @Test
    public void testGetEmployee(){
        Employee employee = employeeService.getEmployee(46);
        System.out.println("ID : "+employee.getId());
    }

}
