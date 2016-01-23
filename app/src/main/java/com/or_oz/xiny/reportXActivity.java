package com.or_oz.xiny;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class reportXActivity extends AppCompatActivity {
    double[] coordinates;
    TextView welcomeTV;
    Spinner XSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_x);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        coordinates = getIntent().getDoubleArrayExtra("coordinates");


        welcomeTV = (TextView)findViewById(R.id.welcomeTextView);
        welcomeTV.setText("Welcome to " + coordinates[0] + ", " + coordinates[1]);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Thanks for submitting!", Snackbar.LENGTH_LONG)
                        .show();
            }
        });
    }

}