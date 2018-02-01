package asd.booking.utils;

import java.time.LocalDate;

public class DateTimeAdapter {

    public static String adapt(LocalDate localDate) {
        StringBuilder ret = new StringBuilder(30);
        ret.append(localDate.getYear());
        ret.append("-");
        if (localDate.getMonthValue() < 10) {
            ret.append("0");
            ret.append(localDate.getMonthValue());
        } else {
            ret.append(localDate.getMonthValue());
        }
        ret.append("-");
        if (localDate.getDayOfMonth() < 10) {
            ret.append("0");
            ret.append(localDate.getDayOfMonth());
        } else {
            ret.append(localDate.getDayOfMonth());
        }
        return ret.toString();
    }
}
