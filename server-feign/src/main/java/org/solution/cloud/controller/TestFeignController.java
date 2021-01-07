package org.solution.cloud.controller;

import org.solution.cloud.service.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestFeignController {
    @Autowired
    private FeignInterface feignInterface;

    @GetMapping(value = "/test")
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feignInterface.sayHiFromClientOne(name);
    }
}
