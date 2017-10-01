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

public class HumboltActivity extends Activity{
	
 Button b8;
 RadioGroup radiogroup7;
 RadioButton rb22, rb23, rb24;
 int counter = 1;
 TextView sc7;
 int temp8;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.humbolt); 
    
    int v8 = getIntent().getExtras().getInt("val7", -1);
    sc7 = (TextView)findViewById(R.id.txt16); 
    sc7.setText("Score : " + v8 );
    
    
    
	radiogroup7 = (RadioGroup) findViewById(R.id.rg8);
	rb22 = (RadioButton) findViewById(R.id.erectcrestedbutton2);
	rb23 = (RadioButton) findViewById(R.id.bluebutton3);
	rb24 = (RadioButton) findViewById(R.id.humboltbutton3);
	b8 = (Button)findViewById(R.id.button1);
	rb22.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				counter ++;				
			Toast.makeText(HumboltActivity.this,rb22.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(HumboltActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb23.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){
				
				counter ++;
			Toast.makeText(HumboltActivity.this,rb23.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(HumboltActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	
	rb24.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){
				temp8 = getIntent().getExtras().getInt("val7", -1) + 5;
				counter ++;
				sc7.setText("Score : " + temp8);
			Toast.makeText(HumboltActivity.this,rb24.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(HumboltActivity.this, KingActivity.class);
			intent.putExtra("val8", temp8);
			startActivity(intent);
			}else if (counter >1){
				Toast.makeText(HumboltActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	b8.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(HumboltActivity.this,rb24.getText(), Toast.LENGTH_SHORT).show();
			
			}
		});
}
	   
		
 
  }