package com.example.richa_000.snowtamdecoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Decoded extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decoded);

        Bundle bundle = getIntent().getExtras();
        String message1 = bundle.getString("messageA"); //message is what sends message
        String message2 = bundle.getString("messageB"); //message is what sends message
        String message3 = bundle.getString("messageC"); //message is what sends message
        TextView txtView = (TextView) findViewById(R.id.textView);
        message1=message1 +"\n"+message2+"\n"+message3; // adds line between strings
        txtView.setText(message1);
    }


}
