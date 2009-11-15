package com.unicorntoast.android.learn.sudoku.activity;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.unicorntoast.android.learn.sudoku.R;

public class Preferences extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);
	}
}
