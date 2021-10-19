package com.bd.delivery.repositories;

import com.bd.delivery.model.DeliveryMan;
import com.bd.delivery.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeliveryManRepository extends CrudRepository<DeliveryMan, Long> {

    public Optional<DeliveryMan> findByUsername(String aUsername);

    public List<DeliveryMan> findByFreeTrueAndActiveTrue();
}
