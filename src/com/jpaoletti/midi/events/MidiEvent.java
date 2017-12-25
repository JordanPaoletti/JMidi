package com.jpaoletti.midi.events;


import com.jpaoletti.midi.file.MidiVLQ;

public abstract class MidiEvent extends MidiTrackEvent{
    /*
    Instance Fields
     */
    byte channelNum;
    byte messageID;

    /*
    Constructors
     */
    public MidiEvent(MidiVLQ deltaTime, byte channelNum, byte messageID) {
        //todo MidiEvent(MidiVLQ deltaTime, byte channelNum)
        super(deltaTime);
    }


    /*
    Getters and Setters
     */
    /**
     * @param num new channel number for the event
     */
    public final void setChannelNum(byte num) {
        //todo setChannelNum(byte num)
    }

    /**
     * @return midi channel number attached to this event
     */
    public final byte getChannelNum() {
        return channelNum;
    }

    /**
     * @return the message ID of the event
     */
    public final byte getMessageID() {
        return messageID;
    }

    /**
     * @return the byte containing both the message id and channel number
     */
    public final byte getStatusByte() {
        return (byte)(channelNum & messageID);
    }
}
