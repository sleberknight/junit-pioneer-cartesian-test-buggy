package org.example;

import java.nio.file.Path;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junitpioneer.jupiter.cartesian.CartesianTest;

class CartesianWithTempDirTest {

    private Path tempDir;

    @BeforeEach
    private void setUp(@TempDir Path tempDir) {
        this.tempDir = tempDir;
        System.out.printf("setUp: set tempDir to: %s%n", tempDir);
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
