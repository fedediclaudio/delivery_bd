package com.bd.delivery.model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Client extends User{

    private Date dateOfRegister;

    private int score;

    private List<Order> orders;

    public Client(){}

    public Client(String name, String email, String username, String password, Date dateOfBirth) {
        super(name, email, username, password, dateOfBirth);
        this.dateOfRegister = Calendar.getInstance().getTime();
        this.score = 0;
    }

    public Date getDateOfRegister() {
        return dateOfRegister;
    }

    public void setDateOfRegister(Date dateOfRegister) {
        this.dateOfRegister = dateOfRegister;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
