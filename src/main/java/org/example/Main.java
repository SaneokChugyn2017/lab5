package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] wordArr = {"Альбинос", "Мука", "Хара", "Альбинос", "Микровалновка", "Виноград", "Чукча", "Виноград", "Морж", "Мордиха", "Зелень", "Виски"};
        HashMap<String, Integer> wordList = new HashMap<>();

        for (String a : wordArr) {
            wordList.put(a, wordList.getOrDefault(a, 0) + 1);
        }

        System.out.println(wordList.entrySet());

        Dict dict = new Dict();
        dict.add("Помидор", "Это овощ");
        dict.add("Морковь", "Это овощ");
        dict.add("Энергетик", "Бодрящая жидкость");
        dict.add("Ноутбук", "Там где пишется на джаве");
        dict.add("Я", "Не гений програмирования");
        dict.add("Бобур", "Строит плотины");
        dict.add("Бобур", "7678765");
        dict.add("Бобур", "11");
        dict.add("Бобур", "11");

        dict.getAll();
    }
}
