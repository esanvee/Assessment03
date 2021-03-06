package com.stayready.as03.problem00;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem00Test {
    Problem00 solution;

    @Before
    public void setup() {
        solution = new Problem00();
    }

    @Test
    public void countUniqueWordsTest1(){
        String input = "Hello Java. Hello World. Hello Java!";
        String expected =   "The 3 unique words are:\n" +
                "Java (Seen 2)\n" +        
                "Hello (Seen 3)\n" +
                "World (Seen 1)\n";
                
        String actual = solution.countUniqueWords(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countUniqueWordsTest2() {
        String input = "that that is is that that is not is not is that it it is wutang";
        String expected = "The 5 unique words are:\n" + "that (Seen 5)\n" + "not (Seen 2)\n" + "wutang (Seen 1)\n"
                + "is (Seen 6)\n" + "it (Seen 2)\n";

        String actual = solution.countUniqueWords(input);
        Assert.assertEquals(expected, actual);
    }
}
