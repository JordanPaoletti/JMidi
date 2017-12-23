package com.jpaoletti.MidiFile.IO;

import java.util.List;
import java.util.NoSuchElementException;

public class TrackChunk extends MidiChunk{
    /*
    Class Constants
     */

    //ascii encoding for 'MTrk'
    public static final byte[] CHUNK_TYPE = {77, 84, 114, 107};

    /*
    Instance Fields
     */
    List<MidiEvent> events;

    /*
    constructors
     */

    /**
     * Instantiates an empty TrackChunk
     */
    public TrackChunk() {
        //todo TrackChunk()
        super(CHUNK_TYPE);
    }

    /**
     * Instantiates a TrackChunk from binary data
     * @param data the data representing the chunk
     */
    public TrackChunk(byte[] data) {
        //todo TrackChunk(byte[] data)
        super(CHUNK_TYPE);
    }

    /**
     * Instantiates a TrackChunk from a list of midi events
     * @param events the events in the track
     */
    public TrackChunk(List<MidiEvent> events) {
        //todo TrackChunk(List<MidiEvent> events)
        super(CHUNK_TYPE);
    }

    /*
    Public Methods
     */

    /**
     * Appends a single event to the track
     * @param event event to add
     */
    public void appendEvent(MidiEvent event) {
        //todo appendEvent(MidiEvent event)
    }

    /**
     * Removes a single event from the end of the track
     * @throws NoSuchElementException if there are no events
     */
    public void removeEvent() throws NoSuchElementException {
        //todo removeEvent()
    }

    /**
     * Appends multiple event to the track
     * @param event event to add
     */
    public void appendEvents(List<MidiEvent> event) {
        //todo appendEvents(List<MidiEvent> event)
    }

    /**
     * Removes multiple events from end of the track
     * If requested to remove more events then possible,
     * no events will be removed and an exception will be thrown
     * @param numEvents number events to remove
     * @throws NoSuchElementException if numEvents > events.size()
     */
    public void removeEvents(int numEvents)
            throws NoSuchElementException {
        //todo removeEvents(int numEvents)
    }

    /*
    Getters and Setters
     */
    @Override
    public byte[] getDataBytes() {
        //todo getDataBytes()
        return new byte[0];
    }

    @Override
    public void setDataBytes(byte[] data) {
        //todo setDataBytes(byte[] data)
    }

    /**
     * @return the list of midi events in the track
     */
    public List<MidiEvent> getEvents() {
        return events;
    }

    /**
     * Assigns a new list of events to the track
     * @param events the list of events
     */
    public void setEvents(List<MidiEvent> events) {
        this.events = events;
    }
}
