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

public class AfricanActivity extends Activity {

 RadioGroup radiogroup1;
 RadioButton rb4, rb5, rb6;
Button b2;
TextView sc1;
int counter = 1;


int temp;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.african); 
    
   
    int val1 = getIntent().getExtras().getInt("val", -1);
    sc1 = (TextView)findViewById(R.id.txt4); 
    sc1.setText("Score : " + val1 );
	
	
	radiogroup1 = (RadioGroup) findViewById(R.id.rg2);
	rb4 = (RadioButton) findViewById(R.id.yelloweyedbutton);
	rb5 = (RadioButton) findViewById(R.id.africanbutton1);
	rb6 = (RadioButton) findViewById(R.id.macoronibutton);
	
	b2 = (Button)findViewById(R.id.button2);
	
	rb4.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				counter ++;
			Toast.makeText(AfricanActivity.this,rb4.getText(), Toast.LENGTH_SHORT).show();
			} else if (counter >1){
				Toast.makeText(AfricanActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 

	rb5.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				temp = getIntent().getExtras().getInt("val", -1) + 5;
				counter ++;
				sc1.setText("Score : " + temp);
				
			Toast.makeText(AfricanActivity.this,rb5.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(AfricanActivity.this, BlueActivity.class);
			intent.putExtra("val2", temp);
			startActivity(intent);
			}else if (counter >1){
				Toast.makeText(AfricanActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb6.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				counter ++;
			Toast.makeText(AfricanActivity.this,rb6.getText(), Toast.LENGTH_SHORT).show();
			} else if (counter >1){
				Toast.makeText(AfricanActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	b2.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(AfricanActivity.this," Known as Jackass Penguin ", Toast.LENGTH_SHORT).show();
			}
		});
}

  }