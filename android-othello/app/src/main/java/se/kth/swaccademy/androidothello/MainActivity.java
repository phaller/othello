package se.kth.swaccademy.androidothello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kth.game.othello.Othello;
import kth.game.othello.OthelloFactory;
import kth.game.othello.imp.OthelloFactoryImp;

public class MainActivity extends AppCompatActivity {
    OthelloFactory gameFactory = new OthelloFactoryImp();
    private Othello game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = gameFactory.createHumanGame();
    }
}
