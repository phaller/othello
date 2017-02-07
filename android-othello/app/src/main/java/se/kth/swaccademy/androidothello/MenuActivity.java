package se.kth.swaccademy.androidothello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    /** Called when the user clicks the button */
    public void startHumanGame(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MainActivity.GAME_TYPE, MainActivity.GAME_HUMAN);
        startActivity(intent);
    }
}