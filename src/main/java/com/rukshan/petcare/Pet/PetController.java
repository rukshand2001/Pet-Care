package com.rukshan.petcare.Pet;

import com.rukshan.petcare.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetServices petservices;

    @GetMapping("/ping")
    public Message ping(){
        return petservices.ping();
    }
}
