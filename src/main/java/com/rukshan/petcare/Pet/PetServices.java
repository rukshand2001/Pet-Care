package com.rukshan.petcare.Pet;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class PetServices {
    //String dummy = "hello pet";
    private List<Pet>Dummy = Arrays.asList(
            new Pet("Hello pet")
    );

    public  List<Pet> getAllPet(){

        return Dummy;
    }
}
