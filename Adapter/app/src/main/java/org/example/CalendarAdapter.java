package org.example;

import java.time.LocalDate;

public class CalendarAdapter {
    private CalendarLibrary calendarLibrary;

    public CalendarAdapter(CalendarLibrary calendarLibrary) {
        this.calendarLibrary = calendarLibrary;
    }

    public void add(String eventName, LocalDate date) {
        calendarLibrary.addEvent(eventName, date);
    }

    public void remove(String eventName) {
        calendarLibrary.removeEvent(eventName);
    }

    public void getAll() {
        calendarLibrary.getEvents();
    }


}
