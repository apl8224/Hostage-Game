package rit.stu.act2;
import rit.cs.Stack;
import rit.stu.act1.StackNode;

/**
 * Author: Alex Laureyns
 *
 * A class that represent the chopper.
 * The chopper can hold up to 6 passengers aligned in a single columns of seats.
 * There is only one door to the chopper that is accessible by the passengers. When they enter the chopper, the occupy the seat closest to the door and any existing passengers move one seat down.
 *
 * In order to preserve fuel, the chopper will only fly the passengers away to safety if the chopper is full, or it is the last group of people to rescue.
 */
public class Chopper {
    private Stack<Player> chopper = new StackNode<>();
    private static final int MAX_OCCUPANCY = 6;
    private int numPassengers;
    private int numRescued = 0;

    /**
     * Creates an Empty Chopper Object
     */
    public Chopper(){
    }

    /**
     * Takes in a player and pushes them onto the stack
     * of players that are currently on the "Chopper"
     * then increments the passengers of the chopper.
     * @param player
     */
    public void boardPassenger(Player player){
        if (numPassengers >= MAX_OCCUPANCY){
            this.rescuePassengers();
        }
        System.out.println(player.toString() + " boards the chopper!");
        chopper.push(player);
        numPassengers += 1;
    }

    /**
     * Checks if the number of passengers is currently
     * zero, if so then the chopper is empty.
     * @return
     */
    public boolean isEmpty(){
        return (numPassengers == 0);
    }

    /**
     * Checks if the number of passengers is equal to
     * or exceeds the max occupancy of the chopper that
     * was given. If so, then it will return true.
     *
     * @return T/F
     */
    public boolean isFull(){
        return (numPassengers >= MAX_OCCUPANCY);
    }

    public int getNumRescued(){
        return numRescued;
    }
    /**
     * Adds the number of current passengers on the chopper
     * to the number of total rescued players. Then changes
     * the current number of passengers to zero.
     */
    public void rescuePassengers(){
        while (!isEmpty()){
            System.out.println("Chopper transported " + chopper.pop().toString() + " to safety!");
            numPassengers -= 1;
            numRescued += 1;
        }

    }
}
