package com.example.workoutsadad.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping(name = "/customer")
public class CustomerController {

    @PostMapping("/getFileForInsert")
    public ResponseEntity<?> getFileForInsert(@RequestBody File file){

        return new ResponseEntity<>("bale man hastam",HttpStatus.ACCEPTED);
    }

}
