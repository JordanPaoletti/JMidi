package com.jpaoletti.midi.file;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;

public abstract class MidiChunk {
    /*
    Class Constants
     */
    public static final long MAX_DATA_LENGTH = 0xffffffffL; //max 32 bit unsigned value
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
        setType(type);
    }

    /*
    Getters and Setters
     */

    /**
     * @param type chunk type
     * @throws IllegalArgumentException if type.length != TYPE_LENGTH or type is null
     */
    protected final void setType(byte[] type) {
        if (type.length != TYPE_LENGTH)
            throw new IllegalArgumentException("MidiChunk type must be a 4 byte ascii encoded array");

        this.type = Arrays.copyOf(type, TYPE_LENGTH);
    }

    /**
     * @return a byte[] of length TYPE_LENGTH that represents the chunk type
     */
    public final byte[] getType() {
        return Arrays.copyOf(type, TYPE_LENGTH);
    }

    /**
     * set the number of bytes the data section of the chunk takes up (not including the type and datalength variable
     * itself)
     * @param length the number of bytes.
     * @throws IllegalArgumentException if bytes < 0 || bytes > (2^32)-1
     */
    protected final void setDataLength(long length) {
        if (length < 0 || length > MAX_DATA_LENGTH)
            throw new IllegalArgumentException("Data length must fit within a 32 bit unsigned integer range");
        dataLength = length;
    }

    /**
     * a long representing the amount of bytes. can range from 0 -> (2^32)-1
     * @return the amount of bytes
     */
    public final long getDataLength() {
        return dataLength;
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
        ByteArrayOutputStream out = new ByteArrayOutputStream((int)getBytesLength());
        try {
            out.write(type);
            out.write(longToUnsignedInt32Bytes(dataLength));
            out.write(getDataBytes());
        }
        catch (IOException e) {
            //this should never occur
            e.printStackTrace();
        }
        return null;
    }

    /**
     * The amount of bytes the chunk will take up on disk
     * @return the number of bytes
     */
    public final long getBytesLength() {
        return dataLength + DATALENGTH_LENGTH + TYPE_LENGTH;
    }

    /**
     * Converts the data held in a long primitive to a byte array representing a 32 bit unsigned int
     * Uses raw binary data, doesn't convert from two's complement if num is a negative value
     * @param num long to convert
     * @return bytes of the equivalent 32 bit unsigned int
     */
    private byte[] longToUnsignedInt32Bytes(long num) {
        byte[] retval = new byte[4];
        retval[3] = (byte) (num & 0xFF);
        retval[3] = (byte) ((num & 0xFF) >>> 8);
        retval[3] = (byte) ((num & 0xFF) >>> 16);
        retval[3] = (byte) ((num & 0xFF) >>> 24);
        return retval;
    }

}
