package com.example.BabyShop.repository;


import com.example.BabyShop.entity.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyOrderRepository extends JpaRepository<MyOrder,Long> {
    List<MyOrder> findByUserId(Integer id);
}
