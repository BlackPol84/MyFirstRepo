package ru.ykul.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void reverse_ifContainsOneNonLetterCharacter_shouldReturnString() {
        assertEquals("5", StringUtils.reverse("5"));
    }
    @Test
    void reverse_ifContainsEmpty_shouldReturnEmpty () {
        assertEquals("", StringUtils.reverse(""));
    }
    @Test
    void reverse_ifContainsOneCharacter_shouldReturnOneCharacter() {
        assertEquals("x", StringUtils.reverse("x"));
    }
    @Test
    void reverse_ifContainsNonLettersOnly_shouldReturnString() {
        assertEquals("123@4&!90", StringUtils.reverse("123@4&!90"));
    }
    @Test
    void reverse_ifContainsEvenStringLength_shouldReturnReversString() {
        assertEquals("iLt4ac",StringUtils.reverse("cat4Li"));
    }
    @Test
    void reverse_ifContainsOddStringLength_shouldReturnReversString() {
        assertEquals("jo7p$",StringUtils.reverse("po7j$"));
    }
    @Test
    void reverse_ifContainsNull_shouldReturnEmpty() {
        assertEquals("", StringUtils.reverse(null));
    }
}