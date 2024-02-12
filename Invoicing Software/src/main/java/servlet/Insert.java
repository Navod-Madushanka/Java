package servlet;

import entity.Invoice;
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userid"));
        int productId = Integer.parseInt(request.getParameter("productid"));
        int qty = Integer.parseInt(request.getParameter("qty"));

        insertInvoice(userId,productId,qty);
    }

    private void insertInvoice(int userId, int productId, int qty){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Invoice invoice = new Invoice();
        invoice.setId(String.valueOf(System.currentTimeMillis()));
        invoice.setUserId(userId);
        invoice.setProductId(productId);
        invoice.setQty(qty);


        java.util.Date currentDate = new java.util.Date();
        java.sql.Date invoiceDate = new java.sql.Date(currentDate.getTime());
        invoice.setDate(invoiceDate);

        try {
            session.beginTransaction();
            session.save(invoice);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

    }

}
