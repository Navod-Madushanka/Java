import com.navod.orm.entity.Author;
import com.navod.orm.entity.Book;
import com.navod.orm.entity.Cart;
import com.navod.orm.entity.CartItem;
import com.navod.orm.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();

            Author author = new Author();
            author.setFirstname("Navod");
            author.setLastname("Madushanka");

            Book book = new Book();
            book.setName("A");
            book.setIsbn("A123");

            Book book1 = new Book();
            book1.setName("B");
            book1.setIsbn("B123");

            author.getBooks().add(book);
            author.getBooks().add(book1);

            book.getAuthors().add(author);
            book1.getAuthors().add(author);

            entityManager.persist(author);


            transaction.commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
