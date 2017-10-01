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

public class RoyalActivity extends Activity {
	
Button b12;
 RadioGroup radiogroup11;
 RadioButton rb34, rb35, rb36;
int counter = 1;
TextView sc11;
int temp12;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.royal); 
    
    int v12 = getIntent().getExtras().getInt("val11", -1);
    sc11 = (TextView)findViewById(R.id.txt24); 
    sc11.setText("Score : " + v12 );
	 
	radiogroup11 = (RadioGroup) findViewById(R.id.rg12);
	rb34 = (RadioButton) findViewById(R.id.africanbutton9);
	rb35 = (RadioButton) findViewById(R.id.royalbutton9);
	rb36 = (RadioButton) findViewById(R.id.emperorbutton9);
	b12 = (Button)findViewById(R.id.button1);
	
	rb34.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				counter ++;
			Toast.makeText(RoyalActivity.this,rb34.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(RoyalActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb35.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				temp12 = getIntent().getExtras().getInt("val11", -1) + 5;
				counter ++;
				sc11.setText("Score : " + temp12);
			Toast.makeText(RoyalActivity.this,rb35.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(RoyalActivity.this, YelloweyedActivity.class);
			intent.putExtra("val12", temp12);
			startActivity(intent);
			}else if (counter >1){
				Toast.makeText(RoyalActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	
	rb36.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				counter ++;
			Toast.makeText(RoyalActivity.this,rb36.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(RoyalActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	b12.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(RoyalActivity.this," Breed only on Macquarie Island", Toast.LENGTH_SHORT).show();
			
			}
		});
}
	   
		
 
  }