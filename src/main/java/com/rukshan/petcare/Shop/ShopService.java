package com.rukshan.petcare.Shop;


import com.rukshan.petcare.utils.Message;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
    public Message ping(){
        /* calling ping function */

        return new Message("Hello Shop",200);
    }
}
