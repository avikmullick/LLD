package designpatterns.solid.singleresponsibilityprinciple;

public class Invoice {

    private Pen pen;

    public Invoice(Pen pen){
        this.pen=pen;
    }
    public void printInvoice(){
        System.out.println("Print invoice");
    }
}
