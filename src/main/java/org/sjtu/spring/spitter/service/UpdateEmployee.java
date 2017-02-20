package org.sjtu.spring.spitter.service;

import org.sjtu.spring.spitter.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by luchukun on 17-2-15.
 */
public class UpdateEmployee {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("EmployeePU");
        EntityManager entityManager = emFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class,0);
        System.out.println(employee.toString());
        employee.setSalary(9999999);
        System.out.println(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }
}
