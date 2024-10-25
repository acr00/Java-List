package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class AppTest {

    App app = new App();

    @Test
    public void testCreateList() {
        List<String> days = new ArrayList<>();
        app.createList(days);

        List<String> expectedList = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado",
                "Domingo");
        assertEquals(expectedList, days);
    }

    @Test
    public void testGetList() {
        List<String> days = new ArrayList<>();
        List<String> result = app.getList(days);

        List<String> expectedList = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado",
                "Domingo");
        assertEquals(expectedList, result);
    }

    @Test
    public void testGetLong() {
        List<String> days = new ArrayList<>();
        Integer result = app.getLong(days);

        assertEquals(7, result);
    }

    @Test
    public void testDeleteOne() {
        List<String> days = new ArrayList<>();
        app.deleteOne(days);

        List<String> expectedList = Arrays.asList("Lunes", "Martes", "Jueves", "Viernes", "Sábado",
                "Domingo");
        assertEquals(expectedList, days);
    }

    @Test
    public void testGetElement() {
        List<String> days = new ArrayList<>();

        String result = app.getElement(days, 5);

        assertEquals("Sábado", result);
    }

    @Test
    public void testGetExist() {
        List<String> days = new ArrayList<>();

        Boolean result = app.getExit(days, "Jueves");

        assertTrue(result);
    }

    @Test
    public void testGetNoExist() {
        List<String> days = new ArrayList<>();

        Boolean result = app.getExit(days, "Mesa");

        assertFalse(result);
    }

    @Test
    public void testOrderList() {
        List<String> days = new ArrayList<>();

        List<String> result = app.orderList(days);

        List<String> expectedList = Arrays.asList("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado",
                "Viernes");
        assertEquals(expectedList, result);
    }

    @Test
    public void testDeleteList() {
        List<String> days = new ArrayList<>();

        List<String> result = app.deleteList(days);

        assertEquals(Collections.emptyList(), result);
    }
}
