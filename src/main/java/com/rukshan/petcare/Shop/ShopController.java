package com.rukshan.petcare.Shop;


import com.rukshan.petcare.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/shop/ping")
    public Message vet_ping(){
        return shopService.ping();
    }
}
