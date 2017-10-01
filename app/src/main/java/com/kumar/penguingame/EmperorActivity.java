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

public class EmperorActivity extends Activity {
	
Button b4;
RadioGroup radiogroup3;
RadioButton rb10, rb11, rb12;
int counter = 1;
TextView sc3;
int temp2;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.emperor); 
    
    int v2 = getIntent().getExtras().getInt("val3", -1);
    sc3 = (TextView)findViewById(R.id.txt8); 
    sc3.setText("Score : " + v2 );
    
	radiogroup3 = (RadioGroup) findViewById(R.id.rg4);
	rb10 = (RadioButton) findViewById(R.id.kingbutton1);
	rb11 = (RadioButton) findViewById(R.id.emperorbutton);
	rb12 = (RadioButton) findViewById(R.id.erectcrestedbutton);
	b4 = (Button)findViewById(R.id.button1);
	
	rb10.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				counter ++;
			Toast.makeText(EmperorActivity.this,rb10.getText(), Toast.LENGTH_SHORT).show();
			}else if (counter >1){
				Toast.makeText(EmperorActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 

	rb11.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){				
				temp2 = getIntent().getExtras().getInt("val3", -1) + 5;
				counter ++;
				sc3.setText("Score : " + temp2);
			Toast.makeText(EmperorActivity.this,rb11.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(EmperorActivity.this, ErectcrestedActivity.class);
			intent.putExtra("val4", temp2);
			startActivity(intent);
			
			}else if (counter >1){
				Toast.makeText(EmperorActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb12.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1){
				counter ++;
			Toast.makeText(EmperorActivity.this,rb12.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(EmperorActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	b4.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(EmperorActivity.this," Named after Ad�lie Land ", Toast.LENGTH_SHORT).show();
			}
		});
}
	
 
  }