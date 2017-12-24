package com.jpaoletti.midi.events;

import com.jpaoletti.midi.file.MidiVLQ;

public class NoteOffEvent extends MidiEvent{
    /*
    Class Constants
     */
    public static byte STATUS_CODE = (byte) 0x80;


    /*
    Instance Fields
     */
    byte keyNumber

    /*
    Constructors
     */

    public NoteOffEvent(MidiVLQ deltaTime, byte channelNum) {
        super(deltaTime, channelNum);
    }

    /*
    Getters and Setters
     */
    @Override
    protected byte[] getDataBytes() {
        return new byte[0];
    }
}
