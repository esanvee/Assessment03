package com.stayready.as03.problem05;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal o1, Animal o2) {
        
        if(o1.getSpeed() < o2.getSpeed()){
            return 1;

        }else if (o1.getSpeed() == o2.getSpeed()){
            return 0;

        }else{
            return -1;
        }
    }
}
