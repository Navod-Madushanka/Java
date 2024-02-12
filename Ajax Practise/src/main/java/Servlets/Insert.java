package Servlets;

import entity.Invoice;
import entity.Product;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Insert", value = "/insert")
public class Insert extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userid");
        String productId = request.getParameter("productid");
        String qty = request.getParameter("qty");

        User user = new User();
        Product product = new Product();

        String id = String.valueOf(System.currentTimeMillis());

        Session session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();

            Product product1 = session.get(Product.class, productId);
            if (product != null) {
                String price = product1.getPrice();
                System.out.println("Product Price: " + price);
            } else {
                System.out.println("Product not found.");
            }

            Invoice invoice = new Invoice();
            invoice.setId(id);
            invoice.setUserId(Integer.valueOf(userId));
            invoice.setProductId(Integer.valueOf(productId));
            invoice.setQty(Integer.valueOf(qty));

            session.save(invoice);
            session.getTransaction().commit();
            System.out.println("Data insert successfully");
        } catch (Exception e) {
            session.getTransaction().rollback();
        }finally {
            session.close();
        }

    }
}
