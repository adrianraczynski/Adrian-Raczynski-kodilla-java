package com.kodilla.hibernate.invoice.dao.productDao;

import com.kodilla.hibernate.invoice.dao.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {

}
