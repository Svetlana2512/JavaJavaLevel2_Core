package Lesson3;

import java.util.ArrayList;

class Box<T>{
    private boolean isFree = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> arrayList;



    void addFruit(T Box) {
        if (currentWeight + 1 <= maxWeight) {
            arrayList.add(Box);
            currentWeight++;
            if (arrayList.size() < 1)
                isFree = false;
        } else
            System.out.println("Коробка полна");
    }



    float getWeight(Box a) {
        return arrayList.size() * arrayList.get(0).weigth;
    }



    boolean compare(Box a1, Box a2) {
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

