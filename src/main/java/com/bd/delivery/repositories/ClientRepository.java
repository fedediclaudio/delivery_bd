package com.bd.delivery.repositories;

import com.bd.delivery.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    public Optional<Client> findByUsername(String aUsername);
}
