package com.jpaoletti.MidiFile.IO;

import java.util.Arrays;

public abstract class MidiChunk {
    /*
    Class Constants
     */
    public static final byte TYPE_LENGTH = 4; //number of bytes the type uses
    public static final byte DATALENGTH_LENGTH = 4; //number of bytes taken by the datalength value

    /*
    Instance Fields
     */
    private byte[] type; //chunk type. a TYPE_LENGTH number of ascii encoded bytes
    private long dataLength; //amount of bytes in the chunk excluding the type and dataLength

    /*
    Constructors
     */

    /**
     * @throws IllegalArgumentException if type.length != TYPE_LENGTH or type is null
     * @param type chunk type
     */
    protected MidiChunk(byte[] type) {
        //todo MidiChunk(byte[] type)
    }

    /*
    Getters and Setters
     */

    /**
     * @param type chunk type
     * @throws IllegalArgumentException if type.length != TYPE_LENGTH or type is null
     */
    protected final void setType(byte[] type) {
        //todo setType(byte[] type)

    }

    /**
     * @return a byte[] of length TYPE_LENGTH that represents the chunk type
     */
    public final byte[] getType() {
        //todo getType()
        return null;
    }

    /**
     * set the number of bytes the data section of the chunk takes up (not including the type and datalength variable
     * itself)
     * @param length the number of bytes.
     * @throws IllegalArgumentException if bytes < 0 || bytes > (2^32)-1
     */
    protected final void setDataLength(long length) {
        //todo setDataLength(long length)
    }

    /**
     * a long representing the amount of bytes. can range from 0 -> (2^32)-1
     * @return the amount of bytes
     */
    public final long getDataLength() {
        //todo getDataLength()
        return 0;
    }

    /**
     * The byte[] that represents all the data in the chunk. Omits the type and datalength bytes
     * @return the data bytes
     */
    public abstract byte[] getDataBytes();

    /**
     * Sets the binary data associated with the chunk
     * @param data the byte array of data
     */
    public abstract void setDataBytes(byte[] data);

    /**
     * The byte[] that represents the binary data of the chunk in its entirety (including type and datalength bytes)
     * @return the byte[] representing the chunk
     */
    public final byte[] getBytes() {
        //todo getBytes()
        return null;
    }

    /**
     * The amount of bytes the chunk will take up on disk
     * @return the number of bytes
     */
    public final long getBytesLength() {
        return 0;
    }

}
