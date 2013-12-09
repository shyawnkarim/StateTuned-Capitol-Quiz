package com.example.statetunedcapitolquiz;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartQuizActivity extends Activity {
	//State [] states = new State[3];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_quiz);		
		Button startQuiz = (Button) findViewById(R.id.startquiz);
		startQuiz.setOnClickListener(startButtonListener);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_quiz, menu);
		return true;
	}
	
	public OnClickListener startButtonListener = new OnClickListener()
	{
		
		@Override
		public void onClick(View v) {
			Intent i=new Intent(StartQuizActivity.this, QuizActivity.class);
			//i.putExtra("State Array", states);
		      startActivity(i);
		      //pass states to the new activity
		}
	};

}
