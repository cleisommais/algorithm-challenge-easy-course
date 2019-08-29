package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class URLfyTest {

    @Test
    public void replace() {
        URLfy urLfy = new URLfy();
        Assert.assertEquals("Mr.%20Jonh%20Smith", urLfy.replace("Mr. Jonh Smith  ".toCharArray(), 13));
    }
}