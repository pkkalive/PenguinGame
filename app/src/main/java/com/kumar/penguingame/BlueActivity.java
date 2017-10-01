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

public class BlueActivity extends Activity {
	
Button b3;
int counter = 1;

 RadioGroup radiogroup2;
 RadioButton rb7, rb8, rb9;

 TextView sc2;
 int temp1;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.blue); 
    
    
    int v1 = getIntent().getExtras().getInt("val2", -1);
    sc2 = (TextView)findViewById(R.id.txt6); 
    sc2.setText("Score : " + v1 );
    
	radiogroup2 = (RadioGroup) findViewById(R.id.rg3);
	rb7 = (RadioButton) findViewById(R.id.kingbutton);
	rb8 = (RadioButton) findViewById(R.id.africanbutton2);
	rb9 = (RadioButton) findViewById(R.id.bluebutton1);
	b3 = (Button)findViewById(R.id.button1);
	
	rb7.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				counter ++;
			Toast.makeText(BlueActivity.this,rb7.getText(), Toast.LENGTH_SHORT).show();
			} else if (counter >1){
				Toast.makeText(BlueActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 

	rb8.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				counter ++;
			Toast.makeText(BlueActivity.this,rb8.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(BlueActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb9.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				
				temp1 = getIntent().getExtras().getInt("val2", -1) + 5;
				counter ++;
				sc2.setText("Score : " + temp1);
			Toast.makeText(BlueActivity.this,rb9.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(BlueActivity.this, EmperorActivity.class);
			intent.putExtra("val3", temp1);
       		startActivity(intent);
			}else if (counter >1){
				Toast.makeText(BlueActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	b3.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(BlueActivity.this," NSmallest Species of penguin ", Toast.LENGTH_SHORT).show();
			}
		});
	
}
	   
		   	
 
  }