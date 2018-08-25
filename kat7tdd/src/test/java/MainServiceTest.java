import com.klb.fileservice.FileAccessService;
import com.klb.fileservice.MainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * Piszemy test metody numOfLines
 * przyczym zamiast czytac z prawdziwego pliku, w momencie
 * wywolania funkcji  Files.readAllLines będzie zwracana
 * stała, "wirtualna" zawartość pliku
 */
@RunWith(MockitoJUnitRunner.class)
public class MainServiceTest {

    //mockujemy klase FileAccessService => nie będą uruchamiane
    //tescie metody tej klasy
    @Mock
    private FileAccessService fileAccessService;  //Mockito wstrzyknie tu instancje

    //tak robimy gdy testujemy metode/y klasy ktora zawiera w sobie obiekt
    //mockowanej klasy (obiekt klasy FileAccessService)
    @InjectMocks
    private MainService mainService;  //Mockito wstrzyknie tu instancje

    @Test
    public void testNumOfLines() throws IOException {
        //"atrapa" - wirtualny plik
        List<String> lines = Arrays.asList("one", "two");

        //deklarujemy ze jesli nastapi uruchomienie metody load
        //to zamiast czytac z pliku, zostanie zwrocona "atrapa" - lista stringow
        //ktora sobie "wymyslamy" w tescie

        when(fileAccessService.load()).thenReturn(lines);

        //zasadniczy test metody numOfLInes()
        int n = mainService.numOfLines();
        assertThat(n).isEqualTo(2);
    }

}
