package com.jpaoletti.midi.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.jpaoletti.midi.utils.UInt7.MAX_VALUE;
import static com.jpaoletti.midi.utils.UInt7.MIN_VALUE;

import static org.junit.Assert.*;

/**
 * I don't have to much of a clue as to how to effectively use JUnit to test anything
 */
public class UInt7Test {

    /*
    Constructor Tests
     */
    @Test
    public void constructor_no_exception() {
        new UInt7(MIN_VALUE);
        new UInt7(MAX_VALUE);
        new UInt7(MAX_VALUE / 2);
    }

    //@Test (expected = IllegalArgumentException.class)
    //public void constructor_lower_than_min() {
    //    new UInt7(MIN_VALUE - 1);
    //}

    //@Test (expected = IllegalArgumentException.class)
    //public void contstructor_higher_than_max() {
    //    new UInt7(MAX_VALUE + 1);
    //}




}