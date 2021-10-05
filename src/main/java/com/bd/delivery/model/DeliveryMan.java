package com.bd.delivery.model;

import java.util.Calendar;
import java.util.Date;

public class DeliveryMan extends User{

    private int numberOfSuccessfulOrders;

    private boolean free;

    private Date dateOfAdmission;

    public DeliveryMan(){}

    public DeliveryMan(String name, String email, String username, String password, Date dateOfBirth) {
        super(name, email, username, password, dateOfBirth);
        this.numberOfSuccessfulOrders = 0;
        this.free = true;
        this.dateOfAdmission = Calendar.getInstance().getTime();
    }

    public int getNumberOfSuccessfulOrders() {
        return numberOfSuccessfulOrders;
    }

    public void setNumberOfSuccessfulOrders(int numberOfSuccessfulOrders) {
        this.numberOfSuccessfulOrders = numberOfSuccessfulOrders;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
