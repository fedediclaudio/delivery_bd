package com.bd.delivery.model;

import com.bd.delivery.utils.DeliveryException;

public class Assigned extends OrderStatus{

    public Assigned() {}

    public Assigned(Order order){
        super(order);
    }

    public boolean canRefuse() {
        return true;
    }

    public boolean canDeliver() {
        return true;
    }

    public boolean canCancel() {
        return true;
    }

    public void assign(DeliveryMan deliveryMan) throws DeliveryException {
        throw new DeliveryException("The order can't be assigned");
    }

    public void refuse() throws DeliveryException {
        throw new DeliveryException("The order can't be refused");
    }

    public void cancel() throws DeliveryException {
        throw new DeliveryException("The order can't be cancelled");
    }
}
