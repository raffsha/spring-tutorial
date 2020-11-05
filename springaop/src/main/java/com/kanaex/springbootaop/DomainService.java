package com.kanaex.springbootaop;

//Create a simple service class to test the above advice.

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DomainService {
    public Object getDomainObjectById(Long id){
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e){

        }
        return id;
    }
}
