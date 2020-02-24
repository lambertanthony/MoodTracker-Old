package com.anthony.project.moodtracker;

import org.threeten.bp.LocalDate;
import org.threeten.bp.temporal.ChronoUnit;

import java.util.ArrayList;
import java.util.List;

public class DateTools {
    public static long getBetweenDays(LocalDate begin, LocalDate end) {
        return  ChronoUnit.DAYS.between(begin, end);

    }


    public static LocalDate getBeforeWeek() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.minusDays(7);
    }


    public static List<LocalDate> getDatesBetween() {
        List<LocalDate> datesInRange = new ArrayList<>();


        LocalDate startDate = getBeforeWeek()  ;
        LocalDate endDate = LocalDate.now();;
        while (!startDate.isBefore(endDate)) {
            datesInRange.add(startDate);
            startDate = startDate.plusDays(1);
        }
        return datesInRange;
    }


}