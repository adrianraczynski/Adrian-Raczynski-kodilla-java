package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.dao.productDao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.productDao.ItemDao;
import com.kodilla.hibernate.invoice.dao.productDao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static com.sun.deploy.util.SessionState.save;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

        @Autowired
        private InvoiceDao invoiceDao;
        private ItemDao itemDao;
        private ProductDao productDao;

        @Test
        public void testInvoiceDaoSave(){
            //Given

            Product product1 = new Product("Car");
            Product product2 = new Product("Motorbike");
            Product product3 = new Product("Bicycle");

            Item item1 = new Item (product1, new BigDecimal(240000), 2,  new BigDecimal(1) );
            Item item2 = new Item (product3, new BigDecimal(2500),1,new BigDecimal(2));
            Item item3 = new Item (product1, new BigDecimal(240000),2,new BigDecimal(3));
            Item item4 = new Item (product2, new BigDecimal(56000),3,new BigDecimal(4));

            Invoice invoice1 = new Invoice("123");
            Invoice invoice2 = new Invoice("456");

            invoice1.getItems().add(item1);
            invoice1.getItems().add(item3);
            invoice2.getItems().add(item2);
            invoice2.getItems().add(item4);

            product1.getItemsFromProduct().add(item1);
            product1.getItemsFromProduct().add(item3);
            product2.getItemsFromProduct().add(item4);
            product3.getItemsFromProduct().add(item2);

            item1.setInvoices(invoice1);
            item2.setInvoices(invoice2);
            item3.setInvoices(invoice1);
            item4.setInvoices(invoice2);

            item1.setProduct(product1);
            item2.setProduct(product3);
            item3.setProduct(product1);
            item4.setProduct(product2);

            //When

            invoiceDao.save(invoice1);
            int invoice1Id  = invoice1.getId();

            invoiceDao.save(invoice2);
            int invoice2Id  = invoice2.getId();


            //Then
            Assert.assertNotEquals(0, invoice1Id);
            Assert.assertNotEquals(0, invoice2Id);


            //CleanUp
            try {
                invoiceDao.delete(invoice1);
                invoiceDao.delete(invoice2);
            } catch (Exception e) {
                //do nothing
            }
        }
}
