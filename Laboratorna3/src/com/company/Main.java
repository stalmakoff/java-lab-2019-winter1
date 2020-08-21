package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        LomanayaLiniya line = new LomanayaLiniya();
        line.addingTochka(5, 7);
        line.addingTochka(4, 9);
        line.lineLength();
        System.out.println(line);
        LomanayaLiniya lineSecond = new LomanayaLiniya();
        lineSecond.addingTochka(8, 8);
        lineSecond.addingTochka(4, 1);
        lineSecond.addingTochka(5, 1);


        LinesBucket buck = new LinesBucket();
        buck.addLines(line);
        buck.addLines(lineSecond);
        buck.sortLines();


        MapTask mapTask = new MapTask();
        Map<Integer, String> firstMap = new HashMap<>();
        Map<Integer, String> secondMap = new HashMap<>();
        firstMap.put(1, "Tom");
        firstMap.put(2, "Max");
        firstMap.put(3, "Alex");
        secondMap.put(1, "Igor");
        secondMap.put(2, "Max");
        secondMap.put(3, "Oleg");
        System.out.println(mapTask.mapReciever(firstMap, secondMap));



    }


}
