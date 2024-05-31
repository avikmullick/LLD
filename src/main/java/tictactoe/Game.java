package tictactoe;

import java.util.Scanner;

public class Game {
    private final int boardSize;
    private final Player[] players;
    private final Board board;

    private boolean gameIsNotOver;

    public Game(int boardSize){
        this.boardSize=boardSize;
        players=new Player[2];
        board=new Board(boardSize);
        this.gameIsNotOver =true;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public void printBoard(){
        board.printBoard();
    }

    private void calculateWinner(){

        PlayingPiece[][] currentBoard= board.getBoard();
        //diagonal check
        PlayingPiece prevPiece=currentBoard[0][0];
        for(int i=1;i<boardSize;i++){
            PlayingPiece piece=currentBoard[i][i];
            if(piece==null){
                return;
            }
            if(prevPiece.getPlayingPieceType()!=piece.getPlayingPieceType()){
                break;
            }
            prevPiece=piece;
        }

        //diagonal check
        int j=boardSize-1;
        prevPiece=currentBoard[0][j];
        for(int i=1;i<boardSize;i++,j--){
            PlayingPiece piece=currentBoard[i][j];
            if(piece==null){
                return;
            }
            if(prevPiece.getPlayingPieceType()!=piece.getPlayingPieceType()){
                break;
            }
            prevPiece=piece;
        }

        //row check
        for(int i=0;i<boardSize;i++){
            prevPiece=currentBoard[i][0];
            for(j=1;j<boardSize;j++) {
                PlayingPiece piece = currentBoard[i][j];
                if (piece == null) {
                    return;
                }
                if (prevPiece.getPlayingPieceType() != piece.getPlayingPieceType()) {
                    break;
                }
                prevPiece = piece;
            }
        }

        //column check
        for(int i=0;i<boardSize;i++){
            prevPiece=currentBoard[0][i];
            for(j=1;j<boardSize;j++) {
                PlayingPiece piece = currentBoard[j][i];
                if (piece == null) {
                    return;
                }
                if (prevPiece.getPlayingPieceType() != piece.getPlayingPieceType()) {
                    break;
                }
                prevPiece = piece;
            }
        }

        gameIsNotOver =false;
        System.out.println("GAME IS OVER!!");
    }

    public void startGame(){
            players[0]=new Player("Avik",new XPlayingPiece());
            players[1]=new Player("Anant",new OPlayingPiece());
            int playerTurn =0;
            int whileLoop=0;
            while(gameIsNotOver && whileLoop<=boardSize*2){
                System.out.print("Player "+players[playerTurn].getPlayerName()+"Enter row,column :");
                Scanner inputScanner=new Scanner(System.in);
                String readLine=inputScanner.nextLine();
                String[] values=readLine.split(",");
                int row=Integer.parseInt(values[0]);
                int column=Integer.parseInt(values[1]);
                board.addPiece(players[playerTurn].getPlayingPiece(),row,column);
                System.out.println();
                board.printBoard();
                playerTurn++;
                if(playerTurn==players.length){
                    playerTurn=0;
                }
                calculateWinner();
                whileLoop++;
            }
    }
}
