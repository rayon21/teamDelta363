package ca.sfu.delta.models;

import java.lang.String;
import org.springframework.util.StringUtils;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int yearNum, int monthNum, int dayNum){
       year = yearNum;
       month = monthNum;
       day = dayNum;
    }

    //Getters and setters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String yearReturn = String.format("%04d", year);
        String monthReturn = String.format("%02d", month);
        String dayReturn = String.format("%02d", day);
        return yearReturn + "-" + monthReturn + "-" + dayReturn;
    }
}
