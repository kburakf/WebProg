package edu.web;

import java.util.ArrayList;
import java.util.Observable;

public class User {
    static User instance = new User();
    public static ArrayList<Product> products;
    private final String username = "a";
    private final String password = "a";


    public static User getInstance(){
        products = new ArrayList<Product>();
        return instance;
    }

    public void add(Product product){
        products.add(product);
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
