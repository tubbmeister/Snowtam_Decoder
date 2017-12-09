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
        String messageB = bundle.getString("messageB"); //message is what sends message
        String messageC = bundle.getString("messageC"); //message is what sends message
        String messageD = bundle.getString("messageD"); //message is what sends message
        String messageE = bundle.getString("messageE"); //message is what sends message
        String messageF1 = bundle.getString("messageF1"); //message is what sends message
        String messageF2 = bundle.getString("messageF2"); //message is what sends message
        String messageF3 = bundle.getString("messageF3"); //message is what sends message
        String messageG = bundle.getString("messageG"); //message is what sends message
        String messageG1 = bundle.getString("messageG1"); //message is what sends message
        String messageG2 = bundle.getString("messageG2"); //message is what sends message
        String messageH = bundle.getString("messageH"); //message is what sends message
        String messageH1 = bundle.getString("messageH1");
        String messageH2 = bundle.getString("messageH2");
        String messageJ = bundle.getString("messageJ");
        String messageK = bundle.getString("messageK");
        String messageL = bundle.getString("messageL");
        String messageM= bundle.getString("messageM");
        String messageN = bundle.getString("messageN");
        String messageP = bundle.getString("messageP");
        String messageR = bundle.getString("messageR");
        String messageS = bundle.getString("messageS");


        TextView txtView = (TextView) findViewById(R.id.textView);
        message1=message1 +"\n"+messageB+"\n"+messageC+"\n"+messageD+"\n"+messageE+"\n"
                +messageF1+"  "+messageF2+"  "+messageF3+"\n" // adds line between strings
        +messageG+"  "+messageG1+"  "+messageG2+"\n"+messageH+"  "+messageH1+"  "+messageH2+"\n"
                +messageJ+"\n"+messageK+"\n"+messageL+"\n"+messageM+"\n"+messageN+"\n"
                +messageP+"\n"+messageR+"\n"+messageS+"\n";
        txtView.setText(message1);
    }


}
