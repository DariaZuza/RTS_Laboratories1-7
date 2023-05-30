package LabRTS_2.App2;

import java.util.ArrayList;
import java.util.Observable;

class Model extends Observable {
    private ArrayList<Integer> progressValues;

    public ArrayList<Integer> getProgressValues() {
        return progressValues;
    }

    public Model(int noOfThreads) {
        progressValues = new ArrayList<>(noOfThreads);
        for (int i = 0; i < noOfThreads; i++) {
            progressValues.add(0);
        }
    }

    public int getProgressValue(int id) {
        return progressValues.get(id);
    }

    public void setProgressValue(int id, int val) {
        progressValues.set(id, val);
        setChanged();
        notifyObservers(id);
    }
}
