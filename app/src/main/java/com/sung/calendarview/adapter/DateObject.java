package com.sung.calendarview.adapter;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by sung on 2017/7/19.
 */

public class DateObject implements Serializable{
    public int year;
    public int month;
    public int day;
    public String YYMMDD;//年月日字符串
    public String YYMM;//年月
    public int position;//在grid中的位置
    public boolean currentMonth = false;

    public DateObject() {
    }

    public DateObject(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        YYMMDD = year+"年"+month+"月"+day+"日";
        YYMM = year+"年"+month+"月";
    }

    public DateObject(Date date) {
        year = date.getYear();
        month = date.getMonth();
        day = date.getDay();
        YYMMDD = year+"年"+month+"月"+day+"日";
        YYMM = year+"年"+month+"月";
    }

    public DateObject(Calendar calendar) {
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH)+1;//month游标（少1）
        day = calendar.get(Calendar.DAY_OF_MONTH);
        YYMMDD = year+"年"+month+"月"+day+"日";
        YYMM = year+"年"+month+"月";
    }

    public void resetDate(){
        YYMMDD = year+"年"+month+"月"+day+"日";
        YYMM = year+"年"+month+"月";
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYYMMDD(String YYMMDD) {
        this.YYMMDD = YYMMDD;
    }

    public void setYYMM(String YYMM) {
        this.YYMM = YYMM;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
