package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampLength;
    private double stampWidth;
    private boolean isStamped;

    public Stamp(String stampName, double stampLength, double stampWidth, boolean isStamped) {
        this.stampName = stampName;
        this.stampLength = stampLength;
        this.stampWidth = stampWidth;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampLength() {
        return stampLength;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampLength, stampLength) == 0 && Double.compare(stamp.stampWidth, stampWidth) == 0 && isStamped == stamp.isStamped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampLength, stampWidth, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampLength=" + stampLength +
                ", stampWidth=" + stampWidth +
                ", stamped=" + isStamped +
                '}';
    }
}
