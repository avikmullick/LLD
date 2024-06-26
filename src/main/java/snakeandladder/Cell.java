package snakeandladder;

public class Cell {

    private int row;

    private int column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        jump=new Jump();
    }

    private Jump jump;


    public Jump getJump() {
        return jump;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }


}
