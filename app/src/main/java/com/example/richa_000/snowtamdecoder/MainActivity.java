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
        EditText BoxD = (EditText) findViewById(R.id.BoxD);
        String BoxDdata = BoxD.getText().toString();
        if (BoxDdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxE = (EditText) findViewById(R.id.BoxE);
        String BoxEdata = BoxE.getText().toString();
        if (BoxEdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }

        EditText BoxF = (EditText) findViewById(R.id.BoxF);
        String BoxFdata = BoxF.getText().toString();
        String BoxF1data="0";
        String BoxF2data="0";
        if (BoxFdata.contains("/"))
        {
            String parts[]=BoxFdata.split("/");
            BoxFdata=parts[0];
             BoxF1data=parts[1];
             BoxF2data=parts[2];
        }
        if (BoxFdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxG = (EditText) findViewById(R.id.BoxG);
        String BoxGdata = BoxG.getText().toString();
        String BoxG1data="0";
        String BoxG2data="0";
        if (BoxGdata.contains("/"))
        {
            String parts[]=BoxGdata.split("/");
            BoxGdata=parts[0];
            BoxG1data=parts[1];
            BoxG2data=parts[2];
        }
        if (BoxGdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxH = (EditText) findViewById(R.id.BoxH);
        String BoxHdata = BoxH.getText().toString();
        String BoxH1data="0";
        String BoxH2data="0";
        if (BoxHdata.contains("/"))
        {
            String parts[]=BoxHdata.split("/");
            BoxHdata=parts[0];
            BoxH1data=parts[1];
            BoxH2data=parts[2];
        }
        if (BoxHdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxJ = (EditText) findViewById(R.id.BoxJ);
        String BoxJdata = BoxJ.getText().toString();
        if (BoxJdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxK = (EditText) findViewById(R.id.BoxK);
        String BoxKdata = BoxK.getText().toString();
        if (BoxKdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxL = (EditText) findViewById(R.id.BoxL);
        String BoxLdata = BoxL.getText().toString();
        if (BoxLdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxM = (EditText) findViewById(R.id.BoxM);
        String BoxMdata = BoxM.getText().toString();
        if (BoxMdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxN = (EditText) findViewById(R.id.BoxN);
        String BoxNdata = BoxN.getText().toString();
        if (BoxNdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxP = (EditText) findViewById(R.id.BoxP);
        String BoxPdata = BoxP.getText().toString();
        if (BoxPdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxR = (EditText) findViewById(R.id.BoxR);
        String BoxRdata = BoxR.getText().toString();
        if (BoxRdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
            Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
                    Toast.LENGTH_SHORT).show();
        }
        EditText BoxS = (EditText) findViewById(R.id.BoxS);
        String BoxSdata = BoxS.getText().toString();
        if (BoxSdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
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
                intent1.putExtra("messageD", BoxDdata);
                intent1.putExtra("messageE", BoxEdata);
                intent1.putExtra("messageF1", BoxFdata);
                intent1.putExtra("messageF2", BoxF1data);
                intent1.putExtra("messageF3", BoxF2data);
        intent1.putExtra("messageG", BoxGdata);
        intent1.putExtra("messageG1", BoxG1data);
        intent1.putExtra("messageG2", BoxG2data);
        intent1.putExtra("messageH", BoxHdata);
        intent1.putExtra("messageH1", BoxH1data);
        intent1.putExtra("messageH2", BoxH2data);
        intent1.putExtra("messageJ", BoxJdata);
        intent1.putExtra("messageK", BoxKdata);
        intent1.putExtra("messageL", BoxLdata);
        intent1.putExtra("messageM", BoxMdata);
        intent1.putExtra("messageN", BoxNdata);
        intent1.putExtra("messageP", BoxPdata);
        intent1.putExtra("messageR", BoxRdata);
                intent1.putExtra("messageS", BoxSdata);

                this.startActivity(intent1);


            }
        }



