package com.bd.delivery.model;

import com.bd.delivery.utils.DeliveryException;

public class Pending extends OrderStatus{

    public Pending() {}

    public Pending(Order order) {
        super(order);
    }

    public boolean canAssigned(){
        return false;
    }

    public boolean canCancel() {
        return true;
    }

    public void assign(DeliveryMan deliveryMan) throws DeliveryException {
        throw new DeliveryException("The order can't be assigned");
    }

    public void cancel() throws DeliveryException {
        throw new DeliveryException("The order can't be cancelled");
    }


}
