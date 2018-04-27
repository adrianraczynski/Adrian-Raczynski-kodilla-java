package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


//Całość to wersja dla modułu 20.1
@NamedNativeQueries(value = {
        @NamedNativeQuery(
                name = "Company.findNameOfCompanyByFirstThreeLetters",
                query = "SELECT * FROM companies WHERE substring(company_name,1,3) = :FIRSTTHREELETTERSOFNAMECOMPANY",
                resultClass = Company.class),

        @NamedNativeQuery(
                name = "Company.findNameOfCompanyByAnyPartOfName",
                query = "SELECT * FROM companies WHERE company_name LIKE :ANYPARTOFNAMECOMPANY",
                resultClass = Company.class)
}
)


@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}





/** Wersja dla Modułu 13

@NamedNativeQuery(
        name = "Company.retrieveCompanySearchBy3Letter",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE :FIRSTLETTERS ",
        resultClass = Company.class
)

@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    @ManyToMany (cascade = CascadeType.ALL, mappedBy = "companies")         //Bardzo ważny zapis ->     mappedBy = "companies"
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

 **/