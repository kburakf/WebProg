package edu.web;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class Tester extends HttpServlet {

    User user = User.getInstance();

    ArrayList<Product> userProductList = new ArrayList<Product>();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        update();
        int id = Integer.parseInt(req.getParameter("id"));
        System.out.println(id + " tetiklendi");
        req.setAttribute("product", userProductList.get(id-1));

        RequestDispatcher rd = req.getRequestDispatcher("showProduct.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        if(user.getProducts().isEmpty()) {
            resp.sendRedirect("add.jsp");
            return;
        }

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(user.getUsername().equals(username) &&  user.getPassword().equals(password)) {
            RequestDispatcher rd = req.getRequestDispatcher("home.jsp");

            req.setAttribute("productList", userProductList);
            req.setAttribute("username", username);
            rd.forward(req, resp);
        }



    }
    public void update(){
        userProductList = user.getProducts();
    }


}
