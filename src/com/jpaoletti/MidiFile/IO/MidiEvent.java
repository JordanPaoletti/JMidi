package com.jpaoletti.MidiFile.IO;

import com.jpaoletti.MidiFile.Util.MidiValue;

public class MidiEvent extends MidiTrackEvent{
    /*
    Instance Variables
     */
    private byte channelNum;


    /*
    Constructors
     */


    /*
    Getters and Setters
     */
    @Override
    protected byte[] getDataBytes() {
        //todo getDataBytes()
        return new byte[0];
    }

    /*
    Enums and Classes
     */
    public static enum Message {
        NOTE_OFF(0x80),
        NOTE_ON(0x90),
        ;

        Message(int bin) {this.binary = (byte) bin;}
        private byte binary;
        public byte getBinary() {return binary;}
    }


}
