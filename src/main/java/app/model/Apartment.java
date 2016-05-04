package app.model;

import app.service.Validation;

import java.util.Date;

public class Apartment {
    private User user;
    private String city;
    private Enum ApartmentType;
    private Date startDate;
    private Date endDate;

    public Apartment(String city, Enum apartmentType, Date startDate, Date endDate) {
        this.city = city;
        ApartmentType = apartmentType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (Validation.getValidation().validCityName(city)) {
            this.city = city;
        }
    }

    public Enum getApartmentType() {
        return ApartmentType;
    }

    public void setApartmentType(Enum apartmentType) {
        ApartmentType = apartmentType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
}
