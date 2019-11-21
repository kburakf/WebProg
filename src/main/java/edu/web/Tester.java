package edu.web;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class Tester extends HttpServlet {

    User user = new User();

    ArrayList<Product> userProductList = user.getProducts();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("product", userProductList.get(id));

        RequestDispatcher rd = req.getRequestDispatcher("showProduct.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(user.getUsername().equals(username) &&  user.getPassword().equals(password)){
            RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
            req.setAttribute("productList",userProductList);
            req.setAttribute("username",username);
            rd.forward(req,resp);
        }
    }
}
