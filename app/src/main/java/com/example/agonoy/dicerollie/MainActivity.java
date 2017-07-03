package com.example.agonoy.dicerollie;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.os.Build.VERSION_CODES.O;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                         // (Button) indeed a Button
        Button rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView)findViewById(R.id.imageLeftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        // creating an array to hold number.  final so it will not change (CONSTANT)
        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        }; // end of array


        // listener button // each time button gets press, the code will get executed
      rollButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              Log.d("Dicerollie", "Ze Button has been pressed" );

              // create a random number here
              Random randomNumberGenerator = new Random();

              int number = randomNumberGenerator.nextInt(6); // generates 0 - 5

              // check
              Log.d("Dicerollie", "The random number is: " + number);

              // changes the imageView of leftDice
              leftDice.setImageResource(diceArray[number]);


              // create a new random number for the right dice
              number = randomNumberGenerator.nextInt(6);

              // change the imageView of rightDice
              rightDice.setImageResource(diceArray[number]);

          }
      });// end rollbutton setOnclicklisterner




    } // end onCreate
}  // end MainActivity

