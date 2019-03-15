package com.rick.demointerviews.TestAOP;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAOPMain2 {

    @RequestMapping("/heihei")
    @AOPAnno
    public String test3(){
        return "bbb";
    }
}
