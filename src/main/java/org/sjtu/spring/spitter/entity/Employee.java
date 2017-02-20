/**
 * Created by luchukun on 17-2-15.
 */
package org.sjtu.spring.spitter.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int eid;
    @Column(name = "name")
    private String ename;
    @Column(name = "salary")
    private double salary;
    @Column(name = "deg")
    private String deg;

    public Employee(int eid, String ename, double salary, String deg) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
    }
    public Employee() {
        super();
    }


    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getDeg() {
        return deg;
    }
    public void setDeg(String deg) {
        this.deg = deg;
    }

   @Override
    public String toString(){
       return "Employee [eid=" + eid + ", ename=" + ename + ", salary="+ salary + ", deg=" + deg + "]";
   }
}
