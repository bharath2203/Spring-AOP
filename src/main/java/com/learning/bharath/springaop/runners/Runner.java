package com.learning.bharath.springaop.runners;

import com.learning.bharath.springaop.service.RunnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final RunnerService runnerService;

    public Runner(RunnerService runnerService) {
        this.runnerService = runnerService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running runnerService.run()");
        runnerService.run();
    }
}
