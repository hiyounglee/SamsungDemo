package com.example.samsungdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends Activity {
	private SeekBar sb_seekbar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_activity);
		sb_seekbar = (SeekBar) findViewById(R.id.mainactivity_sb_seekbar);
	}
}
