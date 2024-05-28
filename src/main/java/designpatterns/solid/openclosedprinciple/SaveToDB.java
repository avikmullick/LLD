package designpatterns.solid.openclosedprinciple;

import designpatterns.solid.singleresponsibilityprinciple.Pen;

public class SaveToDB {
    private final Pen pen;
    private final DatabaseDAO databaseDAO;

    public SaveToDB(Pen pen,DatabaseDAO databaseDAO){
        this.pen=pen;
        this.databaseDAO=databaseDAO;
    }
    public void save(){
        databaseDAO.save();
    }
}
