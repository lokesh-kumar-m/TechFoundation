package com.example.demo.versions;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("version_1")
@Primary
public class version1 implements Iversion{

    @Override
    public void getInfo() {
        System.out.println("Version 1");
    }
    
}
