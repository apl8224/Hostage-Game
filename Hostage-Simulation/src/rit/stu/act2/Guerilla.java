package rit.stu.act2;

/**
 * Class to Represent a Guerilla soldier in
 * the Predator game, can keep track of a Guerilla
 * with a given id's status as defeated or victorious
 * in a given engagement.
 *
 */
public class Guerilla implements Player{
    private static final int CHANCE_TO_BEAT_SOLDIER = 20;
    private int id;

    /**
     * Constructs a Guerilla object with a given id
     * number for the Guerilla in question
     * @param id
     */
    public Guerilla(int id){
        this.id = id;

    }

    /**
     * Will Display the appropriate message for a defeated Guerilla
     * if that is the outcome of a given interaction.
     * @param player
     */
    public void defeat(Player player){
        System.out.println(this.toString() + " cries, 'Derrotado por " + player.toString() + " !'");
    }

    /**
     * Will Display the appropriate message for a victorious Guerilla
     * if that is the outcome of a given interaction.
     * @param player
     */
    public void victory(Player player){
        System.out.println(this.toString() + " yells, 'Victoria sobre " + player.toString() + " !'");
    }

    /**
     * returns the Guerillas given id # when it is requested.
     * @return String
     */
    public String toString(){
        return "Guerilla #" + id;
    }
}
