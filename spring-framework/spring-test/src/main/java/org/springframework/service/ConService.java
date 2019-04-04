package org.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zy.Lee
 * 2019/4/4 12:30
 */
@Service
public class ConService {

    private ServiceTest serviceTest;

    @Autowired
    public ConService(ServiceTest serviceTest,String name){
        System.out.println("serviceTest: "+ serviceTest);
        System.out.println("name: "+name);
        this.serviceTest = serviceTest;
    }
}
