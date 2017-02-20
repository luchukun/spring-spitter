package org.sjtu.spring.spitter.service;

import org.sjtu.spring.spitter.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by luchukun on 17-2-15.
 */
public class CreateEmployee {
    public static void main (String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("EmployeePU");
        EntityManager eManager = emFactory.createEntityManager();
        eManager.getTransaction().begin();
        Employee employee = new Employee();
       // employee.setEid(1024);
        employee.setEname("chuck");
        employee.setSalary(9999.99);
        employee.setDeg("Student");
        System.out.println(employee.toString());
        eManager.persist(employee);
        eManager.getTransaction().commit();

        eManager.close();
        emFactory.close();
    }
}
