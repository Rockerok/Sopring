package ru.gb.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;
//import org.springframework.stereotype.Controller;

@WebServlet(name = "Cart", urlPatterns = "/cart")
//@Controller
public class Cart extends HttpServlet {

    public Product product;
    public Product [] cart = new Product[10];
    public Random price = new Random();
    private static Logger logger = LoggerFactory.getLogger(Cart.class);

    //http://localhost:8080/firstapp/cart
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: Cart");
        resp.getWriter().printf("<html><body>");
        for(int i=1; i<=10; i++){
            cart[i-1]=new Product(i, "apple" + i, price.nextInt(100));
        }

        for (Product p:cart) {
            resp.getWriter().printf(String.valueOf(p)+"<br />");
        }
        resp.getWriter().printf("</body></html>");
    }
}
