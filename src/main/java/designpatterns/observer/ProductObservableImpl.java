package designpatterns.observer;


import java.util.ArrayList;
import java.util.List;

public class ProductObservableImpl implements ProductObservable{

    private final List<ProductObserver> productObserverList=new ArrayList<>();
    private int stock;
    @Override
    public void add(ProductObserver obj) {
        productObserverList.add(obj);
    }

    @Override
    public void remove(ProductObserver obj) {
        productObserverList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for(ProductObserver obj:productObserverList){
            obj.update();
        }
    }

    @Override
    public void setData(int stock) {
        System.out.println("SET THE DATA "+stock);
        this.stock=stock;
        notifyObserver();
    }

    @Override
    public int getData() {
        return stock;
    }

}
