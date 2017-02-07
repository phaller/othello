package kth.game.othello.imp;

import kth.game.othello.Othello;
import kth.game.othello.OthelloFactory;
import kth.game.othello.player.Player;

/**
 * Created by robertog on 2/7/17.
 */
public class OthelloFactoryImp implements OthelloFactory {
    @Override
    public Othello createComputerGame() {
        return null;
    }

    @Override
    public Othello createHumanGame() {
        Player one = new HumanPlayer("P1", "Player 1");
        Player two = new HumanPlayer("P2", "Player 2");
        return new OthelloImp(one, two);
    }

    @Override
    public Othello createHumanVersusComputerGame() {
        return null;
    }
}
