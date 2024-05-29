package designpatterns.decorator;

public class Cheese implements Toppings{

    Pizza basePizza;

    public Cheese(Pizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int getCost() {
        return this.basePizza.getCost()+100;
    }
}
