package snakeandladder;

public class Jump {
    int startPos[];
    int endPos[];

    public Jump(){
        startPos=new int[2];
        endPos=new int[2];
        startPos[0]=-1;
        startPos[1]=-1;

        endPos[0]=-1;
        endPos[1]=-1;
    }

    public int[] getStartPos() {
        return startPos;
    }

    public void setStartPos(int[] startPos) {
        this.startPos = startPos;
    }

    public int[] getEndPos() {
        return endPos;
    }

    public void setEndPos(int[] endPos) {
        this.endPos = endPos;
    }
}
