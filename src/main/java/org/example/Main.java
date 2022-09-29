package org.example;

import org.example.rezende.LoggerProxy;
import org.example.rezende.Test;
import org.slf4j.MDC;

public class Main {
    private static final LoggerProxy log = LoggerProxy.getLogger(Main.class);

    public static void main(String[] args) {
        (new Main()).test();
    }

    public void test() {
        MDC.put("customer", "ACME");
        log.info("Hello world!");
        (new Test()).test();
        log.info("Hello2");
    }
}