package org.iesfm.companyJson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private static Logger logger = LoggerFactory.getLogger(Company.class);

    private String name;
    private List<Department> departments;

    public Company() {

    }

    public Company(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public List<Employee> getEmployees(String department) {

        for (Department dep : departments) {
            if (dep.equals(department)) {
                return dep.getEmployees();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departments);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
