import com.klb.commons.StringCommons;
import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by klb on 25.08.18.
 */
public class StringCommonsTest {

    //"abcad", 'a' -> 2
    @Test
    public void testCountLettersNotEmptyString() {
        String word = "abcad";
        assertEquals(2, StringCommons.countLetters(word, 'a'));
    }

    @Test
    public void testCountLettersNotEmpty() {
        assertEquals(0, StringCommons.countLetters("", 'a'));
    }

    @Test
    public void testPalindrom() {
        //"adda" - tak, "ab" - nie,   "kajak" - tak
        assertEquals(true, StringCommons.pal("adda"));

        assertTrue(StringCommons.pal("kajak"));

        assertThat(StringCommons.pal("abc123")).isEqualTo(false);
    }
}
