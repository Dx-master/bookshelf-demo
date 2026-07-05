package com.demo.bookshelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthCheckTest {

    @Test
    void statusReturnsExpectedValue() {
        assertEquals("OK", new HealthCheck().status());
    }
}
