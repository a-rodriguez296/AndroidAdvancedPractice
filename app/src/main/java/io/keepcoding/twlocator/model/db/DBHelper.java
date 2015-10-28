package io.keepcoding.twlocator.model.db;

import java.util.Date;

public class DBHelper {

    public static Long convertDateToLong(Date date) {
        if (date != null) {
            return date.getTime();
        }
        return null;
    }

}
