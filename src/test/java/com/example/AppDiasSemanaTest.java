package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class AppDiasSemanaTest {


    AppDiasSemana app = new AppDiasSemana();


    @Test
    public void testCreaLista() {

        List<String> dias = new ArrayList<>();
        app.createList(dias);

        List<String> expectedList = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado",
                "Domingo");
        assertEquals(expectedList, days);

    }

    @Test
    public void testgetList() {

        List<String> dias = new ArrayList<>();
        List<String> resultado = app.getList(days);

        List<String> expectedList = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado",
                "Domingo");
        assertEquals(expectedList, resultado);

    }

    @Test
    public void testLargoSemana() {

        List<String> dias = new ArrayList<>();
        Integer resultado = app.getLong(dias);

        assertEquals(7, resultado);

    }

    @Test
    public void testBorraUnDia() {

        List<String> dias = new ArrayList<>();
        app.deleteOne(dias);

        List<String> expectedList = Arrays.asList("Lunes", "Martes", "Jueves", "Viernes", "Sábado",
                "Domingo");
        assertEquals(expectedList, dias);

    }

    @Test
    public void testCogeElementoLista() {

        List<String> dias = new ArrayList<>();

        String resultado = app.getElement(dias, 5);

        assertEquals("Sábado", resultado);

    }

    @Test
    public void testGetExist() {

        List<String> dias = new ArrayList<>();

        Boolean resultado = app.getExit(dias, "Jueves");

        assertTrue(resultado);

    }

    @Test
    public void testGetNoExist() {

        List<String> dias = new ArrayList<>();

        Boolean resultado = app.getExit(dias, "Mesa");

        assertFalse(resultado);

    }

    @Test
    public void testOrderList() {

        List<String> dias = new ArrayList<>();

        List<String> resultado = app.orderList(dias);

        List<String> expectedList = Arrays.asList("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado",
                "Viernes");
        assertEquals(expectedList, resultado);

    }

    @Test
    public void testDeleteList() {

        List<String> dias = new ArrayList<>();

        List<String> resultado = app.deleteList(dias);

        assertEquals(Collections.emptyList(), resultado);

    }
}
