package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> responseMap = new HashMap<>();
        sourceMap.forEach((key, value) -> responseMap.put(value, key));

        return responseMap;
    }
}
