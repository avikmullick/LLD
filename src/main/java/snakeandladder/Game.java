package snakeandladder;

public class Game {

    public static void main(String[] args) {

        Player p1=new Player();
        p1.setPlayerName("Avik");
        p1.setCurrPos(new Cell(-1,-1));

        Player p2=new Player();
        p2.setPlayerName("Anant");
        p2.setCurrPos(new Cell(-1,-1));


        Board board=new Board(5,3,2);

        Dice dice=new Dice();
        dice.rollDice();

        //p1.setCurrPos();

    }
}
