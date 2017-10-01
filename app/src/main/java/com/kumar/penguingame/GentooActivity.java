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

public class GentooActivity extends Activity {
	
Button b7;
 RadioGroup radiogroup6;
 RadioButton rb19, rb20, rb21;
 int counter = 1;
 TextView sc6;
 int temp7;


@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.gentoo); 
    
    int v7 = getIntent().getExtras().getInt("val6", -1);
    sc6 = (TextView)findViewById(R.id.txt14); 
    sc6.setText("Score : " + v7 );
	 
	radiogroup6 = (RadioGroup) findViewById(R.id.rg7);
	rb19 = (RadioButton) findViewById(R.id.gentoobutton1);
	rb20 = (RadioButton) findViewById(R.id.bluebutton4);
	rb21 = (RadioButton) findViewById(R.id.africanbutton3);
	b7 = (Button)findViewById(R.id.button1);
	
	rb19.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){
				temp7 = getIntent().getExtras().getInt("val6", -1) + 5;
				counter ++;
				sc6.setText("Score : " + temp7);
			Toast.makeText(GentooActivity.this,rb19.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(GentooActivity.this, HumboltActivity.class);
			intent.putExtra("val7", temp7);
			startActivity(intent);
			}else if (counter >1){
				Toast.makeText(GentooActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb20.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){
				counter ++;
		
			Toast.makeText(GentooActivity.this,rb20.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(GentooActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	
	rb21.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){
				counter ++;
		
			Toast.makeText(GentooActivity.this,rb21.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(GentooActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	b7.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GentooActivity.this,rb19.getText(), Toast.LENGTH_SHORT).show();
			}
		});
}

  }