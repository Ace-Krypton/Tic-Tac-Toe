import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] gameBoard = {{" ", "|", " ", "|", " "},    //This is for, GameBoard UI
                                {"-", "+", "-", "+", "-"},
                                {" ", "|", " ", "|", " "},
                                {"-", "+", "-", "+", "-"},
                                {" ", "|", " ", "|", " "}};

        printGameBoard(gameBoard); //This is for, sending elements to the void method named "printGameBoard"

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your placement (1-9): ");
        int pos = scan.nextInt();

        System.out.println(pos);

        placePiece(gameBoard, pos, "player"); // -> User  //Our method requires gameBoard, position and user that is why we entered that values in it

        Random rand = new Random();
        int cpuPos = rand.nextInt();
        placePiece(gameBoard, pos, "cpu");  // -> Computer //We can use AI to create moves, but in this example I used Random() method to do that

        printGameBoard(gameBoard); //This is for, sending elements to the void method named "printGameBoard"
    }
    public static void printGameBoard(String[][] gameBoard){
        for(String[] row : gameBoard){    //This is for, printing the elements of 2D array gameBoard
            for(String c : row)
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public static void placePiece(String[][] gameBoard, int pos, String user){
        String symbol = "X";    //Default symbol is "X" right now

        if(user.equals("player"))   //If user == "player" the symbol will be "X"
            symbol = "X";
        else if(user.equals("cpu"))  //But if user == "cpu" it will be symbol "O"
            symbol = "O";

        switch(pos){
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
            default -> System.out.println("Something went wrong, try again");
        }
    }
}
