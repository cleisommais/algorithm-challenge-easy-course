package com.algorithm.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class URLfyTest {

    @Test
    public void replaceAll() {
        URLfy urLfy = new URLfy();
        Assert.assertEquals("Mr.%20Jonh%20Smith", urLfy.replaceAll("Mr. Jonh Smith  ", "%20"));
    }
}