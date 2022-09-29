package org.example.rezende;

import org.example.Main;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoggerProxyTest {

//    @Test
//    public void verificarCustomer() {
//        //GIVEN
//        final org.example.rezende.Test test = new org.example.rezende.Test();
//
//        //WHEN
//        test.test();
//
//        //THEN
//    }

    @Test
    public void testMDC() {
        //GIVEN
        final Main main = new Main();

        //WHEN
        main.test();

        //THEN
        final String customer = MDC.get("customer");
        assertNotNull(customer);
        assertEquals("ACME", customer);
    }
}
