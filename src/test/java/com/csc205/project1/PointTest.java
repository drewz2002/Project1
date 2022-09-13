package com.csc205.project1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point a = new Point(3.0, 5.0);
    Point b = new Point(6.0, 7.0);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Distance between two points")
    void distance() {
        double actual = a.distance(b);
        double expected = 3.605551275463989;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("X value shift")
    void shiftX() {
        a.shiftX(4.0);
        double actual = a.getX();
        double expected = 7.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Y value shift")
    void shiftY() {
        a.shiftY(5.0);
        double actual = a.getY();
        double expected = 10.0;
        Assertions.assertEquals(expected, actual);
    }

    //new cleaner unit test for the rotate method using our equals method
    @Test
    @DisplayName("Rotation around the origin")
    void rotate() {
        a.rotate(Math.PI);
        Point expected = new Point(-3.0000000000000004, -5.0);
        Assertions.assertTrue(a.equals(expected));
    }

    //Previous test before the newest one

    /*@Test
    @DisplayName("Rotation around the origin")
    void rotate() {
        a.rotate(Math.PI);
        double[] actual = new double[]{a.getX(), a.getY()};
        double[] expected = new double[]{-3.0000000000000004, -5.0};
        Assertions.assertArrayEquals(actual, expected);
     */
}