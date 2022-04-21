package task;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DateIterator implements Iterator<Long> {
    private LocalDateTime localDateTime;
    private int year;
    private int month;
    private int day;

    private int hour;
    private int minute;


    public DateIterator(Integer year, Integer month, Integer day, Integer hour, Integer minute) {
        localDateTime = LocalDateTime.of(year,month,day,hour,minute);
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return true;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Long next() {
        long millis = localDateTime.atZone(ZoneId.of("Asia/Almaty")).toInstant().toEpochMilli();
        increment();
        return millis;
    }

    private void increment() {
        localDateTime = localDateTime.plusHours(5).plusMinutes(10);
    }

    private int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    private int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    private int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
