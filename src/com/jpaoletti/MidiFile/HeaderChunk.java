package com.jpaoletti.MidiFile;

public class HeaderChunk extends MidiChunk{

    /*
    Class Constants
     */

    //type is 'MThd' ascii encoding
    public static final byte[] CHUNK_TYPE = {77, 84, 104, 100};

    //all header chunks have the same data length
    public static final byte DATA_LENGTH = 6;

    /*
    Instace Fields
     */
    private int numTracks;
    private TimeDivision division;
    private MidiFileFormat format;


    /*
    constructors
     */

    /**
     * Instantiates a new HeaderChunk
     * @param numTracks the number of tracks in the midi file
     * @param division The time division of the midi file
     * @param format The file format of the midi file
     */
    public HeaderChunk(int numTracks, TimeDivision division,
                       MidiFileFormat format) {
        //todo HeaderChunk(int numTracks, TimeDivision division,
        //                       MidiFileFormat format)
        super(CHUNK_TYPE);
    }

    /**
     * Instantiates a HeaderChunk from binary data
     * @param data the binary data representing the chunk
     */
    public HeaderChunk(byte[] data) {
        //todo HeaderChunk(byte[] data)
        super(CHUNK_TYPE);
    }


    /*
    public methods
     */


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
     * @return the time division of the midi file
     */
    public TimeDivision getDivision() {
        return division;
    }

    /**
     * sets the time division of the midi file
     * @param division the new time division
     */
    public void setTimeDivision(TimeDivision division) {
        this.division = division;
    }

    /**
     * @return the file format of the midi file
     */
    public MidiFileFormat getFormat() {
        return format;
    }

    /**
     * @param format the new midi file format
     */
    public void setFormat(MidiFileFormat format) {
        this.format = format;
    }

    /**
     * @return the number of tracks in the midi file
     */
    public int getNumTracks() {
        return numTracks;
    }

    /**
     * @param numTracks the new number of tracks in the file
     */
    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    /*
    private methods
     */

    /*
    inner classes/enums
     */

    /**
     * Used to specify what duration of time is represented by the
     * variable length quantities in the midi events
     */
    public static class TimeDivision {
        //todo TimeDivision

    }

    /**
     * Used to specify the file format of the midi file
     * in relation to how many tracks and how those tracks
     * are treated.
     */
    public static enum MidiFileFormat {
        //todo MidiFileFormat
    }
}
