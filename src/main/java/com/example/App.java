package com.example;

import java.util.Collections;
import java.util.List;

public final class App {

    public void createList(List<String> days) {
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
    }

    public List<String> getList(List<String> days) {
        createList(days);

        return days;
    }

    public Integer getLong(List<String> days) {
        createList(days);

        return days.size();
    }

    public void deleteOne(List<String> days) {
        createList(days);

        days.remove(2);
    }

    public String getElement(List<String> days, int number) {
        createList(days);

        return days.get(number);
    }

    public boolean getExit(List<String> days, String day) {
        createList(days);

        return days.contains(day);
    }

    public List<String> orderList(List<String> days) {
        createList(days);

        Collections.sort(days);
        return days;
    }

    public List<String> deleteList(List<String> days) {
        createList(days);

        days.clear();

        return days;
    }
}
