package com.example.statetunedcapitolquiz;

import java.io.IOException;
import java.io.InputStream;

import java.util.Random;


import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity {
	Random r = new Random();
	private int stateIndex;
	private TextView stateName;
	private ImageView stateImage;
	private Button button1;
	private Button button2;
	private Button button3;
	State[] states;
    public static int totalCorrect = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity__quiz);
		states = State.getStateArray();
		stateIndex=r.nextInt(50);
		stateName = (TextView) findViewById(R.id.stateName);
		stateImage = (ImageView) findViewById(R.id.stateImage);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		this.loadQuizElements();		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_quiz, menu);
		return true;
	}
	public void loadQuizElements()
	{
		AssetManager assets = getAssets(); // get app's AssetManager
	    stateName.setText(states[stateIndex].getName());
		String NextStateImage = states[stateIndex].getImage();
	    InputStream stream; // used to read in state images
	    try {
		stream = assets.open(NextStateImage);	
	         
	    // load the asset as a Drawable and display on the flagImageView
	    Drawable stateArt = Drawable.createFromStream(stream, NextStateImage);
	    stateImage.setImageDrawable(stateArt);                       
	    }
	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//need to randomize the buttons below so capitol is on different buttons
		int positions[] = {0,1,2};
        shuffleArray(positions);
        final int[] shuffledPositions = positions;

        String values[] = new String[3];

        values[positions[0]]= states[stateIndex].getCapitol();
        values[positions[1]] = states[stateIndex].getCity1();
        values[positions[2]] = states[stateIndex].getCity2();

        button1.setText(values[0]);
		button2.setText(values[1]);
		button3.setText(values[2]);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(shuffledPositions[0]==0)
                    correctAnswer();
                else
                    incorrectAnswer();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(shuffledPositions[0]==1)
                    correctAnswer();
                else
                    incorrectAnswer();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(shuffledPositions[0]==2)
                    correctAnswer();
                else
                    incorrectAnswer();
            }
        });
	}

    private void incorrectAnswer() {
        Toast.makeText(getApplicationContext(), "Incorrect Answer, Total Correct: "+totalCorrect+ " try again", Toast.LENGTH_SHORT).show();
        totalCorrect = 0;
        startActivity(new Intent(getApplicationContext(), StartQuizActivity.class));
    }

    private void correctAnswer() {
        totalCorrect++;
        Toast.makeText(getApplicationContext(), "Correct Answer! Total Correct: "+totalCorrect, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
    }

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
	
	
}
