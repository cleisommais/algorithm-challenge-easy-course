package com.algorithm.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {

    @Test
    public void isUniqueCharsASCII() {
        IsUnique isUnique = new IsUnique();
        Assert.assertEquals(true, isUnique.isUniqueCharsASCII("123456789/*-+qwertyuiopasdfghjklzxcvbnm"));
    }

    @Test
    public void isUniqueCharsUNICODE() {
        IsUnique isUnique = new IsUnique();
        Assert.assertEquals(true, isUnique.isUniqueCharsUNICODE("123456789-+qwertyuiopasdfghjklçzxcvbnm,.;/?:>]~[´=!@#$%¨&*()_`{}£¢¬ªº°"));
    }
}