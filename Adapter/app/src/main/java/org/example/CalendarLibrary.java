package org.example;

import java.time.LocalDate;
import java.util.List;

public class CalendarLibrary {
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> events;

    public CalendarLibrary(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addEvent(String eventName, LocalDate date) {
        System.out.println("Event added: " + eventName + " on " + date);
        events.add(eventName);
    }

    public void removeEvent(String eventName) {
        System.out.println("Event removed: " + eventName);
        events.remove(eventName);
    }

    public void getEvents() {
        System.out.println("Events: " + events.toArray());
    }

}
