package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mstoryTextView;
    Button mbuttonTop;
    Button mbuttonBottom;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstoryTextView = (TextView) findViewById(R.id.storyTextView);
        mbuttonTop = (Button) findViewById(R.id.buttonTop);
        mbuttonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mstoryTextView.setText(R.string.T3_Story);
                mbuttonTop.setText(R.string.T3_Ans1);
                mbuttonBottom.setText(R.string.T3_Ans2);

                
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mstoryTextView.setText(R.string.T2_Story);
                mbuttonTop.setText(R.string.T2_Ans1);
                mbuttonBottom.setText(R.string.T2_Ans2);


            }
        });
    }
}
