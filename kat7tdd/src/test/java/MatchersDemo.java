import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Matchery
 1. Poprawienie czytelności i przejrzystości testów.
 2. Komunikaty o błędach podczas niepowodzenia się testu są także
 zdecydowanie bardziej zrozumiałe.
 3. Testy mogą być znacznie bardziej dokładne.
 4. Łatwiejsza analiza napisanych testów.
 Przyklady - AssertJ

 */
public class MatchersDemo {

    //demonstracja
    @Test
    public void demo1() {
        List<String> words = Arrays.asList("abc", "xyz", "www", "hhh");
        //zaliczamy test gdy w liscie znjaduja sie slowa: xyz i www
        assertTrue(words.contains("xyz") && words.contains("www"));

        //to samo mozna zrobic taK
        assertThat(words).contains("xyz", "www");

        String str = "123aBcWww";
        //zaliczam test gdy napis zaczyna sie na 123 konczy sie na Www zawiera abc bez
        //uwzglednienia wielkosci liter
        assertThat(str).startsWith("123")
                .endsWith("Www")
                .containsIgnoringCase("abc");
    }
}

