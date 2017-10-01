package com.kumar.penguingame;

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

public class YelloweyedActivity extends Activity {
	
Button b13;
 RadioGroup radiogroup12;
 RadioButton rb37, rb38, rb39;
int counter = 1;
TextView sc12;
int temp13;


@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.yelloweyed); 
    int v13 = getIntent().getExtras().getInt("val12", -1);
    sc12 = (TextView)findViewById(R.id.txt26); 
    sc12.setText("Score : " + v13 );
	radiogroup12 = (RadioGroup) findViewById(R.id.rg13);
	rb37 = (RadioButton) findViewById(R.id.yelloweyedbutton9);
	rb38 = (RadioButton) findViewById(R.id.rockhopperbutton9);
	rb39 = (RadioButton) findViewById(R.id.gentoobutton9);
	b13 = (Button)findViewById(R.id.button1);
	rb37.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				temp13 = getIntent().getExtras().getInt("val12", -1) + 5;
				counter ++;
				sc12.setText("Score : " + temp13);
			Toast.makeText(YelloweyedActivity.this,rb37.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(YelloweyedActivity.this, ScorecardActivity.class);
			intent.putExtra("val12", temp13);
			startActivity(intent);
       		}else if (counter >1){
				Toast.makeText(YelloweyedActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb38.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				counter ++;
			Toast.makeText(YelloweyedActivity.this,rb38.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(YelloweyedActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	
	rb39.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				counter ++;
			Toast.makeText(YelloweyedActivity.this,rb39.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(YelloweyedActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	b13.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(YelloweyedActivity.this,"Native to New Zealand", Toast.LENGTH_SHORT).show();
			
			}
		});
	}
}