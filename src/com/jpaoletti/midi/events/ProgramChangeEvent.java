package com.jpaoletti.midi.events;

import com.jpaoletti.midi.file.MidiVLQ;
import com.jpaoletti.midi.utils.UInt7;

public class ProgramChangeEvent extends MidiEvent{
    /*
    Class Constants
     */
    public static byte MESSAGE_ID= (byte) 0xC0;

    /*
    Instance Fields
     */
    private UInt7 programNum;

    /*
    Constructors
     */
    public ProgramChangeEvent(MidiVLQ deltaTime, byte channelNum,
                              UInt7 programNum) {
        //todo ProgramChangeEvent(MidiVLQ deltaTime, byte channelNum,
        super(deltaTime, channelNum, MESSAGE_ID);
    }


    /*
    Getters and Setters
     */
    @Override
    protected byte[] getDataBytes() {
        return new byte[0];
    }
}
