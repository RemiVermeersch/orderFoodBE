package be.cebeo.OrderFoodBE;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.cebeo.OrderFoodBE.POJO.Order;

@RestController
@RequestMapping("/")
public class OrderFoodController {
    
    @GetMapping("/hello")
    public String hello() {
        String test = "test";


        return test;
    }

    @PostMapping("/order")
    public String order(@RequestBody Order order){
        System.out.println(order.getMaandag());
        return "order";
    }
    
}
