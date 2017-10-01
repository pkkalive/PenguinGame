package com.kumar.penguingame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class StartActivity extends Activity {
	
	private ProgressBar mProgress;
    private int mProgressStatus = 0;
    private Handler mHandler = new Handler();
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		mProgress = (ProgressBar) findViewById(R.id.progress_Bar);
		
		new Thread(new Runnable() {
			 public void run() {
				 while (mProgressStatus < 100) {
					 mProgressStatus += 5;
					 
					 // Update the progress bar and display the
					 //current value in the text view
					 mHandler.post(new Runnable() {
						 public void run() {
							 mProgress.setProgress(mProgressStatus);
							 
							 }
						 });
					 try {
						 // Sleep for 100 milliseconds.
						 //Just to display the progress slowly
						 Thread.sleep(100);
						 synchronized(this){
	                       	if(mProgressStatus == 100) {
	                       		
	                       		Intent intent = new Intent(StartActivity.this, OptionsActivity.class);
	                       		startActivity(intent);
	                       	}
						 }
						 } catch (InterruptedException e) {
							 e.printStackTrace();
							 }
					 } 
				 }
			 }).start();
	}
	}