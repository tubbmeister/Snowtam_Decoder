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
        String messageF1a = bundle.getString("messageF1a"); //message is what sends message
        String messageF1b = bundle.getString("messageF1b");
        String messageF2a = bundle.getString("messageF2a"); //message is what sends message
        String messageF2b = bundle.getString("messageF2b"); //message is what sends message
        String messageF3a = bundle.getString("messageF3a");
        String messageF3b = bundle.getString("messageF3b");
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
        message1=message1 +"\n"+"Date and Time:  "+messageB+"\n"+"Runway:  "+messageC+
                "\n"+"Cleared Runway Length:  "+messageD+"\n"
                +"Cleared Runway Width:  "+messageE+"\n"
                +"Deposits:  "+messageF1a+" "+messageF1b+" / "+
                messageF2a+" "+messageF2b+" / "+messageF3a+" "+messageF3b+"\n" // adds line between strings
        +"Mean Depth (mm):  "+messageG+"  "+messageG1+"  "+messageG2+"\n"
                +"Braking Action:  "+messageH+"  "+messageH1+"  "+messageH2+"\n"
                +"Critical Snowbanks:  "+messageJ+"\n"
                +"Runway Lights Obscured?:  "+messageK+"\n"
                +"Further Clearance Planned:  "+messageL+"\n"
                +"Further Clearance By:  "+messageM+"\n"
                +"Taxiway:  "+messageN+"\n"
                +"Taxiway Snowbanks:  "+messageP+"\n"
                +"Apron:  "+messageR+"\n"
                +"Next Planned Observation:  "+messageS;
        txtView.setText(message1);
    }


}
