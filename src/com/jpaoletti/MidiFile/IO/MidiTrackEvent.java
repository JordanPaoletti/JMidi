package com.jpaoletti.MidiFile.IO;

public abstract class MidiTrackEvent {
    /*
    Instance Variables
     */
    protected MidiVLQ deltaTime;

    /*
    Constructors
     */

    /**
     * Instantiates the deltaTime of an event
     * @param deltaTime
     */
    protected MidiTrackEvent(MidiVLQ deltaTime) {
        this.deltaTime = deltaTime;
    }

    /*
    Getters and Setters
     */

    /**
     * @return delta time of the event
     */
    public final MidiVLQ getDeltaTime() {
        //todo getDeltaTime()
        return null;
    }

    /**
     * Sets the delta time of the event
     * @param deltaTime
     */
    public final void setDeltaTime(MidiVLQ deltaTime) {
        this.deltaTime = deltaTime;
    }

    /**
     * get the binary data representing the event (including delta time)
     * @return the binary data
     */
    public final byte[] getBytes() {
        //todo getBytes()
        return null;
    }

    /**
     * @return the binary representation of the data contained within the event (excluding the delta time)
     */
    protected abstract byte[] getDataBytes();


}
