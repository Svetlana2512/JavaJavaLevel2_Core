package Lesson3;

import java.util.ArrayList;

class Box<T>{
    private boolean isFree = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> arrayList;



    void addFruit(T fruit) {
        if (currentWeight + 1 <= maxWeight) {
            arrayList.add(fruit);
            currentWeight++;
            if (arrayList.size() < 1)
                isFree = false;
        } else
            System.out.println("Коробка полна");
    }



    float getWeight(Fruit a) {
        return arrayList.size() * a.weigth;
    }



    boolean compare(Fruit a1, Fruit a2) {
        if (getWeight(a1) == getWeight(a2)) {
            return true;
        } else return false;
    }



    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }
}

