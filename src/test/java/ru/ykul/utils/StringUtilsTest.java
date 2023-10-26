package ru.ykul.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void revers_ifContainsWord_shouldReturnReversString() {
        assertEquals("l5ooc4", StringUtils.reverse("c5ool4"));
    }
    @Test
    void revers_ifContainsEmpty_shouldReturnEmpty () {
        assertEquals("", StringUtils.reverse(""));
    }
    @Test
    void reverse_ifContainsOneCharacter_shouldReturnOneCharacter() {
        assertEquals("x", StringUtils.reverse("x"));
    }
    @Test
    void reverse_ifContainsNonLettersOnly_returnString() {
        assertEquals("123@4&!90", StringUtils.reverse("123@4&!90"));
    }
    @Test
    void reverse_ifContainsEvenNumber_returnString() {
        assertEquals("4",StringUtils.reverse("4"));
    }
    @Test
    void reverse_ifContainsOddNumber_returnString() {
        assertEquals("7",StringUtils.reverse("7"));
    }
    @Test
    void reverse_ifContainsNull_shouldReturnEmpty() {
        assertEquals("", StringUtils.reverse(null));
    }
}