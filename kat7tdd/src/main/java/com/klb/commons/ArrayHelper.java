package com.klb.commons;

/**
 * DLA KAZDEJ KLASY KTORĄ TESTUJĘ POWINNA BYC JEDNA KLASA JUNIT (TESTUJACA)
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

    //do klasy ArrayHelperTests trzeba dodac swiemetody - jedna do testu gdy sa poprawne argumenty, druga do testu rzucania wyjatka

    public static  Double[] sumReverse(Double []arr1, Double []arr2) throws RangeArrayException{
        //sprawdzamy czy argumenty sa poprawne
        if(arr1.length != arr2.length) {
            throw new RangeArrayException();
        }

        Double []result = new Double[arr1.length];   //tablica z sumami
        for(int i = arr1.length - 1; i >= 0; i--) {
            result[result.length -  (i +1)] = arr1[i] + arr2[i];
        }

        return result;

    }


}
