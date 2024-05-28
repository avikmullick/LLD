package designpatterns.observer;

public class NotificationMain {

    public static void main(String[] args){
        ProductObservable productObservable=new ProductObservableImpl();
        ProductObserver emailObserver=new EmailObserverImpl("avik@gmail.com",productObservable);
        ProductObserver mobileObserver=new MobileObserverImpl("9029922054",productObservable);

        productObservable.add(emailObserver);
        productObservable.add(mobileObserver);
        productObservable.setData(10);
        productObservable.remove(mobileObserver);
        productObservable.setData(20);
    }
}
