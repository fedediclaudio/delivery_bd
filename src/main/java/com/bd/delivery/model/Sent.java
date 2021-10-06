package com.bd.delivery.model;

import com.bd.delivery.utils.DeliveryException;

public class Sent extends OrderStatus{

    public Sent() {}

    public Sent(Order order){
        super(order);
    }

    public boolean canFinish() {
        return true;
    }

    public void finish() throws DeliveryException {
        throw new DeliveryException("The order can't be finish");
    }
}
