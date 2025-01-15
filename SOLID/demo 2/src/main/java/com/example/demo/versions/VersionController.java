package com.example.demo.versions;

import org.springframework.stereotype.Component;
@Component
public class VersionController {
    
    private Iversion version;

    public VersionController(Iversion version){
        this.version=version;
    }

    public void printData(){
        version.getInfo();
    }
}
