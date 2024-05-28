package designpatterns.solid.openclosedprinciple;

public class File implements DatabaseDAO{

    @Override
    public void save() {
        System.out.println("Save to File");
    }
}
