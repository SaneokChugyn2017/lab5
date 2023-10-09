package org.example;

import java.util.*;

public class Dict {
    private LinkedHashMap<String, LinkedHashSet<String>> dictionary;

    public Dict() {
        this.dictionary = new LinkedHashMap<>();
    }

    public void add(String word, String definition) {
        // Если слово уже в словаре, получаем его текущий список определений
        LinkedHashSet<String> definitions = dictionary.get(word);

        // Если слово новое, создаем новый список определений
        if (definitions == null) {
            definitions = new LinkedHashSet<>();
        }

        // Если это определение уже существует для другого слова, выводим предупреждение.
        for (Map.Entry<String, LinkedHashSet<String>> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            LinkedHashSet<String> existingDefinitions = entry.getValue();

            if (!key.equals(word) && existingDefinitions.contains(definition)) {
                System.out.println("Предупреждение: Определение '" + definition + "' уже существует для другого слова");
                return;
            }
        }

        // Если определение не существует для данного слова, добавляем его
        if (!definitions.contains(definition)) {
            definitions.add(definition);
        } else {
            System.out.println("Предупреждение: У слова '" + word + "' повторяющееся определение: " + definition);
        }

        // Обновляем список определений в словаре
        dictionary.put(word, definitions);
    }

    public LinkedHashSet<String> get(String word) {
        System.out.print(word + " : ");
        // Возвращает множество определений для данного слова
        return dictionary.get(word);
    }

    public void getAll(){
        for (var pair : dictionary.entrySet()){
            String word = pair.getKey();
            LinkedHashSet<String> definitions = pair.getValue();
            System.out.println(word + ": " + definitions);
        }
    }
}
