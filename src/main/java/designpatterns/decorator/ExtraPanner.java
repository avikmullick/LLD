package designpatterns.decorator;

public class ExtraPanner implements Toppings{

    Pizza basePizza;

    public ExtraPanner(Pizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int getCost() {
        return this.basePizza.getCost()+100;
    }
}

