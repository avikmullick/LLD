package designpatterns.solid.openclosedprinciple;

import designpatterns.solid.singleresponsibilityprinciple.Pen;

public class SaveToDBViolatingOC {
    private Pen pen;

    public SaveToDBViolatingOC(Pen pen){
        this.pen=pen;
    }
    public void saveToDB(){
        System.out.println("Save data to DB");
    }

    public void saveToFile(){
        System.out.println("Save data to File");
    }
}
