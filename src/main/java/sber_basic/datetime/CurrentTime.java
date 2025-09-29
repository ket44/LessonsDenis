package sber_basic.datetime;

public class CurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        final int MILLISECONDS_PER_SECOND = 1000; // 1 секунда содержит 1000 миллисекунд
        final int SECONDS_PER_MINUTE = 60; // 1 минута содержит 60 секунд
        final int MINUTES_PER_HOUR = 60; // 1 час содержит 60 минут
        final int HOURS_PER_DAY = 24; // 1 сутки содержат 24 часа

        long totalSeconds; // общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
        long totalMinutes; // общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
        long totalHours; // общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970

        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
        long currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        long currentMinute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        long currentHour = totalHours % HOURS_PER_DAY;


    }
}
