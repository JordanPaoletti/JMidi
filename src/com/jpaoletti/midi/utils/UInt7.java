package com.jpaoletti.midi.utils;

/**
 * Basic implementation on a 7 bit unsigned integer.
 * primarily meant to be an easy holder of data as opposed to
 * a comprehensive integer class
 */
public class UInt7 implements Comparable<UInt7>{
    /*
    Class Constants
     */
    public static final byte MIN_VALUE = 0;
    public static final byte MAX_VALUE = 0x7F;

    /*
    Instance Variables
     */
    private byte value;


    /*
    Constructors
     */

    /**
     * Instantiates a new 7 bit unsigned int
     * @param value of the new 7 bit unsigned int
     * @throws IllegalArgumentException if (value < MIN_VALUE || value > MAX_VALUE)
     */
    public UInt7(int value) {
        setValue(value);
    }

    /**
     * Instantiates a new 7 bit unsigned int from another UInt7
     * @param o the UInt7 to copy
     */
    public UInt7(UInt7 o) {
        this.value = o.getValue();
    }

    /*
    Getters and Setters
     */

    /**
     * @return the value of the 7 bit unsigned int
     */
    public byte getValue() {
        return value;
    }

    /**
     * sets the value of the unsigned 7 bit int
     * @param value value to be set
     * @throws IllegalArgumentException if (value < MIN_VALUE || value > MAX_VALUE)
     */
    public void setValue(int value) {
        if (value < MIN_VALUE || value > MAX_VALUE)
            throw new IllegalArgumentException("Value is out of bounds");

        this.value = (byte) value;
    }

    /*
    Public Methods
     */

    /**
     * Adds an integer to the value. Overflows simply restart from the beginning
     * Doesn't handle the case where num + value > Integer.MAX_VALUE
     *
     * @param num number to sum with
     */
    public void add(int num) {
        value = (byte)((num + value) % (MAX_VALUE + 1));
    }

    /**
     * Subs an integer from the value.
     * Underflow results in a value of 0
     * if num < 0, then this method calls add
     * @param num number to sub with
     */
    public void sub(int num) {
        if (num < 0) {
            add(-num);
        }
        else {
            value = (byte) ((value - num) < 0 ? 0 : value - num);
        }
    }

    /*
    Implemented methods
     */
    @Override
    public int compareTo(UInt7 o) {
        return (int)value - o.getValue();
    }
}
