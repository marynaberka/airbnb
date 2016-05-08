package app;

import app.dao.daoHibernateSpring.UserDAOHibernateSpring;
import app.dao.daoJdbc.UserDAO;
import app.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring_config.xml");
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        UserDAOHibernateSpring userDAO = appContext.getBean("userDAOHibernateSpring", UserDAOHibernateSpring.class);

        //System.out.println(userDAO.getAllUsers());
        //System.out.println(userDAO.getAllUsers().size());

        //User user = userDAO.findUserById(1);
        //System.out.println(user);

        //String userName = userDAO.findUserNameById(2);
        //System.out.println(userName);

        //userDAO.deleteUserById(4);

        //UserDAO userDAO = appContext.getBean("userDAO", UserDAO.class);
        //UserDAOHibernateSpring userDAO = new UserDAOHibernateSpring();
        //User user2 = new User("Lisa", "Simpson", "Lisa@org.usa", "SanFrancisco");
        User user2 = appContext.getBean("user", User.class);
        user2.setEmail("Lisa@org.usa");
        user2.setUserName("Bart");
        user2.setUserSurname("Simpson");
        user2.setUserCity("SanFrancisco");

        userDAO.addNewUser(user2);

        System.out.println(userDAO.getAllUsers());

        //System.out.println(userDAO.getAllUsers());

        /*UserDAOHibernateSpring userDAOHibernateSpring =
                appContext.getBean("userDAOHibernateSpring", UserDAOHibernateSpring.class);

        System.out.println(userDAOHibernateSpring.findUserNameById(3));

        System.out.println(userDAOHibernateSpring.findUserIdByEmail("Lisa@org.usa"));*/




    }

}
