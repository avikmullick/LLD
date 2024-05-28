package designpatterns.solid.openclosedprinciple;

public class Oracle implements DatabaseDAO {

    @Override
    public void save() {
        System.out.println("Save to DB");
    }
}
