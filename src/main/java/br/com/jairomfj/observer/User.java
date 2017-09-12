package br.com.jairomfj.observer;

public class User implements Observer {

    private Observable observable = null;

    public User(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        buyDress();
        unsubscribe();
    }

    private void unsubscribe() {
        this.observable.removeObserver(this);
    }

    private void buyDress() {
        System.out.println("Got my new Red Dress");
    }
}
