package com.kumar.penguingame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OptionsActivity extends Activity  {
	
	Button play, options, credits;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
		
        
         Button play = (Button)findViewById(R.id.play);
         Button options = (Button)findViewById(R.id.options);
         Button credits = (Button)findViewById(R.id.credits);
         
        
        play.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	
            	Intent intent = new Intent(OptionsActivity.this, AdelieActivity.class);
           		startActivity(intent);
//            	 Random rnd = new Random();
//                 int x = rnd.nextInt(13)+1;
//                 Intent myIntent = new Intent();
//                 s.setscore(0);
//                 
//                 switch(x){
//                 case 1:
//                	            	 
//                	 myIntent.setClass(v.getContext(),AdelieActivity.class);
//                 break;
//                 case 2:
//                	 
//                	 myIntent.setClass(v.getContext(), AfricanActivity.class);
//                 break;
//                 case 3:
//                	 
//                	 myIntent.setClass(v.getContext(), BlueActivity.class);
//                 break;
//                 case 4:
//                	 
//                	 myIntent.setClass(v.getContext(), EmperorActivity.class);
//                 break;
//                 case 5:
//                	 
//                	 myIntent.setClass(v.getContext(), ErectcrestedActivity.class);
//                 break;
//                 case 6:
//                	 
//                	 myIntent.setClass(v.getContext(), GalapogosActivity.class);
//                 break;
//                 case 7:
//                	 
//                	 myIntent.setClass(v.getContext(), GentooActivity.class);
//                 break;
//                 case 8:
//                	 
//                	 myIntent.setClass(v.getContext(), HumboltActivity.class);
//                 break;
//                 case 9:
//                	 
//                	 myIntent.setClass(v.getContext(), KingActivity.class);
//                 break;
//                 case 10:
//                	 
//                	 myIntent.setClass(v.getContext(), MacoroniActivity.class);
//                 break;
//                 case 11:
//                	 
//                	 myIntent.setClass(v.getContext(), RockhopperActivity.class);
//                 break;
//                 case 12:
//                	 
//                	 myIntent.setClass(v.getContext(), RoyalActivity.class);
//                 break;
//                 case 13:
//                	 
//                	 myIntent.setClass(v.getContext(), YelloweyedActivity.class);
//                 break;
//                 }
//                 startActivity(myIntent);
                             
            }
        });
        
        options.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                
            }
        });
        
        credits.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {            	
            	Intent intent = new Intent(OptionsActivity.this, CreditsActivity.class);
           		startActivity(intent);
                
            }
        });
   }
	
	
}
