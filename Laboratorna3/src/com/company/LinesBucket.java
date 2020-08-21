package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LinesBucket {
    private List<LomanayaLiniya> lines = new ArrayList<>();

    public void sortLines() {
        Collections.sort(lines, new Comparator<LomanayaLiniya>() {
            @Override
            public int compare(LomanayaLiniya o1, LomanayaLiniya o2) {
                if (o1.lineLength() > o2.lineLength()) {
                    return 1;
                } else if(o1.lineLength() < o2.lineLength()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });

    }

    public void addLines(LomanayaLiniya liniya) {
        lines.add(liniya);
    }

    public List<LomanayaLiniya> getLines() {
        return lines;
    }

    public void setLines(List<LomanayaLiniya> lines) {
        this.lines = lines;
    }
}
