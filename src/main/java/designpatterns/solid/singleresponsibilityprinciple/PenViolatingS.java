package designpatterns.solid.singleresponsibilityprinciple;

public class PenViolatingS {

    //properties of pen
    private String typeOfPen;
    private int price;
    public int calculatePrice(){
        System.out.println("Calculate Price "+price);
        return price;
    }

    public void printInvoice(){
        System.out.println("Print invoice");
    }

    public void saveToDB(){
        System.out.println("Save data to DB");
    }
}
