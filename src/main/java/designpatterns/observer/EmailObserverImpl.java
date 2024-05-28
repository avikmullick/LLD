package designpatterns.observer;

public class EmailObserverImpl implements ProductObserver{
    private final String email;

    private final ProductObservable productObservable;

    public EmailObserverImpl( String email,ProductObservable productObservable){
        this.email=email;
        this.productObservable=productObservable;
    }
    @Override
    public void update() {
        System.out.println("Email received "+email+" Stock availability "+productObservable.getData());
    }

    public String getEmail() {
        return email;
    }
}
