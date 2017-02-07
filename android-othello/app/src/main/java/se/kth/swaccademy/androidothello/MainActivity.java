package se.kth.swaccademy.androidothello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kth.game.othello.Othello;
import kth.game.othello.OthelloFactory;
import kth.game.othello.imp.NodeImp;
import kth.game.othello.imp.OthelloFactoryImp;

public class MainActivity extends AppCompatActivity {
    OthelloFactory gameFactory = new OthelloFactoryImp();
    Othello game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BoardView boardView = (BoardView) findViewById(R.id.boardView);

        game = gameFactory.createHumanGame();
        game.start();

        boardView.setModel(game.getBoard());
        boardView.setEventListener(new BoardView.BoardViewListener() {
            @Override
            public void onClick(int x, int y) {
                String nodeId = NodeImp.format(x,y);
                game.move(game.getPlayerInTurn().getId(), nodeId);
                boardView.invalidate();
            }
        });
    }
}
