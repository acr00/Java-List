package com.example;

import java.util.Collections;
import java.util.List;

public final class AppDiasSemana {

    public void createList(List<String> dias) {

        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
    }

    public List<String> getList(List<String> dias) {
        createList(dias);

        return dias;
    }

    public Integer LargoSemana(List<String> dias) {
        createList(dias);

        return dias.size();
    }

    public void BorraUnDia(List<String> dias) {
        createList(dias);

        dias.remove(2);
    }

    public String CogeElementoLista(List<String> dias, int numero) {
        createList(dias);

        return dias.get(numero);
    }

    public boolean getExit(List<String> dias, String dia) {
        createList(dias);

        return dias.contains(dia);
    }

    public List<String> orderList(List<String> dias) {
        createList(dias);

        Collections.sort(dias);
        return dias;
    }

    public List<String> deleteList(List<String> dias) {
        createList(dias);

        dias.clear();

        return dias;
    }
}
