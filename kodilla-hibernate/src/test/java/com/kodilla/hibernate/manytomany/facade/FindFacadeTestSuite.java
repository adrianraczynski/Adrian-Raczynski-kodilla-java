package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FindFacadeTestSuite {

    @Autowired
    FoundDataFinderFacade foundDataFinderFacade;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    @Test
    public void testFindByAnyPartOfNameCompany() {
        //given
        Company orlen = new Company("orlen");
        Company lotos = new Company("lotos");
        Company lotosPaliwa = new Company("lotos paliwa");

        companyDao.save(orlen);
        companyDao.save(lotos);
        companyDao.save(lotosPaliwa);

        //when
        List<Company> searchingCompany1 =foundDataFinderFacade.findCompanyByPartialName("orl");
        List<Company> searchingCompany2 =foundDataFinderFacade.findCompanyByPartialName("tos");

        //then
        Assert.assertEquals(1, searchingCompany1);
        Assert.assertEquals(2, searchingCompany2);

        //CleanUp
        try {
        companyDao.delete(orlen);
        companyDao.delete(lotos);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindByAnyPartOfNameEmployee() {
        //given
        Employee adamNowak = new Employee("Adam", "Nowak");
        Employee adrianRaczynski= new Employee("Adrian", "Raczynski");

        employeeDao.save(adamNowak);
        employeeDao.save(adrianRaczynski);

        //when
        List<Employee> searchingEmployee1 = foundDataFinderFacade.findEmployeeByPartialName("Racz");
        List<Employee> searchingEmployee2  = foundDataFinderFacade.findEmployeeByPartialName("Now");

        //then
        Assert.assertEquals(1, searchingEmployee1);
        Assert.assertEquals(1, searchingEmployee2);

        //CleanUp
        try {
        employeeDao.delete(adamNowak);
        employeeDao.delete(adrianRaczynski);
        } catch (Exception e) {
            //do nothing
        }
    }
}