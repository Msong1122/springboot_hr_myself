package com.msong.hrserver_myself.bean;


import java.sql.Date;
import java.sql.Timestamp;

public class Time {
    private java.sql.Timestamp timestamp;

    private java.sql.Timestamp datetime;

    private java.sql.Date date;

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}