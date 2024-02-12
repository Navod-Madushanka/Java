package Servlets;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import util.HibernateUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "A", value = "/A")
public class A extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        String email = "Madushanka@gmail.com";
//        String queryString = "FROM User WHERE email = :email";
//        Query<User> query = session.createQuery(queryString, User.class);
//        query.setParameter("email", email);
//        List<User> users = query.getResultList();
//
//        if(!users.isEmpty()){
//            for(User user: users){
//                String id = String.valueOf(user.getId());
//                String First_name = user.getFirstname();
//                String Last_name = user.getLastname();
//                String Email = user.getEmail();
//
//                response.getWriter().write(id);
//                response.getWriter().write(First_name);
//                response.getWriter().write(Last_name);
//                response.getWriter().write(Email);
//            }
//        }else{
//            System.out.println("User Not Found");
//        }
//
//        session.getTransaction().commit();
//        session.close();
//        response.getWriter().write("Done");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");

    }
}
