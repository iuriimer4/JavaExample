package chap003myfirsttest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest1 {

    @Test
    public void addTwoPlusTwo() {
    int answer = 2+2;
       assertEquals("2 + 2 = 4", 4, answer);
    }
}
