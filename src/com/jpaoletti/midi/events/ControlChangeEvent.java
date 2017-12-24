package com.jpaoletti.midi.events;

public class ControlChangeEvent extends MidiEvent{
    /*
    Class Constants
     */
    public static byte STATUS_CODE = 0;

    /*
    Instance Fields
     */

    /*
    Constructors
     */


    /*
    Getters and Setters
     */
    @Override
    protected byte[] getDataBytes() {
        return new byte[0];
    }
}
