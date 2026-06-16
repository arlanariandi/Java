package com.arlanariandi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ReverseWordTest {
    public String reverseWord(String str) {

        String[] temp = str.trim().split("\\s+");

        List<String> wordList = Arrays.asList(temp);
        Collections.reverse(wordList);

        return String.join(" ", wordList);

    }

    @Test
    void testReverseBerhasil() {
        Assertions.assertEquals("hello world", reverseWord("   world hello "));
    }
}
