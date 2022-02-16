package com.example.BabyShop.repository;

import com.example.BabyShop.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
   List<CartItem> findByUserId(Integer id);

}
