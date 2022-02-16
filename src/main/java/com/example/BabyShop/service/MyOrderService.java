package com.example.BabyShop.service;
import com.example.BabyShop.entity.MyOrder;
import com.example.BabyShop.repository.MyOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MyOrderService {
    @Autowired
    private MyOrderRepository myOrderRepository;

    public MyOrder addOrderDetails(MyOrder order){
        return myOrderRepository.save(order);
    }
    public List<MyOrder> listOrderHistory(Integer id){
        return  myOrderRepository.findByUserId(id);
    }
}
