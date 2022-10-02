package com.rukshan.petcare.vet;

import com.rukshan.petcare.utils.Message;
import org.springframework.stereotype.Service;

@Service
public class VetServices {
    public Message ping(){
        /* calling ping function */

        return new Message("Hello vet",200);
    }
}
