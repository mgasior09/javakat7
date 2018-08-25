package com.klb.commons;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by klb on 25.08.18.
 */
public class StringCommons {
    public static int countLetters(String word, char letter) {
        int result = 0;
        for(int i =0; i < word.length(); i++) {
            if(word.charAt(i) == letter) {
                result++;
            }
        }

        return result;
    }

    public static boolean pal(String word) {

        int i = 0;
        int j  = word.length() - 1;
        while(i < j) {
            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }
            //przejscie do kolejnej pary w kolejnej iteracji
            i++;
            j--;
        }

        return true;

//       for(int i = 0,  j = word.length() - 1; i != j; i++, j--) {
//           if(word)
//       }
    }
}
