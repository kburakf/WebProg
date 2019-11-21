package edu.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class Add extends HttpServlet {
    User user = User.getInstance();
    ArrayList<Product> itemProduct = user.getProducts();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dıngı dıngı dıngı");
        int id = Integer.parseInt(req.getParameter("newId"));
        String name = req.getParameter("newName");
        float price = Float.parseFloat(req.getParameter("newPrice"));
        System.out.println(itemProduct.size());
        itemProduct.add(new Product(id,name,price));
        System.out.println(itemProduct.size());

        req.setAttribute("productList",itemProduct);
        RequestDispatcher rd = req.getRequestDispatcher("home.jsp");


        rd.forward(req,resp);
    }
}
