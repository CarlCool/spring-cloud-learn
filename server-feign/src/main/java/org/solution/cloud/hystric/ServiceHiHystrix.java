package org.solution.cloud.hystric;

import org.solution.cloud.service.FeignInterface;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystrix implements FeignInterface {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi " + name +" error";
    }
}
