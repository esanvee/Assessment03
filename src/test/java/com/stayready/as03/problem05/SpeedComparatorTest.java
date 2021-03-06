package com.stayready.as03.problem05;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class SpeedComparatorTest {

    @Test
    public void testArraySort(){
        Animal horse = (Animal)new Horse();
        Animal blueJay = (Animal)new BlueJay();
        Animal redRobin = (Animal)new RedRobin();

        Animal[] animals = {redRobin, horse, blueJay};
        Comparator<Animal> comparator = (Comparator<Animal>)new SpeedComparator();
        Arrays.sort(animals, comparator);

        Assert.assertEquals(horse, animals[0]);//robin
        Assert.assertEquals(blueJay, animals[1]);//horse
        Assert.assertEquals(redRobin, animals[2]);//bluejay
    }
}

