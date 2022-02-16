package com.example.BabyShop.service;

import com.example.BabyShop.entity.CartItem;
import com.example.BabyShop.repository.CartItemRepository;
import com.example.BabyShop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {
    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private ProductRepository productRepository;


    public List<CartItem> listCartItems(Integer id){
        return  cartItemRepository.findByUserId(id);
    }

    public CartItem addItemsToCart(CartItem cartItem){
        return  cartItemRepository.save(cartItem);
    }

    public void  removeById(Integer id){
        cartItemRepository.deleteById(id);
    }
}
