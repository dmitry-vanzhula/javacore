package com.dvanzhula.app.classwork.lesson12;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 12/2/2016.
 */
public class EnigmaCipherTest {

    private EnigmaCipher enigmaCipher;

    @Before

    public void createObject() {
        enigmaCipher = new EnigmaCipher();
    }

    @Test

    public void encodeStringTest() {
        String inputString = "BOOK";
        String expResult = "MAAC";
        Assert.assertEquals(expResult, enigmaCipher.encodeString(inputString));
    }

    @After

    public void deleteObject() {
        EnigmaCipher enigmaCipher = null;
    }
}
