package com.jpaoletti.midi.file;

public class MidiVLQ implements Comparable<MidiVLQ>{
    /*
    Class Constants
     */
    /**
     * Min value of a MidiVLQ
     */
    public static final int MIN_VALUE = 0;
    /**
     * Max Value of a MidiVLQ
     */
    public static final int MAX_VALUE = 0x0FFFFFFF;

    /*
    Instance Variables
     */
    private int value;


    /*
    Constructors
     */

    /**
     * Instantiates a new VLQ from passed value
     * @param value value of the VLQ
     * @throws IllegalArgumentException if (value <MIN_VALUE || value > MAX_VALUE)
     */
    public MidiVLQ(int value) {
        //todo MidiVLQ(int value)
    }

    /**
     * Instantiates a new VLQ from binary data
     * @param data binary data representing the VLQ
     * @throws IllegalArgumentException if (value <MIN_VALUE || value > MAX_VALUE)
     */
    public MidiVLQ(byte[] data) {
        //todo MidiVLQ(byte[] data)
    }

    /*
    Static Methods
     */

    /**
     * Determines if the continue bit on the byte is set
     * @param b byte to check
     * @return true if it is set, false otherwise
     */
    boolean hasContinueSet(byte b) {
        //todo hasContinueSet(byte b)
        return false;
    }

    /**
     * Returns the 7 bits of vlq data in a byte (MSB will be clear)
     * @param b the byte to retrieve data from
     * @return the 7 bits of data
     */
    byte getDataFromByte(byte b) {
        //todo getDataFromByte(byte b)
        return 0;
    }


    /*
    Getters and Setters
     */

    /**
     * @return the value of the VLQ
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the VLQ
     * @param value the new value
     * @throws IllegalArgumentException if (value <MIN_VALUE || value > MAX_VALUE)
     */
    public void setValue(int value) {
        //todo setValue(int value)
    }

    /**
     * get the binary data representing the VLQ
     * @return array of bytes representing the VLQ
     */
    public byte[] getBytes() {
        //todo getBytes()
        return null;
    }

    /*
    Implemented Methods
     */

    @Override
    public int compareTo(MidiVLQ midiVLQ) {
        //todo compareTo(MidiVLQ midiVLQ)
        return 0;
    }

    @Override
    public String toString() {
        //todo toString()
        return null;
    }
}
