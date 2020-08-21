package com.company;

import java.util.ArrayList;
import java.util.List;

public class LomanayaLiniya {
    private List<Tochka> liniya = new ArrayList<>();


    public void addingTochka(int x, int y){
        liniya.add(new Tochka(x, y));
    }

    public void removeTochka(int index){
        liniya.remove(index);
    }

    public int lineLength() {
        System.out.println("Dlina linii " + liniya.size() + " tochki");
        return liniya.size();
    }

    public boolean isRepaeting() {
        Tochka tochka;
        for (int i = 0; i < liniya.size(); i++){
           tochka = liniya.get(i);
           if (tochka == liniya.get(i+1)){
               return true;
           }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Liniya dliny " + liniya.size() + " iz tochki " + "x" + liniya.get(0).getX()
                + " y" + liniya.get(0).getY()
                + " do tochki " + "x" + liniya.get(liniya.size()-1).getX() + " y" + liniya.get(liniya.size()-1).getY();
    }
}
