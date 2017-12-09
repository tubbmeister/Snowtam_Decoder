package com.example.richa_000.snowtamdecoder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    final EditText BoxA = (EditText) findViewById(R.id.BoxA);
        BoxA.setOnFocusChangeListener(new View.OnFocusChangeListener() {

        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                BoxA.setText("", TextView.BufferType.EDITABLE); //clears text on press
            }
        }


    });

        final EditText BoxB = (EditText) findViewById(R.id.BoxB);
        BoxB.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxB.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxC = (EditText) findViewById(R.id.BoxC);
        BoxC.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxC.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxD = (EditText) findViewById(R.id.BoxD);
        BoxD.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxD.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxE = (EditText) findViewById(R.id.BoxE);
        BoxE.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxE.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxF = (EditText) findViewById(R.id.BoxF);
        BoxF.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxF.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxG = (EditText) findViewById(R.id.BoxG);
        BoxG.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxG.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxH = (EditText) findViewById(R.id.BoxH);
        BoxH.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxH.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxJ = (EditText) findViewById(R.id.BoxJ);
        BoxJ.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxJ.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxK = (EditText) findViewById(R.id.BoxK);
        BoxK.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxK.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxL = (EditText) findViewById(R.id.BoxL);
        BoxL.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxL.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxM = (EditText) findViewById(R.id.BoxM);
        BoxM.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxM.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxN = (EditText) findViewById(R.id.BoxN);
        BoxN.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxN.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxP = (EditText) findViewById(R.id.BoxP);
        BoxP.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxP.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxR = (EditText) findViewById(R.id.BoxR);
        BoxR.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxR.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
        final EditText BoxS = (EditText) findViewById(R.id.BoxS);
        BoxS.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    BoxS.setText("", TextView.BufferType.EDITABLE); //clears text on press
                }
            }


        });
}
    public void Decode(View v) {
        EditText BoxA = (EditText) findViewById(R.id.BoxA);
        String BoxAdata = BoxA.getText().toString();
        if (BoxAdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }

            EditText BoxC = (EditText) findViewById(R.id.BoxC);
            String BoxCdata = BoxC.getText().toString();
            if (BoxCdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
                Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                        Toast.LENGTH_SHORT).show();
            }


            EditText BoxB = (EditText) findViewById(R.id.BoxB);
            String BoxBdata = BoxB.getText().toString();
            if (BoxBdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
                Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",

                        Toast.LENGTH_SHORT).show();
                return; //quits method

            }
                Intent intent1 = new Intent(this, Decoded.class);
                intent1.putExtra("messageA", BoxAdata); //"message" sends BoxAdata
                intent1.putExtra("messageB", BoxBdata);
                intent1.putExtra("messageC", BoxCdata);

                this.startActivity(intent1);


            }
        }



