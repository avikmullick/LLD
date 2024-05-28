package designpatterns.observer;

public interface ProductObservable {
    void add(ProductObserver obj);
    void remove(ProductObserver obj);

    void notifyObserver();
    void setData(int stock);

    int getData();

}
