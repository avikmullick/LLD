package designpatterns.decorator;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza=new Cheese(new ExtraPanner(new VegDelight()));
        System.out.println(pizza.getCost());
    }
}
