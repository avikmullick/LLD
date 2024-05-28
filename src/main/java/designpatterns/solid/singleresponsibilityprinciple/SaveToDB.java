package designpatterns.solid.singleresponsibilityprinciple;

public class SaveToDB {
    private Pen pen;

    public SaveToDB(Pen pen){
        this.pen=pen;
    }
    public void saveToDB(){
        System.out.println("Save data to DB");
    }
}
