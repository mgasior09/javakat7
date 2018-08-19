package com.klb.commons;

/**
 * Created by klb on 19.08.18.
 */
public class ArrayHelper {

    /* Przyjmuje tablice obiektow dowolnego typu i podstawia w tej tablicy
       zadany jako drugi argument obiekt na pozycje od indeksu i do j
       np.dla [a, b, c, a], x, 1, 2 ---> [a,x,x,a]
     */

    public static <T> void replace(T[] array, T el, int i, int j) throws RangeArrayException {

        if(i < 0  || j >= array.length) {
            throw new RangeArrayException();
        }

        for(int k = i; k <= j; k++) {
            array[k] = el;
        }

    }


}
