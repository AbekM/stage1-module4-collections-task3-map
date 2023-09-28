package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {

  public Map<String, Integer> createWordRepetitionMap (String sentence) {
    Map<String, Integer> response = new HashMap<>();
    String sen = sentence.toLowerCase(Locale.ROOT);
    StringTokenizer st = new StringTokenizer(sen, " ,.");
    List<String> tokens = new ArrayList<>();
    while (st.hasMoreTokens()) {
      tokens.add(st.nextToken());
    }
    for (String s : tokens) {
      if (response.containsKey(s)) {
        Integer i = response.get(s);
        response.put(s, i + 1);
      } else  {
        response.put(s, 1);
      }
    }
    return response;
  }
}
