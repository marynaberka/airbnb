package app.dao.daoJdbc;

import app.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;

//@Component
public class UserDAO extends JdbcDaoSupport {

    public void addNewUser(User user) {
        String sqlQuery = "INSERT INTO airbnb.user (userName, userSurname, email, userCity) values (?, ?, ?, ?)";
        /*getJdbcTemplate().update*/
        this.getJdbcTemplate().update(sqlQuery,
                new Object[]{user.getUserName(),
                        user.getUserSurname(),
                        user.getEmail(),
                        user.getUserCity()});
    }

    public int findUserIdByEmail(String email) {
        String sqlQuery = "SELECT * FROM airbnb.user WHERE email=?";
        return this.getJdbcTemplate().queryForObject(sqlQuery, Integer.class);
    }

    public String findUserNameById(int idUser) {
        String sqlQuery = "SELECT userName FROM airbnb.user WHERE idUser=?";
        return this.getJdbcTemplate().queryForObject(sqlQuery, new Object[]{idUser}, String.class);
    }

    public User findUserById(int idUser) {
        String sqlQuery = "SELECT * FROM airbnb.user WHERE idUser=?";
        return this.getJdbcTemplate().queryForObject(sqlQuery, new Object[]{idUser}, new UserRowMapper());
    }

    public List<User> getAllUsers() {
        String sqlQuery = "SELECT * FROM airbnb.user";
        return this.getJdbcTemplate().query(sqlQuery, new UserRowMapper());
    }

    public void deleteUserById(int idUser) {
        String sqlQuery = "DELETE FROM airbnb.user WHERE idUser=?";
        this.getJdbcTemplate().update(sqlQuery, new Object[]{idUser});
        //System.out.println("airbnb.spring.daoSpring.UserDAO.deleteUserById()");
    }

    public void deleteUserByNameSurname(String userName, String userSurname) {
        String sqlQuery = "DELETE FROM airbnb.user WHERE userName=? and userSurname=?";
        this.getJdbcTemplate().update(sqlQuery, new Object[]{userName,userSurname});
    }

    public void updateUserToHost(int idUser) {
        String sqlQuery = "UPDATE airbnb.user SET hostUser=1 where idUser=?";
        this.getJdbcTemplate().update(sqlQuery, new Object[]{idUser});
    }

    private class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("idUser"));
            user.setUserName(resultSet.getString("userName"));
            //user.setUserSurname(resultSet.getString("userSurname"));
            //user.setUserCity(resultSet.getString("userCity"));
            //user.setEmail(resultSet.getString("email"));
            return user;
        }
    }
}
