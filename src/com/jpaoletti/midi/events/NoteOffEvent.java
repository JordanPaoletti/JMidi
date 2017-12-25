package com.jpaoletti.midi.events;

import com.jpaoletti.midi.file.MidiVLQ;
import com.jpaoletti.midi.utils.UInt7;

public class NoteOffEvent extends MidiEvent{
    /*
    Class Constants
     */
    public static byte MESSAGE_ID = (byte) 0x80;


    /*
    Instance Fields
     */
    private UInt7 keyNumber;
    private UInt7 velocity;

    /*
    Constructors
     */

    public NoteOffEvent(MidiVLQ deltaTime, byte channelNum,
                        UInt7 keyNumber, UInt7 velocity) {
        //todo NoteOffEvent(MidiVLQ deltaTime, byte channelNum,
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
