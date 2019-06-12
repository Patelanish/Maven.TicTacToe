package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {


    Character[][] theMatrix = new Character[3][3];


    public Board(Character[][] Matrix) {
        this.theMatrix = Matrix;


    }

    public Boolean isInFavorOfX() {


        return (checkRows().equals("X") || checkColumns().equals("X") || checkDiagonal().equals("X"));
    }


    private Object checkDiagonal() {

        Object A = "T";
        if (theMatrix[0][0].equals(theMatrix[1][1]) && theMatrix[0][0].equals(theMatrix[2][2]) && (!theMatrix[0][0].equals(' '))) {
            A = theMatrix[1][1].toString();
        } else if (theMatrix[0][2].equals(theMatrix[1][1]) && theMatrix[0][2].equals(theMatrix[2][0]) && (!theMatrix[0][2].equals(' '))) {
            A = theMatrix[1][1].toString();
        }


            return A;
        }



    private Object checkColumns() {

        String A = "T";

        for (int J = 0; J < 3; J++){
            if(theMatrix[0][J].equals(theMatrix[1][J]) && theMatrix[0][J].equals(theMatrix[2][J]) && (!theMatrix[0][J].equals(' '))) {
                A = theMatrix[0][J].toString();
                break;
            }
        }

        return A;
    }


    private String checkRows() {

        String A = "T";

        for (int i = 0; i < 3; i++){
            if(theMatrix[i][0].equals(theMatrix[i][1]) && theMatrix[i][0].equals(theMatrix[i][2]) && (!theMatrix[i][0].equals(' '))) {
                A = theMatrix[i][0].toString();
                        break;
            }
        }

        return A;
    }

    public Boolean isInFavorOfO() {

        return (checkRows().equals("O") || checkColumns().equals("O") || checkDiagonal().equals("O"));
    }

    public Boolean isTie() {
        return (checkRows().equals("T") && checkColumns().equals("T") && checkDiagonal().equals("T"));
    }

    public String getWinner() {

        if (isInFavorOfX() == true){
            return "X";
        } else if (isInFavorOfO() == true) {
            return "O";
        } else {
            return "T";
        }
    }

}