package com.navod.orm.servlet;

import com.navod.orm.util.JPAUtil;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();

//            User user = new User();
//            user.setFirstName("Madushanka");
//            user.setLastName("Maithripala");
//            user.setEmail("madushanka@gmail.com");
//            user.setPassword("5678");
//
//            entityManager.persist(user);
//
//            UserProfile userProfile = new UserProfile();
//            userProfile.setAddress1("Kandy");
//            userProfile.setAddress2("central");
//            userProfile.setBod("2000");
//            userProfile.setCity("Kandy");
//            userProfile.setGender("Male");
//            userProfile.setZipCode("20000");
//            userProfile.setUser(user);
//            entityManager.persist(userProfile);

            transaction.commit();
        }catch (Exception ex){
            transaction.rollback();
        }
    }
}
