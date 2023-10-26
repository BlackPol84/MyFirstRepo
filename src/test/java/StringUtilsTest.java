import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ykul.utils.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void reverse_ifContainsWord_shouldReturnReversString() {
        assertEquals("l5ooc4", StringUtils.reverse("c5ool4"));
    }
    @Test
    void revers_ifContainsEmpty_doNotshouldReturn () {
        assertEquals("", StringUtils.reverse(""));
    }
    @Test
    void reverse_ifContainsOnlyNubers_shouldOneCharacter() {
        assertEquals("x", StringUtils.reverse("x"));
    }
    @Test
    void reverse_ifNotContainsCharacter_returnNotReversString() {
        assertEquals("123@4&!90", StringUtils.reverse("123@4&!90"));
    }
}