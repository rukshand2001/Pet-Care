package com.rukshan.petcare.vet;
import com.rukshan.petcare.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VetController {
        @Autowired
        private VetServices vetServices;

        @GetMapping("vet/ping")
        public Message vet_ping(){
            return vetServices.ping();
        }
}
