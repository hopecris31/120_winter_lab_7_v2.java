/**
 * represents a single die
 */

import java.util.Random;

public class Die {

    public int currSide; //should this be private or public
    private int numSides;
    public final int DEFAULT_SIDES = 6;
    public final int DEFAULT_START = 1;


    /**
     * constructor, initializes the die
     */
    public Die(int sides) { //do not have to define data type in constructor
        numSides = sides;
        currSide = DEFAULT_START;
    }

    /**
     * Constructor, initializes the die with default values
     */
    public Die() {
        numSides = DEFAULT_SIDES;
        currSide = DEFAULT_START;
    }

    /**
     * roll the dice, select random number 1-n.
     * set current side equal to roll value
     */
    public void roll() { //void means does not return anything
        Random rollNum; //declaring that rollNum will be of the random class when written
        rollNum = new Random(); //the roll is a random int
        currSide = rollNum.nextInt(numSides) +1; //variable.method(parameter) // returns a random number in rollNum range
    }

    /**
     * @return the number rolled on the die
     */
    public int getValue() {
        return currSide;
    }
}

