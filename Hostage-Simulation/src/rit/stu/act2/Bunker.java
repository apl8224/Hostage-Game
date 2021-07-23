package rit.stu.act2;
import rit.cs.Node;
import rit.cs.Queue;
import rit.stu.act1.QueueNode;

import java.nio.file.FileSystemAlreadyExistsException;

public class Bunker {
    private Queue<Soldier> bunker = new QueueNode<>();
    private int numSoldiers;

    /**
     * Constructs a Bunker object given
     * a number of soldiers.
     * @param numSoldiers
     */
    public Bunker(int numSoldiers){
        for(int i = 0; i < numSoldiers; i++){
            this.fortifySoldiers(new Soldier(i));
            //numSoldiers -= 1;
        }
    }

    /**
     *  Remove the next soldier from the front of the
     *  bunker to be deployed on a rescue attempt.
     *
     * @return The soldier leaving, Godspeed soldier.
     */
    public Soldier deployNextSoldier(){
        if (this.hasSoldiers()){
            numSoldiers -= 1;
            return bunker.dequeue();
        }
        System.out.println("The bunker is empty!");
        return null;
    }

    /**
     * Add a new soldier to the end of the bunker.
     *
     * @param soldier The soldier reporting for duty.
     */
    public void fortifySoldiers(Soldier soldier){
        bunker.enqueue(soldier);
        numSoldiers += 1;
    }

    /**
     * Get how many soldiers are in the bunker
     *
     * returns number of soldiers.
     */
    public int getNumSoldiers(){
        return numSoldiers;
    }

    /**
     * Are there soldiers in the bunker?
     * @return T/F
     */
    public boolean hasSoldiers(){
        if(numSoldiers > 0){
            return true;
        }
        return false;
    }

}
