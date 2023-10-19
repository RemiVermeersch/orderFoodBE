package be.cebeo.OrderFoodBE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OrderFoodController {
    
    @GetMapping("/hello")
    public String hello() {
        String test = "test";


        return test;
    }
    
}
