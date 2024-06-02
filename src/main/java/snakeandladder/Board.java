package snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;

    Snake[] snake;
    Ladder[] ladder;
    int boardSize;

    int snakes;
    int ladders;

    public Board(int boardSize,int snakes,int ladders){
        this.boardSize=boardSize;
        cells=new Cell[boardSize][boardSize];
        this.snakes=snakes;
        this.ladders=ladders;
        snake=new Snake[snakes];
        ladder=new Ladder[ladders];
        initializeBoard();
    }
    public void initializeBoard(){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                cells[i][j]=new Cell(i,j);
            }
        }


        for(int i=0;i<snakes;i++){
            Snake s=new Snake();
            int[] startPos = new int[2];
            startPos[0]=0;
            int[] endPos = new int[2];
            endPos[0]=-1;
            while(startPos[0]>=endPos[0]) {
                startPos[0] = ThreadLocalRandom.current().nextInt(0, boardSize );
                startPos[1] = ThreadLocalRandom.current().nextInt(0, boardSize );
                s.setStartPos(startPos);
                endPos[0] = ThreadLocalRandom.current().nextInt(0, boardSize );
                endPos[1] = ThreadLocalRandom.current().nextInt(0, boardSize );
                s.setEndPos(endPos);
            }
            snake[i]=s;
            cells[startPos[0]][startPos[1]].setJump(s);

        }

        for(int i=0;i<ladders;i++){
            Ladder l=new Ladder();
            int[] startPos = new int[2];
            startPos[0]=0;
            int[] endPos = new int[2];
            endPos[0]=-1;
            while(startPos[0]>=endPos[0]) {
                startPos[0] = ThreadLocalRandom.current().nextInt(0, boardSize );
                startPos[1] = ThreadLocalRandom.current().nextInt(0, boardSize );
                l.setStartPos(startPos);

                endPos[0] = ThreadLocalRandom.current().nextInt(0, boardSize );
                endPos[1] = ThreadLocalRandom.current().nextInt(0, boardSize );
                l.setEndPos(endPos);
            }
            ladder[i]=l;
            cells[endPos[0]][endPos[1]].setJump(l);
        }

    }
}
