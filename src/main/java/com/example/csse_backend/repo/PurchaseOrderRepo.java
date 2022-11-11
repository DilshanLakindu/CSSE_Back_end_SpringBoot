package com.example.csse_backend.repo;
import com.example.csse_backend.entities.PurchaseOrder;
import com.example.csse_backend.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PurchaseOrderRepo extends CrudRepository<PurchaseOrder,Long> {

    List<PurchaseOrder> findAll();


}
