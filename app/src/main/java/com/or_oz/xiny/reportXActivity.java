package com.or_oz.xiny;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class reportXActivity extends AppCompatActivity {
    double[] coordinates;
    TextView welcomeTV;
    Spinner XSpinner;
    EditText commentsET;
    final String[] xObjects = new String[]{"","Police", "Food", "Preachers", "Shows", "Free Swag"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_x);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        coordinates = getIntent().getDoubleArrayExtra("coordinates");
        XSpinner = (Spinner)findViewById(R.id.XSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,xObjects);
        XSpinner.setAdapter(adapter);

        commentsET = (EditText)findViewById(R.id.commentsEditText);

        welcomeTV = (TextView)findViewById(R.id.welcomeTextView);
        welcomeTV.setText("Welcome to " + coordinates[0] + ", " + coordinates[1]);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitInformation();
                Snackbar.make(view, "Thanks for submitting!", Snackbar.LENGTH_LONG)
                        .show();
            }
        });
    }

    private void submitInformation() {
        String selectedX = XSpinner.getSelectedItem().toString();
        String comments = commentsET.getText().toString();
        XSingleton.getInstance().addItem(selectedX,comments,coordinates[0],coordinates[1]);


    }

}