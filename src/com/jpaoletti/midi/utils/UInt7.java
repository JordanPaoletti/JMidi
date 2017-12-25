package com.jpaoletti.midi.utils;

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
        //todo UInt7(int value)
    }

    /**
     * Instantiates a new 7 bit unsigned int from another UInt7
     * @param o the UInt7 to copy
     */
    public UInt7(UInt7 o) {
        //todo UInt7(UInt7 o)
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
        //todo setValue(int value)
    }

    /*
    Public Methods
     */

    /**
     * Adds an integer to the value. Overflows simply restart from the beginning
     * @param num number to sum with
     */
    public void add(int num) {
        //todo add(int num)
    }

    /**
     * Subs an integer from the value.
     * @param num number to sub with
     */
    public void sub(int num) {
        //todo sub(int num)
    }

    /*
    Implemented methods
     */
    @Override
    public int compareTo(UInt7 o) {
        //todo compareTo(UInt7 o)
        return 0;
    }
}
