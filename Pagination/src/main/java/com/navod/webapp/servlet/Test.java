package com.navod.webapp.servlet;

import com.navod.webapp.model.Student;
import com.navod.webapp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Test", urlPatterns = "/test")
public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        for(int i = 0; i<100; i++){
            Student student = new Student();
            student.setName("Student : "+i);
            student.setEmail("Student : "+i+".gmail.com");
            student.setAddress("Address : "+i);

            session.save(student);
        }
        transaction.commit();
    }
}
