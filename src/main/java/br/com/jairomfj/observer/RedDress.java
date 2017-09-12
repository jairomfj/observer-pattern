package br.com.jairomfj.observer;

import java.util.ArrayList;
import java.util.List;

public class RedDress implements Observable {

    private List<Observer> users = new ArrayList<>();

    private boolean inStock = true;

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        users.add(o);
    }

    @Override
    public synchronized void removeObserver(Observer o) {
        users.remove(o);
    }

    @Override
    public void notifyObserver() {
        List<Observer> clone = new ArrayList<>();
        clone.addAll(users);

        for(Observer o : clone) o.update();
    }
}
