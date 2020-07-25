package com.prabhakar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeletingAFrom12thPositionTest {
    DeletingAFrom12thPosition obj;
    @BeforeEach
    void setup() {
        obj=new DeletingAFrom12thPosition();
    }
    @Test
    void test12A() {
        assertEquals("bcd",obj.removeA("aabcd"));
    }
    @Test
    void test1A() {
        assertEquals("bcd",obj.removeA("abcd"));
    }
    @Test
    void test0A() {
        assertEquals("bcd",obj.removeA("bcd"));
    }
    @Test
    void test2A() {
        assertEquals("bbcd",obj.removeA("babcd"));
    }
    @Test
    void testOtherA() {
        assertEquals("bcaacd",obj.removeA("aabcaacd"));
    }
    @Test
    void testOnly1A() {
        assertEquals("",obj.removeA("a"));
    }
    @Test
    void test2As() {
        assertEquals("",obj.removeA("aa"));
    }
    @Test
    void testNullString() {
        assertEquals("",obj.removeA("a"));
    }

}
