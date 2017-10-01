package com.kumar.penguingame;

import java.util.Date;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyListFragment extends Fragment {
	private CreditsActivity myActivity;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_show_button, container,
				false);
		Button button = (Button) view.findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
			}
		});
		return view;
	}
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		myActivity = (CreditsActivity) activity;
	}

	
	
}