package com.jpaoletti.midi.events;

import com.jpaoletti.midi.file.MidiVLQ;
import com.jpaoletti.midi.utils.UInt7;

public class PitchWheelEvent extends MidiEvent{
    /*
    Class Constants
     */
    public static byte MESSAGE_ID = (byte) 0xE0;

    /*
    Instance Fields
     */
    private UInt7 leastSigBits;
    private UInt7 mostSigBits;

    /*
    Constructors
     */
    public PitchWheelEvent(MidiVLQ deltaTime, byte channelNum,
                           UInt7 leastSigBits, UInt7 mostSigBits) {
        //todo PitchWheelEvent(MidiVLQ deltaTime, byte channelNum,
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
