package com.example.csse_backend;

import com.example.csse_backend.repo.SupplierRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CsseBackendApplicationTests {

    @Autowired
	private SupplierRepo supplierRepo;
	@Test
	void contextLoads() {
	}

}
