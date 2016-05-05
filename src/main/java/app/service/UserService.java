package app.service;

import app.dao.daoHibernateSpring.UserDAOHibernateSpring;
import app.dao.daoJdbc.UserDAO;
import app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAOHibernateSpring userDAOHibernateSpring;

    public void createUser(User user) {
        userDAOHibernateSpring.addNewUser(user);
    }

    public void deleteUserById(int idUser) {
        userDAOHibernateSpring.deleteUserById(idUser);
    }

    /*public void updateUserToHost(int idUser) {
        userDAOHibernateSpring.updateUserToHost(idUser);
    }

    public int getUserIdByEmail(String email) {
        return userDAOHibernateSpring.findUserIdByEmail(email);
    }*/
}
