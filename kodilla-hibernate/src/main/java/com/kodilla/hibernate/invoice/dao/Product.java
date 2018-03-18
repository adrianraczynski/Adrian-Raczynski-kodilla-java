package com.kodilla.hibernate.invoice.dao;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {

    private int id;
    private String name;
    private List<Item> itemsFromProduct = new ArrayList<>();

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(
            targetEntity = Item.class,
            cascade = CascadeType.ALL,
            mappedBy = "product",
            fetch = FetchType.LAZY
    )
    public List<Item> getItemsFromProduct() {
        return itemsFromProduct;
    }

    public void setItemsFromProduct(List<Item> itemsFromProduct) {
        this.itemsFromProduct = itemsFromProduct;
    }

}
