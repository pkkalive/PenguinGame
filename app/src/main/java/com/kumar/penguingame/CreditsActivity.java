package com.kumar.penguingame;

import android.app.Activity;
import android.os.Bundle;


public class CreditsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_credit);
	}

	public void onDateSelected(String link) {
		DetailFragment fragment = (DetailFragment) getFragmentManager()
				.findFragmentById(R.id.detailFragment);
		if (fragment != null && fragment.isInLayout()) {
			fragment.setText(link);
		}
	}
       

}
