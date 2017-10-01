package com.kumar.penguingame;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ScorecardActivity extends Activity {
	
Button b1;
TextView fsc;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.score); 
    

    int val14 = getIntent().getExtras().getInt("val13", -1);
    fsc = (TextView)findViewById(R.id.txt4);
    fsc.setText(" Your Score : " + val14 ); 
    
	
	b1 = (Button)findViewById(R.id.button1);	
	
	b1.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View view) {
			//Intent intent = new Intent(ScorecardActivity.this, SaveActivity.class);
			
			//startActivity(intent);
			}
		}); 
	}
	
}
  
