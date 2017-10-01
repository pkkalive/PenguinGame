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

public class MacoroniActivity extends Activity {
	
Button b10;
 RadioGroup radiogroup9;
 RadioButton rb28, rb29, rb30;
int counter = 1;
TextView sc9;
int temp10;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.macoroni); 
    
    
    int v10 = getIntent().getExtras().getInt("val9", -1);
    sc9 = (TextView)findViewById(R.id.txt20); 
    sc9.setText("Score : " + v10 );
        

	 
	radiogroup9 = (RadioGroup) findViewById(R.id.rg10);
	rb28 = (RadioButton) findViewById(R.id.macoronibutton7);
	rb29 = (RadioButton) findViewById(R.id.galapogosbutton2);
	rb30 = (RadioButton) findViewById(R.id.royalbutton8);
	b10 = (Button)findViewById(R.id.button1);
	rb28.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){
				temp10 = getIntent().getExtras().getInt("val9", -1) + 5;
				counter ++;
				sc9.setText("Score : " + temp10);
			Toast.makeText(MacoroniActivity.this,rb28.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(MacoroniActivity.this, RockhopperActivity.class);
			intent.putExtra("val10", temp10);
			startActivity(intent);
			}else if (counter >1){
				Toast.makeText(MacoroniActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb29.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				counter ++;
			Toast.makeText(MacoroniActivity.this,rb29.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(MacoroniActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	
	rb30.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){				
				counter ++;
			Toast.makeText(MacoroniActivity.this,rb30.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(MacoroniActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	b10.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(MacoroniActivity.this,rb28.getText(), Toast.LENGTH_SHORT).show();
			
			} 
		}); 
}
	   
		
 
  }