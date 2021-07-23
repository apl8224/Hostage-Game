package rit.stu.act2;

public class Predator implements Player {
    public static final int CHANCE_TO_BEAT_HOSTAGE = 75;
    public static final int CHANCE_TO_BEAT_SOLDIER = 50;

    public Predator(){

    }
    public void defeat(Player player){
        System.out.print("The predator cries out in glorious defeat to " + player.toString() + "!");
    }
    public void victory(Player player){
        System.out.print("The predator yells out in triumphant victory over " + player.toString() + "!");
    }

    public String toString(){
        return "Predator";
    }
}
