import com.klb.commons.ArrayHelper;
import org.junit.Test;

import static org.junit.Assert.fail;

public class ArrayHelperTest {

    //testuje czy metoda replace dziala poprawnie gdy dostaje poprawne argumenty
    @Test
    public void testReplaceValidArguments() {
        String []tab={"xyz", "aaaa", "wwwww", "test", "niesporczak"};

        ArrayHelper.replace(tab, "piwo", 1, 3);

        //sprawdzamy czy mtoda replace zadzialala dobrze
        for(int k = 1; k <= 3; k++) {
            if( DOKONCZ ) {
                fail();   //niezalicza testu
            }
        }

        DOKONCZ????
    }

    //testuje czy replace rzuca wyjatek dla niepoprawnych argumentow
    @Test
    public void testReplaceInvalidArguments() {
        //METODA KTORA JEST PUSTA ZALICZA TET
    }

 }
