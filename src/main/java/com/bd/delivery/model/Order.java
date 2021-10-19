package com.bd.delivery.model;

import com.bd.delivery.utils.DeliveryException;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order_")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_order", unique = true, updatable = false)
    private long number;

    @Column(nullable = false, updatable = false)
    private Date dateOfOrder;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(length = 500)
    private String comments;

    @Column(nullable = false)
    private float coordX;

    @Column(nullable = false)
    private float coordY;

    @Column(nullable = false)
    private float priceProducts;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinColumn(name = "id_delivery_man", nullable = true)
    private DeliveryMan deliveryMan;

    @Embedded
    private OrderStatus orderStatus;

    public Order(){}

    public Order(Date dateOfOrder, String address, String comments, float coordX, float coordY,  float priceProducts, Client client){
        this.dateOfOrder = dateOfOrder;
        this.address = address;
        this.comments = comments;
        this.coordX = coordX;
        this.coordY = coordY;
        this.priceProducts = priceProducts;
        this.client = client;
        this.deliveryMan = null;
        this.orderStatus = new Pending(this);
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public float getCoordX() {
        return coordX;
    }

    public void setCoordX(float coordX) {
        this.coordX = coordX;
    }

    public float getCoordY() {
        return coordY;
    }

    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }

    public float getPriceProducts() {
        return priceProducts;
    }

    public void setPriceProducts(float priceProducts) {
        this.priceProducts = priceProducts;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean canAssigned(){
        return this.orderStatus.canAssigned();
    }

    public boolean canRefuse() {
        return this.orderStatus.canRefuse();
    }

    public boolean canDeliver() {
        return this.orderStatus.canDeliver();
    }

    public boolean canFinish() {
        return this.orderStatus.canFinish();
    }

    public boolean canCancel() {
        return this.orderStatus.canCancel();
    }

    public void assign(DeliveryMan deliveryMan) throws DeliveryException {
        this.orderStatus.assign(deliveryMan);
    }

    public void refuse() throws DeliveryException {
        this.orderStatus.refuse();
    }

    public void deliver() throws DeliveryException {
        this.orderStatus.deliver();
    }

    public void cancel() throws DeliveryException {
        this.orderStatus.cancel();
    }

    public void finish() throws DeliveryException {
        this.orderStatus.finish();
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    /*
    * Debido a la incompatibilidad de Hibernet y JPA con embebeber la clases hijas, una solucion es instanciar
    * el estado de manera manual.
    * La clase que se recupera, si bien es un OrderStatus, no es una clase concreta.
    */
    public void setStatusByName(){
        switch (orderStatus.getName()){
            case "Pending":
                this.setOrderStatus(new Pending(this, this.orderStatus.getStartDate()));
                break;
            case "Assigned":
                this.setOrderStatus(new Assigned(this, this.orderStatus.getStartDate()));
                break;
            case "Sent":
                this.setOrderStatus(new Sent(this, this.orderStatus.getStartDate()));
                break;
            case "Delivered":
                this.setOrderStatus(new Delivered(this, this.orderStatus.getStartDate()));
                break;
            case "Cancelled":
                this.setOrderStatus(new Cancelled(this, this.orderStatus.getStartDate()));
                break;
        }
    }
}
