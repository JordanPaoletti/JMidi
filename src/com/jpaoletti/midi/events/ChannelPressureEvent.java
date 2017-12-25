package com.jpaoletti.midi.events;

import com.jpaoletti.midi.file.MidiVLQ;
import com.jpaoletti.midi.utils.UInt7;

public class ChannelPressureEvent extends MidiEvent{
    /*
    Class Constants
     */
    public static byte MESSAGE_ID= (byte)0xD0;

    /*
    Instance Fields
     */
    private UInt7 pressureValue;

    /*
    Constructors
     */

    /**
     * Instantiates a new event
     * @param deltaTime time ticks from the last event to this one
     * @param channelNum the midi channel number for this event
     * @param pressureValue the pressure value of the channel
     */
    public ChannelPressureEvent(MidiVLQ deltaTime, byte channelNum, UInt7 pressureValue) {
        //todo ChannelPressureEvent(MidiVLQ deltaTime, byte channelNum, UInt7 pressureValue)
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
