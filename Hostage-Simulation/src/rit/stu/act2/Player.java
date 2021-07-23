package rit.stu.act2;

/**
 * An interface to represent a player in the game.
 * A player is any entity that can come into conflict with another player,
 * where battle yields one victor and one loser.
 *
 * @author Alex Laureyns
 */
public interface Player {

    /**
     * Returns a message representing
     * the status appropriate to the player
     * when they win or suffer defeat.
     * @param n
     */
    void victory(Player n);

    void defeat(Player n);
}
