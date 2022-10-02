package com.rukshan.petcare.Pet;

import com.rukshan.petcare.utils.Message;
import org.springframework.stereotype.Service;

@Service
public class PetServices {

    public  Message ping(){
        /* calling ping function */

        return new Message("Hello pet",200);
    }
}
