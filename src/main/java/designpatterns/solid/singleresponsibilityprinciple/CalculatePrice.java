package designpatterns.solid.singleresponsibilityprinciple;

public class CalculatePrice {
    private Pen pen;

    public CalculatePrice(Pen pen){
        this.pen=pen;
    }
    public int calculatePrice(){
        System.out.println("Calculate Price "+pen.getPrice());
        return pen.getPrice();
    }
}
