package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split("\\W+");

        Map<String, Integer> map = new HashMap<>();

        if (sentence.isEmpty()) {
            return map;
        }

        for (String word : words) {
            map.put(word.toLowerCase(), map.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        return map;
    }
}
