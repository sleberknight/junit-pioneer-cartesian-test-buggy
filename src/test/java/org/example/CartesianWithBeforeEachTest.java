package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junitpioneer.jupiter.cartesian.CartesianTest;

class CartesianWithBeforeEachTest {

    @BeforeEach
    void setUp1() {
        System.out.println("setUp1");
    }

    @BeforeEach
    void setUp2(TestInfo testInfo) {
        System.out.printf("setUp2: testInfo: %s%n", testInfo);
    }

    @AfterEach
    void tearDown1() {
        System.out.println("tearDown1");
    }

    @AfterEach
    void tearDown2(TestInfo testInfo) {
        System.out.printf("tearDown2: testInfo: %s%n", testInfo);
    }

    @Test
    void test1() {
        System.out.println("in test1...");
    }

    @CartesianTest
    void test2(
          @CartesianTest.Values(ints = { 0, 1 }) int a,
          @CartesianTest.Values(ints = { 0, 1 }) int b) {

       System.out.printf("in test2: a: %d ; b: %d%n", a, b);
    }
}
