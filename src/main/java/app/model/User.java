package app.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @NotEmpty(message = "Please, enter your name.")
    @Size(min = 1, max = 20, message = "Name must contain 1-20 characters.")
    private String userName;
    @NotEmpty(message = "Please, enter your surname.")
    @Size(min = 1, max = 30, message = "Surname must contain 1-20 characters.")
    private String userSurname;
    @NotEmpty(message = "Please, enter your email.")
    @Email
    private String email;
    @NotEmpty(message = "Please, enter your city.")
    @Size(min = 2, max = 30, message = "City must contain 2-30 characters.")
    private String userCity;
    private boolean hostUser;
    @OneToMany
    private List<Apartment> apartments;

    public User() {
    }

    public User(String userName, String userSurname, String email, String userCity) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.email = email;
        this.userCity = userCity;
        this.hostUser = false;
        this.apartments = new ArrayList<>();
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public boolean isHostUser() {
        return hostUser;
    }

    public void setHostUser(boolean hostUser) {
        this.hostUser = hostUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                '}';
    }
}
