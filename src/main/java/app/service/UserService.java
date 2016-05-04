package app.service;

import app.dao.daoJdbc.UserDAO;
import app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public void createUser(User user) {
        userDAO.addNewUser(user);
    }

    public void deleteUserById(int idUser) {
        userDAO.deleteUserById(idUser);
    }

    public void updateUserToHost(int idUser) {
        userDAO.updateUserToHost(idUser);
    }

    public int getUserIdByEmail(String email) {
        return userDAO.findUserIdByEmail(email);
    }
}
