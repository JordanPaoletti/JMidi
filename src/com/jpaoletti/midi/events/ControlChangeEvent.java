package com.jpaoletti.midi.events;

import com.jpaoletti.midi.file.MidiVLQ;
import com.jpaoletti.midi.utils.UInt7;

public class ControlChangeEvent extends MidiEvent{
    /*
    Class Constants
     */
    public static byte MESSAGE_ID= (byte)0xB0;

    /*
    Instance Fields
     */
    private UInt7 controllerNumber;
    private UInt7 newValue;

    /*
    Constructors
     */
    public ControlChangeEvent(MidiVLQ deltaTime, byte channelNum,
                              UInt7 controllerNumber, UInt7 newValue) {
        //todo ControlChangeEvent(MidiVLQ deltaTime, byte channelNum,
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
