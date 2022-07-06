package com.example.numberguessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNum;

    public void Guess(View view){
        EditText guess = (EditText) findViewById(R.id.numberTool);
        int guessInt = Integer.parseInt(guess.getText().toString());

        if(guessInt > randomNum){
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        }
        else if(guessInt < randomNum){
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Correct! One more time :)", Toast.LENGTH_SHORT).show();

            /*
             * generate a number 1-20
             * than restart the game.
             */
            Random random = new Random();
            randomNum = random.nextInt(20) + 1;
        }
        Log.i("Guess", guess.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        randomNum = random.nextInt(20) + 1;

    }
}