package peaksoft.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import peaksoft.model.User;

import java.util.List;

@Repository
@Transactional
public class UserDao implements DaoLayer<User> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> findAll() {
        //         entityManager.getTransaction().commit();
        return (List<User>) entityManager.createQuery("from User").getResultList();
    }

    @Override
//    @Transactional
    public User save(User user) {
        System.out.println("I'm in start");
        entityManager.persist(user);
//        entityManager.getTransaction();
//        entityManager.createQuery("insert into User u ()")
        try {
//            entityManager.getTransaction();
//            insert into users (name,age)
//            values ('Meder',25);
//            entityManager.refresh(user);

//            "insert into Stock(stock_code, stock_name)" +
//                    "select stock_code, stock_name from backup_stock"
//            entityManager.createQuery("insert into User (id,name,age) select (u.name,u.age) from User u")
//                    .setParameter("id", 99)
//                    .setParameter("name", "name")
//                    .setParameter("age", 88).executeUpdate();
//            entityManager.getTransaction().begin();
//            entityManager.persist(user);
//            entityManager.flush();
//            entityManager.getTransaction().commit();
        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
            System.out.println();
        }
//        entityManager.flush();
//         entityManager.getTransaction().commit();
        System.out.println("I'm in END");
        return user;
    }

    @Override
    public User updateById(int id, User user) {
////        User oldUser = entityManager.find(User.class, id);
//        oldUser.setName(user.getName());
//        oldUser.setAge(user.getAge());
////        entityManager.merge(oldUser);
//        return oldUser;
        return null;
    }

    @Override
    public void deleteById(int id) {
        // entityManager.remove(entityManager.find(User.class, id));
    }

}
