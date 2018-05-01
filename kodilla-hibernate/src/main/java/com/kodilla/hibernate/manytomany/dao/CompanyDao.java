package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    //Moduł 13
    @Query (nativeQuery = true)
    List<Company> retrieveCompanySearchBy3Letter (@Param("FIRSTLETTERS") String name);

    @Query (nativeQuery = true)
    List<Company> retrieveCompanyByPartialName (@Param("PARTIALNAME") String name);
}