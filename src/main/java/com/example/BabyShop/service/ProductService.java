package com.example.BabyShop.service;

import com.example.BabyShop.entity.CartItem;
import com.example.BabyShop.entity.Product;
import com.example.BabyShop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void removeProductById(Long id){
        productRepository.deleteById(id);
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

    public List<Product> getAllProductsByCategoryId(Integer id){
        return productRepository.findAllByCategoryId(id);
    }

    public double getTotalPrice(List<CartItem> cartItems){
        double sum = 0;
            if (cartItems.size()>0){
                for (CartItem item : cartItems){
                    sum = sum + item.getProduct().getPrice() * item.getQuantity();
                }
            }
        return sum;
    }
}
