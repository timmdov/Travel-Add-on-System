package services;

public abstract class OrderProcess {

    public final void processOrder() {
        askPreferences();
        prepare();
        deliver();
        acceptPayment();
    }

    protected abstract void askPreferences();
    protected abstract void prepare();
    protected abstract void deliver();
    protected abstract void acceptPayment();
}