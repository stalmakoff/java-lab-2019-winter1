package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapTask {


    public String mapReciever(Map<Integer, String> firstMap, Map<Integer, String> secondMap) {
        String recieved;
        Map<Integer, String> thirdMap = new HashMap<>();
        firstMap.containsKey(secondMap);
        recieved = firstMap.remove(secondMap);
        return recieved;

    }
}
