import com.klb.commons.ArrayHelper;
import com.klb.commons.RangeArrayException;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ArrayHelperTest {

    //testuje czy metoda replace dziala poprawnie gdy dostaje poprawne argumenty
    @Test
    public void testReplaceValidArguments() throws RangeArrayException {
        String []tab={"xyz", "aaaa", "wwwww", "test", "niesporczak"};

        ArrayHelper.replace(tab, "piwo", 1, 3);

        //sprawdzamy czy mtoda replace zadzialala dobrze
        for(int k = 1; k <= 3; k++) {
            if( !tab[k].equals("piwo") ) {
                fail();   //niezalicza testu
            }
        }

    }

    //testuje czy replace rzuca wyjatek dla niepoprawnych argumentow
    //zaliczy test jesli metoda rzuci wyjatek, w.p.w. nie powinna zaliczyc testu
    @Test
    public void testReplaceInvalidArguments() {
        //METODA KTORA JEST PUSTA ZALICZA TEst
//        try {
//            ArrayHelper.replace(new String[]{}, "piwo", -1, 3);
//            fail();
//        } catch (RangeArrayException ex) {
//
//        }

        boolean q = false;   //zakladam ze metoda nie rzuci wyjatku
        try {
            ArrayHelper.replace(new String[]{}, "piwo", -1, 3);
        } catch (RangeArrayException ex) {
            q = true;  //informacja ze metoda rzucila wyjatek
        }

        assertTrue(q);

    }

 }
