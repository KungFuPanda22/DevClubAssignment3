package com.panda.thecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView firstTextView = (TextView) findViewById(R.id.textView);
        Button countButton = (Button) findViewById(R.id.CountButton);
        Button countButton2 = (Button) findViewById(R.id.CountButton2);
        Button resetButton = (Button) findViewById(R.id.ResetButton);
        firstTextView.setText("COUNT = "+Integer.toString(i));
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                firstTextView.setText("COUNT = "+Integer.toString(i));
            }
        });
        countButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                firstTextView.setText("COUNT = "+Integer.toString(i));
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=0;
                firstTextView.setText("COUNT = "+Integer.toString(i));
            }
        });
    }
}
