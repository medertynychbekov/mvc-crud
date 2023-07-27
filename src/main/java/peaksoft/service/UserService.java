package peaksoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.UserDao;
import peaksoft.model.User;

import java.util.List;

@Service
//@Transactional
public class UserService implements ServiceLayer<User> {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User updateById(int id, User user) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
