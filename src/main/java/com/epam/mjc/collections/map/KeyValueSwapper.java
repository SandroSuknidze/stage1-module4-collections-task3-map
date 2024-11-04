package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String value = entry.getValue();
            Integer key = entry.getKey();
            if (!result.containsKey(value) || key < result.get(value)) {
                result.put(value, key);
            }
        }

        return result;
    }
}
