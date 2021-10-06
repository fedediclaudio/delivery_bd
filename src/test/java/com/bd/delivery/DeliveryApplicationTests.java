package com.bd.delivery;

import com.bd.delivery.model.DeliveryRoot;
import com.bd.delivery.services.DeliveryService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DeliveryApplicationTests {

	@Autowired
	private DeliveryService service;

	private DeliveryRoot root;

	@BeforeEach
	void before(){
		this.root = new DeliveryRoot();
	}

	@Test
	void prueba(){

	}

}
