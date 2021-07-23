package rit.stu.act2;

import rit.cs.Queue;
import rit.cs.Stack;
import rit.stu.act1.QueueNode;
import rit.stu.act1.StackNode;

/**
 * Create the enemy base with a number of hostages,
 * 1-numHostages, pushed into the cave in order,
 * and a number of guerillas, 1-numGuerillas,
 * added to the guard line in order.
 *
 * @author Alex Laureyns
 */
public class EnemyBase {

    private Queue<Guerilla> guerillas = new QueueNode<>();
    private Stack<Hostage> hostages = new StackNode<>();
    private int numGuerillas;
    private int numHostages;

    /**
     * Constructor for EnemyBase object
     *
     * @param numGuerillas
     * @param numHostages
     */
    public EnemyBase(int numGuerillas, int numHostages){
        for(int i = 0; i < numGuerillas; i++){
            this.addGuerilla(new Guerilla(i));
        }
        for(int y = 0 ; y < numHostages; y++){
            this.addHostage(new Hostage(y));
        }
    }

    /**
     * Add a hostage to the front of the cave.
     *
     * @param hostage
     */
    public void addHostage(Hostage hostage){
        numHostages += 1;
        hostages.push(hostage);
    }

    /**
     * Add a guerilla to the end of the guard line.
     * @param guerilla
     */
    public void addGuerilla(Guerilla guerilla){
        numGuerillas +=1;
        guerillas.enqueue(guerilla);
    }

    /**
     * Remove a guerilla from the front of the guard line.
     *
     * @return Guerilla (The one coming off the front.)
     */
    public Guerilla getGuerilla(){
        numGuerillas -= 1;
        return guerillas.dequeue();
    }

    /**
     *
     * Remove a hostage from the head of the cave.
     * @return Hostage
     */
    public Hostage getHostage(){
        numHostages -= 1;
       return hostages.pop();
    }

    /**
     *
     * Get the number of guerillas in the guard line.
     * @return int (numGuerillas)
     */
    public int getNumGuerillas(){
        return numGuerillas;
    }

    /**
     * Get the number of hostages in the cave
     * @return int (numHostages)
     */
    public int getNumHostages(){
        return numHostages;
    }

    /**
     * A soldier enters the enemy base and attempts to rescue a hostage.
     * @param soldier
     * @return Solider, if there is one left.
     */
    public Hostage rescueHostage(Soldier soldier){
        System.out.println(soldier.toString() + " enters the enemy base...");
        Hostage rescue = hostages.pop();
        if (numGuerillas <= 0){
            return rescue;
        }

        Guerilla guard = this.getGuerilla();

        if (Battlefield.nextInt(1, 100) > 20){
            soldier.victory((Player) guard);
            guard.defeat((Player) soldier);
            return rescue;
        }else{
            guard.victory((Player) soldier);
            soldier.defeat((Player) guard);
            hostages.push(rescue);
        }
        return null;
    }
}

