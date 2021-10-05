package com.bd.delivery.model;

import java.util.Date;

public class Order {

    private Date dateOfOrder;

    private String address;

    private String comments;

    private float coordX;

    private float coordY;

    private ProductType product;

    private float priceProducts;

    private float totalPrice;

    private Client client;

    private DeliveryMan deliveryMan;

    private OrderStatus orderStatus;

    public Order(){}

    public Order(Date dateOfOrder, String address, String comments, float coordX, float coordY, ProductType product, float priceProducts, Client client){
        this.dateOfOrder = dateOfOrder;
        this.address = address;
        this.comments = comments;
        this.coordX = coordX;
        this.coordY = coordY;
        this.product = product;
        this.priceProducts = priceProducts;
        this.totalPrice = this.priceProducts + product.getPrice();
        this.client = client;
        this.deliveryMan = null;
        this.orderStatus = new Pending();
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

    public ProductType getProduct() {
        return product;
    }

    public void setProduct(ProductType product) {
        this.product = product;
    }

    public float getPriceProducts() {
        return priceProducts;
    }

    public void setPriceProducts(float priceProducts) {
        this.priceProducts = priceProducts;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
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
}
