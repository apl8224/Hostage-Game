package rit.stu.act2;

public class Hostage implements Player {

    private int id;

    public Hostage(int id){
        this.id = id;
    }

    public void defeat(Player player){
        System.out.println(this.toString() + " cries, 'Defeated by " + player.toString());
    }

    public void victory(Player player){
        System.out.println(this.toString() + " yells, 'Victory over  " + player.toString());
    }

    public String toString(){
        return "Hostage #" + id;
    }
}
