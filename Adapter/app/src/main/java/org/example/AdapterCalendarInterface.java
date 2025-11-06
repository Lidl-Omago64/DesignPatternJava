package org.example;

import java.time.LocalDate;

public interface AdapterCalendarInterface {
    void add(String eventName, LocalDate date);
    void remove(String eventName);
    void getAll();
}
