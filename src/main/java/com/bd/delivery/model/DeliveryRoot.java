package com.bd.delivery.model;

import java.util.ArrayList;
import java.util.List;

public class DeliveryRoot {

    private List<Client> clientList;

    private List<DeliveryMan> deliveryManList;

    public DeliveryRoot(){
        this.clientList = new ArrayList<>();
        this.deliveryManList = new ArrayList<>();
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
}
