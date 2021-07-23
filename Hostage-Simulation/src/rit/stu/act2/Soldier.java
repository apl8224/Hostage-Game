package rit.stu.act2;

public class Soldier implements Player {

    private int id;

    /**
     * Constructor for the soldier object.
     * @param id
     */
    public Soldier(int id){
        this.id = id;
    }

    /**
     * If the soldier losses to player, it displays the message,
     * "{soldier} cries, 'Besiegt von {player}!'".
     * @param player
     */
    public void defeat(Player player){
        System.out.println(this.toString() + " cries, 'Besiegt von "
                + player.toString() + "!");
    }

    /**
     * If the soldier is triumphant over player,
     * it displays the message, "{soldier} yells, 'Sieg über {player}!'".
     * @param player
     */
    public void victory(Player player){
        System.out.println(this.toString() + " yells, 'Sieg über "
                + player.toString() + "!");
    }

    /**
     * The string representation of a soldier is: "Soldier #n",
     * where n is their id.
     * @return
     */
    public String toString(){
        return "Soldier #" + id;
    }
}
