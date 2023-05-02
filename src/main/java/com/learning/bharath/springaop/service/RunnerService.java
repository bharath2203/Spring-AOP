package com.learning.bharath.springaop.service;

import com.learning.bharath.springaop.annotations.LogTime;
import org.springframework.stereotype.Component;

@Component
public class RunnerService {

    @LogTime
    public void run() throws InterruptedException {
        Thread.sleep(2000);
    }

}
