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

public class KingActivity extends Activity {
	
Button b9;
 RadioGroup radiogroup8;
 RadioButton rb25, rb26, rb27;
int counter = 1;
TextView sc8;
int temp9;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.king); 
    
    int v9 = getIntent().getExtras().getInt("val8", -1);
    sc8 = (TextView)findViewById(R.id.txt18); 
    sc8.setText("Score : " + v9 );
    
    
	 
	radiogroup8 = (RadioGroup) findViewById(R.id.rg9);
	rb25 = (RadioButton) findViewById(R.id.erectcrestedbutton7);
	rb26 = (RadioButton) findViewById(R.id.kingbutton2);
	rb27 = (RadioButton) findViewById(R.id.humboltbutton8);
	b9 = (Button)findViewById(R.id.button1);
	rb25.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
if (counter == 1 ){
				
				counter ++;
			Toast.makeText(KingActivity.this,rb25.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(KingActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb26.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
if (counter == 1 ){
	temp9 = getIntent().getExtras().getInt("val8", -1) + 5;
	counter ++;
	sc8.setText("Score : " + temp9);
			Toast.makeText(KingActivity.this,rb26.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(KingActivity.this, MacoroniActivity.class);
			intent.putExtra("val9", temp9);
			startActivity(intent);
			}else if (counter >1){
				Toast.makeText(KingActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	
	rb27.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
if (counter == 1 ){
				
				counter ++;
			Toast.makeText(KingActivity.this,rb27.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(KingActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	b9.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(KingActivity.this,rb26.getText(), Toast.LENGTH_SHORT).show();
			
			}
		});
}
	   
		
 
  }
