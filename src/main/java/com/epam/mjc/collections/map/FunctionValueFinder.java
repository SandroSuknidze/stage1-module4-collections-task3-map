package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> map = calculateFunctionMap(sourceList);
        return map.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();
        for (Integer value : sourceList) {
            functionMap.put(value, 5 * value + 2);
        }

        return functionMap;
    }
}
