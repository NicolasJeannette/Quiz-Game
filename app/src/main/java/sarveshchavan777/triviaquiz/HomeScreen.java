package sarveshchavan777.triviaquiz;

import android.content.Intent;
import android.graphics.Typeface;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import info.hoang8f.widget.FButton;

public class HomeScreen extends AppCompatActivity {
    FButton playGame,quit;
    Button pub,crash;
    TextView tQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        //the below method will initialize views
        initViews();

        //PlayGame button - it will take you to the MainGameActivity
        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this,MainGameActivity.class);
                startActivity(intent);
                finish();
            }
        });
        pub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this,MenuPub.class);
                startActivity(intent);
                finish();
            }
        });
        


        //Quit button - This will quit the game
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initViews() {
        //initialize views here
        playGame =(FButton)findViewById(R.id.playGame);
        quit = (FButton) findViewById(R.id.quit);
        tQ = (TextView)findViewById(R.id.tQ);
        pub = (Button)findViewById(R.id.next_level_button);

        //Typeface - this is for fonts style
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/shablagooital.ttf");
        playGame.setTypeface(typeface);
        pub.setTypeface(typeface);
        quit.setTypeface(typeface);
        tQ.setTypeface(typeface);

    }
}
