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

public class GalapogosActivity extends Activity {
	
Button b6;
	RadioGroup radiogroup5;
 RadioButton rb16, rb17, rb18;
 int counter = 1;
 TextView sc5;
 int temp6;


@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.galapogos); 
    
    int v6 = getIntent().getExtras().getInt("val5", -1);
    sc5 = (TextView)findViewById(R.id.txt12); 
    sc5.setText("Score : " + v6 );
	 
	radiogroup5 = (RadioGroup) findViewById(R.id.rg6);
	rb16 = (RadioButton) findViewById(R.id.galapogosbutton1);
	rb17 = (RadioButton) findViewById(R.id.humboltobutton);
	rb18 = (RadioButton) findViewById(R.id.adeliebutton1);
	b6 = (Button)findViewById(R.id.button1);
	rb16.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter ==1){
				temp6 = getIntent().getExtras().getInt("val5", -1) + 5;
				counter ++;
				sc5.setText("Score : " + temp6);
			Toast.makeText(GalapogosActivity.this,rb16.getText(), Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(GalapogosActivity.this, GentooActivity.class);
			intent.putExtra("val6", temp6);
       		startActivity(intent);
			}else if (counter >1){
				Toast.makeText(GalapogosActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 

	rb17.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){
				counter ++;
			Toast.makeText(GalapogosActivity.this,rb17.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(GalapogosActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		}); 
	rb18.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			if (counter == 1 ){
				counter ++;
			Toast.makeText(GalapogosActivity.this,rb18.getText(), Toast.LENGTH_SHORT).show();
			
			}else if (counter >1){
				Toast.makeText(GalapogosActivity.this," Please Try again ", Toast.LENGTH_SHORT).show();
			} }
		});
	b6.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GalapogosActivity.this," Named after Ad�lie Land ", Toast.LENGTH_SHORT).show();
			}
		});
}
 
  }
