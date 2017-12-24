package com.jpaoletti.midi.events;


import com.jpaoletti.midi.file.MidiVLQ;

public abstract class MidiEvent extends MidiTrackEvent{
    /*
    Instance Fields
     */
    byte channelNum;

    /*
    Constructors
     */
    public MidiEvent(MidiVLQ deltaTime, byte channelNum) {
        //todo MidiEvent(MidiVLQ deltaTime, byte channelNum)
        super(deltaTime);
    }


    /*
    Getters and Setters
     */
    /**
     * @param num new channel number for the event
     */
    public void setChannelNum(byte num) {
        //todo setChannelNum(byte num)
    }

    /**
     * @return midi channel number attached to this event
     */
    public byte getChannelNum() {
        //todo getChannelNum()
        return 0;
    }
}
