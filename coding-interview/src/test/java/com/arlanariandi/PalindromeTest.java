package com.arlanariandi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    public boolean isPalindrome(String value) {

        for (int i = 0; i < value.length(); i++) {
            int indexAwal = i;
            int indexAkhir = value.length() - i - 1;

            if (value.charAt(indexAwal) != value.charAt(indexAkhir)) {
                return false;
            }
        }

        return true;

//        String temp = "";
//
//        for (int i = value.length() - 1; i >= 0; i--) {
//            temp = temp + value.charAt(i);
//        }
//
//        return temp.equals(value);
    }

    @Test
    void testPalindromeBerhasil() {
        Assertions.assertTrue(isPalindrome("kodok"));

//        Assertions.assertFalse(isPalindrome("ab"));
    }
}
