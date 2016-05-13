package app.model;

import app.service.Validation;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idApartment;
    private String userName;
    @NotEmpty(message = "Please, enter apartment city.")
    @Size(min = 2, max = 30, message = "City must contain 2-30 characters.")
    private String cityApartment;
    private Enum ApartmentType;
    private Date startDate;
    private Date endDate;
    @OneToMany
    private List<Reservation> reservations;

    public Apartment(String cityApartment, Enum apartmentType, Date startDate, Date endDate) {
        this.cityApartment = cityApartment;
        ApartmentType = apartmentType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservations = new ArrayList<>();
    }

    public String getCityApartment() {
        return cityApartment;
    }

    public void setCityApartment(String cityApartment) {
        this.cityApartment = cityApartment;
    }

    public Enum getApartmentType() {
        return ApartmentType;
    }

    public void setApartmentType(Enum apartmentType) {
        ApartmentType = apartmentType;
    }

    public int getIdApartment() {
        return idApartment;
    }

    public void setIdApartment(int idApartment) {
        this.idApartment = idApartment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "endDate=" + endDate +
                ", startDate=" + startDate +
                ", ApartmentType=" + ApartmentType +
                ", cityApartment='" + cityApartment + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
