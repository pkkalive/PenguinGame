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

public class ErectcrestedActivity extends Activity {
	
Button b5;
 RadioGroup radiogroup4;
 RadioButton rb13, rb14, rb15;
int counter = 1;
TextView sc4;
int temp5;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.erectcrested); 
    
    
    int v5 = getIntent().getExtras().getInt("val4", -1);
    sc4 = (TextView)findViewById(R.id.txt10); 
    sc4.setText("Score : " + v5 );
    
   
	 
	radiogroup4 = (RadioGroup) findViewById(R.id.rg5);
	rb13 = (RadioButton) findViewById(R.id.galapogosbutton);
	rb14 = (RadioButton) findViewById(R.id.gentoobutton);
	rb15 = (RadioButton) findViewById(R.id.erectcrestedbutton1);
	
	b5 = (Button)findViewById(R.id.button1);
	
	rb13.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				counter ++;
			Toast.makeText(ErectcrestedActivity.this,rb13.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(ErectcrestedActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 

	rb14.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter ==1){
				counter ++;
			Toast.makeText(ErectcrestedActivity.this,rb14.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(ErectcrestedActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb15.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				temp5 = getIntent().getExtras().getInt("val4", -1) + 5;
				counter ++;
				sc4.setText("Score : " + temp5);
			Toast.makeText(ErectcrestedActivity.this,rb15.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(ErectcrestedActivity.this, GalapogosActivity.class);
			intent.putExtra("val5", temp5);
       		startActivity(intent);
			} else if (counter > 1){
				Toast.makeText(ErectcrestedActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	
	b5.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(ErectcrestedActivity.this," Named after Ad�lie Land ", Toast.LENGTH_SHORT).show();
			}
		});
	}
 
  }