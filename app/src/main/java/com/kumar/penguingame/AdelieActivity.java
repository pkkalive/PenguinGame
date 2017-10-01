package com.kumar.penguingame;

import java.io.IOException;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class AdelieActivity extends Activity {
	
MediaPlayer mPlayer;	
TextView sc;

 RadioGroup radiogroup;
 RadioButton rb1, rb2, rb3;

Button b1;
int counter = 1;


int score = 0;



@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.adelie); 
    
    
    sc = (TextView)findViewById(R.id.txt2); 
    sc.setText("Score : " + score );
    
    
    mPlayer = MediaPlayer.create(AdelieActivity.this, R.raw.bg_music);
	mPlayer.setLooping(true);
	
	try {
        mPlayer.prepare();
    } catch (IllegalStateException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    mPlayer.start();        

	 
	radiogroup = (RadioGroup) findViewById(R.id.rg1);
	rb1 = (RadioButton) findViewById(R.id.adeliebutton);
	rb2 = (RadioButton) findViewById(R.id.africanbutton);
	rb3 = (RadioButton) findViewById(R.id.bluebutton);
	
	b1 = (Button)findViewById(R.id.button1);

	if (counter == 1){
	rb1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View view) {			
			if (counter == 1){
				score = score + 5;
				counter ++;
			sc.setText("Score : " + score );
						
			Toast.makeText(AdelieActivity.this,rb1.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(AdelieActivity.this, AfricanActivity.class);
			intent.putExtra("val", score);
       		startActivity(intent);
			} else if (counter >1){
				Toast.makeText(AdelieActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 

	rb2.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
			counter ++;
			Toast.makeText(AdelieActivity.this,rb2.getText(), Toast.LENGTH_SHORT).show();
			} else if (counter >1){
				Toast.makeText(AdelieActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb3.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
			counter ++;
			Toast.makeText(AdelieActivity.this,rb3.getText(), Toast.LENGTH_SHORT).show();
			} else if (counter >1){
				Toast.makeText(AdelieActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	
	b1.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(AdelieActivity.this," Named after Ad�lie Land ", Toast.LENGTH_SHORT).show();
			}
		}); 
	} else if (counter >1){
		Toast.makeText(AdelieActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
	}
	
	
}
  }
