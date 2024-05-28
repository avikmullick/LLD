package designpatterns.observer;

public class MobileObserverImpl implements ProductObserver{

    private final String  mobileNumber;

    private final ProductObservable productObservable;

    public MobileObserverImpl(String  mobileNumber,ProductObservable productObservable){
        this.mobileNumber=mobileNumber;
        this.productObservable=productObservable;
    }
    @Override
    public void update() {
        System.out.println("Mobile message received "+mobileNumber+" Stock availability "+productObservable.getData());
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
