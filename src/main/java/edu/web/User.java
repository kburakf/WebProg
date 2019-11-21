package edu.web;

import java.util.ArrayList;

public class User {

    private ArrayList<Product> products;
    private final String username = "a";
    private final String password = "a";

    User(){
        products = new ArrayList<Product>();
        products.add(new Product(0,"Macbook Pro",0));
        products.add(new Product(1,"Macbook Air",10));
        products.add(new Product(2,"Iphone X",100));
    }

    public ArrayList<Product> getProducts() {
        return products;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
