/*
    Create a coordinates class with 2 member variables
    1. x int
    2. y int

    (x, y) => (10, 20)
    
*/

public class Coordinates{ // Class called Coordinates

    int x;

    int y;

    public void printCoordinates(){

        System.out.println("x: " + x + "," + " y: " + y);

    }



    public static void main(String[] args) {

        Coordinates coordinates1 = new Coordinates();

        coordinates1.x = 10;

        coordinates1.y = 20;

        coordinates1.printCoordinates();

        Coordinates coordinates2 = new Coordinates();

        coordinates2.x = 20;

        coordinates2.y = 40;

        coordinates2.printCoordinates();
    }

}