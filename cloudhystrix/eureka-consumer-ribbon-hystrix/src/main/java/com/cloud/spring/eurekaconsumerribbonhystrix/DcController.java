package com.cloud.spring.eurekaconsumerribbonhystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        Map<String,String> map=new HashMap<>();
        List<String> l=new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(this+"result="+getResult());
//                    l.add(getResult().toString());
//                    map.put(this.toString(),getResult().toString());
//                }
//            }).run();
//
//        }
//        return map.toString()+l.toString();
        return getResult().toString();
    }

    public Object getResult(){
         return consumerService.consumer();
    }

}
