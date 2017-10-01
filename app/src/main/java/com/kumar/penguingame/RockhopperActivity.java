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

public class RockhopperActivity extends Activity {
	
Button b11;
RadioGroup radiogroup10;
RadioButton rb31, rb32, rb33;
int counter = 1;
TextView sc10;
int temp11;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.rockhopper); 
    
    int v11 = getIntent().getExtras().getInt("val10", -1);
    sc10 = (TextView)findViewById(R.id.txt22); 
    sc10.setText("Score : " + v11 );
    
	radiogroup10 = (RadioGroup) findViewById(R.id.rg11);
	rb31 = (RadioButton) findViewById(R.id.macoronibutton9);
	rb32 = (RadioButton) findViewById(R.id.royalbutton6);
	rb33 = (RadioButton) findViewById(R.id.rockhopperbutton);
	b11 = (Button)findViewById(R.id.button1);
	rb31.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				counter ++;
			Toast.makeText(RockhopperActivity.this,rb31.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
			Toast.makeText(RockhopperActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
		} }
		}); 
	rb32.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				counter ++;
			Toast.makeText(RockhopperActivity.this,rb32.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(RockhopperActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	
	rb33.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				temp11 = getIntent().getExtras().getInt("val10", -1) + 5;
				counter ++;
				sc10.setText("Score : " + temp11);
			Toast.makeText(RockhopperActivity.this,rb33.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(RockhopperActivity.this, RoyalActivity.class);
			intent.putExtra("val11", temp11);
			startActivity(intent);
			}else if (counter >1){
				Toast.makeText(RockhopperActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	b11.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(RockhopperActivity.this,rb33.getText(), Toast.LENGTH_SHORT).show();
			
			}
		}); 
}
	  
  }