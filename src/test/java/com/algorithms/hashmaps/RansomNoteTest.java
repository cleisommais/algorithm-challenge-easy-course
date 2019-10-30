package com.algorithms.hashmaps;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

public class RansomNoteTest {

    RansomNote ransomNote;

    @Before
    public void setUp() throws Exception {
        ransomNote = new RansomNote();
    }

    @Test
    public void checkMagazineCase01() {
        PrintStream io = Mockito.mock(PrintStream.class);
        System.setOut(io);
        String[] input01 = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] input02 = {"ive", "got", "some", "coconuts"};
        ransomNote.checkMagazine(input01, input02);
        Mockito.verify(io).println("No");
    }

    @Test
    public void checkMagazineCase02() {
        PrintStream io = Mockito.mock(PrintStream.class);
        System.setOut(io);
        String[] input01 = {"two", "times", "three", "is", "not", "four"};
        String[] input02 = {"two", "times", "two", "is", "four"};
        ransomNote.checkMagazine(input01, input02);
        Mockito.verify(io).println("No");
    }

    @Test
    public void checkMagazineCase03() {
        PrintStream io = Mockito.mock(PrintStream.class);
        System.setOut(io);
        String[] input01 = {"give", "one", "grand", "today", "night"};
        String[] input02 = {"give", "one", "grand", "today"};
        ransomNote.checkMagazine(input01, input02);
        Mockito.verify(io).println("Yes");
    }
}
