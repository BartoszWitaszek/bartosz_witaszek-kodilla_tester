package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Stamp number 1", 43, 31.25, true));
        stamps.add(new Stamp("Stamp number 2", 39.5, 31.25, false));
        stamps.add(new Stamp("Stamp number 3", 43, 31.25, false));
        stamps.add(new Stamp("Stamp number 1", 43, 31.25, true));
        stamps.add(new Stamp("Stamp number 4", 39.5, 31.25, true));
        stamps.add(new Stamp("Stamp number 4", 39.5, 31.25, true));
        stamps.add(new Stamp("Stamp number 3", 43, 31.25, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
