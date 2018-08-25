import com.klb.dbservice.DBConnector;
import com.klb.dbservice.DBService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DBServiceTest {

    @Mock
    private DBConnector dbConnector;

    @InjectMocks
    private DBService dbService;

    @Test
    public void testCountWord() {
        String virtualContent = "abc test abcde test xyz";

        when(dbConnector.getContent("tab1", 200, "id"))
                .thenReturn(virtualContent);

        //uruchamiamy metode ktora testujemy
        int n = dbService.countWord("tab1", 200, "id", "test");

        assertThat(n).isEqualTo(2);
    }
}
