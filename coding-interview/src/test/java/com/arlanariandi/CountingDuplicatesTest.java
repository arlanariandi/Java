package com.arlanariandi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingDuplicatesTest {
    public int duplicateCount(String text) {

        /*Example
        "abcde" -> 0 # no characters repeats more than once
        "aabbcde" -> 2 # 'a' and 'b'
        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
        "indivisibility" -> 1 # 'i' occurs six times
        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
        "aA11" -> 2 # 'a' and '1'
        "ABBA" -> 2 # 'A' and 'B' each occur twice*/

        // 1. Ubah ke lowercase agar case-insensitive
//        String lowerText = text.toLowerCase();
//
//        Set<Character> seen = new HashSet<>();
//        Set<Character> duplicates = new HashSet<>();
//
//        // 2. Iterasi setiap karakter di dalam string
//        for (int i = 0; i < lowerText.length(); i++) {
//            char ch = lowerText.charAt(i);
//
//            // Jika karakter sudah pernah dilihat sebelumnya, masukkan ke dalam set duplicates
//            if (seen.contains(ch)) {
//                duplicates.add(ch);
//            } else {
//                seen.add(ch);
//            }
//        }
//
//        // 3. Ukuran dari set 'duplicates' adalah jumlah karakter unik yang berulang
//        return duplicates.size();


//        int ans = 0;
//        text = text.toLowerCase();
//        while (text.length() > 0) {
//            String firstLetter = text.substring(0,1);
//            text = text.substring(1);
//            if (text.contains(firstLetter)) ans ++;
//            text = text.replace(firstLetter, "");
//        }
//        return ans;
    }

    @Test
    void simpleTest() {
        duplicateCount("abcde");
    }
}
