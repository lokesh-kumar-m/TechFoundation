package com.example.demo.versions;

import org.springframework.stereotype.Component;

@Component("version_2")
public class version2 implements Iversion{

    @Override
    public void getInfo() {
        System.out.println("Version 2");
    }
    
}
