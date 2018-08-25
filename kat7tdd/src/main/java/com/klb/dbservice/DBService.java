package com.klb.dbservice;

/**
 * Created by klb on 25.08.18.
 */
public class DBService {

    private DBConnector dbConnector = new DBConnector();

    //zwraca liczbe wystapien <word> z komorki z tabeli
    //ZAL. SLOWA W KONTENCIE SA OODZIELONE SPACJA

    //np. jesli content = "abc xyz abc", word = "abc" to metoda powinna zwrocic 2
    public int countWord(String tableName, int RowId,  String columnName, String word) {
        String content = dbConnector.getContent(tableName, RowId, columnName);

        String [] parts = content.split(" ");
        int result = 0;
        for(String s : parts) {
            if(s.equals(word)) {
                result++;
            }
        }

        return result;
    }

}
