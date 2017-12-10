package com.example.richa_000.snowtamdecoder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String SecondF,SecondF2="",SecondF3="";
    private int length;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    final

    EditText BoxA = (EditText) findViewById(R.id.BoxA);
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
        //if (BoxAdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
        //  Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
        //          Toast.LENGTH_SHORT).show();
        // }

        EditText BoxC = (EditText) findViewById(R.id.BoxC);
        String BoxCdata = BoxC.getText().toString();
        //if (BoxCdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
        //   Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
        //           Toast.LENGTH_SHORT).show();
        // }
        EditText BoxD = (EditText) findViewById(R.id.BoxD);
        String BoxDdata = BoxD.getText().toString();
        // if (BoxDdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
        //    Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
        //            Toast.LENGTH_SHORT).show();
        // }
        EditText BoxE = (EditText) findViewById(R.id.BoxE);
        String BoxEdata = BoxE.getText().toString();
        // if (BoxEdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
        //    Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
        //            Toast.LENGTH_SHORT).show();
        //}

        EditText BoxF = (EditText) findViewById(R.id.BoxF);
        String BoxFdata = BoxF.getText().toString();
        String BoxF1data = "";
        String BoxF2data = "";
        String a_char;

        if (BoxFdata.contains("/")) {// check if more than one segment
            String parts[] = BoxFdata.split("/");// checks for break in string
            BoxFdata = parts[0];
            BoxF1data = parts[1];
            BoxF2data = parts[2];
            String BoxFcode = BoxFdata;
            length = BoxFdata.length();
            // if (length<2) {
            a_char = Character.toString(BoxFdata.charAt(0));
            if (a_char.equals("Nil")) {
                BoxFdata = "Clear and Dry";
            } else if (a_char.equals("1")) {
                BoxFdata = "Damp";
            } else if (a_char.equals("2")) {
                BoxFdata = "Wet or water patches";
            } else if (a_char.equals("3")) {
                BoxFdata = "Rime or Frost < 1mm";
            } else if (a_char.equals("4")) {
                BoxFdata = "Dry Snow";
            } else if (a_char.equals("5")) {
                BoxFdata = "Wet Snow";
            } else if (a_char.equals("6")) {
                BoxFdata = "Slush";
            } else if (a_char.equals("7")) {
                BoxFdata = "Ice";
            } else if (a_char.equals("8")) {
                BoxFdata = "Compacted or Rolled Snow";
            } else if (a_char.equals("9")) {
                BoxFdata = "Frozen Ruts or Ridges";
            }
            //}
            if (length > 1) {

                String a_char1 = Character.toString(BoxFcode.charAt(1));


                if (a_char1.equals("7")) { //compare string
                    SecondF = "Ice";

                } else if (a_char1.equals("8")) {
                    SecondF = "Compacted Snow";
                } else if (a_char1.equals("9")) {
                    SecondF = "Frozen Ruts";
                }
            }


            String BoxF1code = BoxF1data;
            length = BoxF1data.length();
            // if (length<2) {
            a_char = Character.toString(BoxF1data.charAt(0));
            if (a_char.equals("Nil")) {
                BoxF1data = "Clear and Dry";
            } else if (a_char.equals("1")) {
                BoxF1data = "Damp";
            } else if (a_char.equals("2")) {
                BoxF1data = "Wet or water patches";
            } else if (a_char.equals("3")) {
                BoxF1data = "Rime or Frost < 1mm";
            } else if (a_char.equals("4")) {
                BoxF1data = "Dry Snow";
            } else if (a_char.equals("5")) {
                BoxF1data = "Wet Snow";
            } else if (a_char.equals("6")) {
                BoxF1data = "Slush";
            } else if (a_char.equals("7")) {
                BoxF1data = "Ice";
            } else if (a_char.equals("8")) {
                BoxF1data = "Compacted or Rolled Snow";
            } else if (a_char.equals("9")) {
                BoxF1data = "Frozen Ruts or Ridges";
            }
            //}
            if (length > 1) {

                String a_char1 = Character.toString(BoxF1code.charAt(1));


                if (a_char1.equals("7")) { //compare string
                    SecondF2 = "Ice";

                } else if (a_char1.equals("8")) {
                    SecondF2 = "Compacted Snow";
                } else if (a_char1.equals("9")) {
                    SecondF2 = "Frozen Ruts";
                }
            }


            String BoxF2code = BoxF2data;
            length = BoxF2data.length();
            // if (length<2) {
            a_char = Character.toString(BoxF2data.charAt(0));
            if (a_char.equals("Nil")) {
                BoxF2data = "Clear and Dry";
            } else if (a_char.equals("1")) {
                BoxF2data = "Damp";
            } else if (a_char.equals("2")) {
                BoxF2data = "Wet or water patches";
            } else if (a_char.equals("3")) {
                BoxF2data = "Rime or Frost < 1mm";
            } else if (a_char.equals("4")) {
                BoxF2data = "Dry Snow";
            } else if (a_char.equals("5")) {
                BoxF2data = "Wet Snow";
            } else if (a_char.equals("6")) {
                BoxF2data = "Slush";
            } else if (a_char.equals("7")) {
                BoxF2data = "Ice";
            } else if (a_char.equals("8")) {
                BoxF2data = "Compacted or Rolled Snow";
            } else if (a_char.equals("9")) {
                BoxF2data = "Frozen Ruts or Ridges";
            }
            //}
            if (length > 1) {

                String a_char1 = Character.toString(BoxF2code.charAt(1));


                if (a_char1.equals("7")) { //compare string
                    SecondF3 = "Ice";

                } else if (a_char1.equals("8")) {
                    SecondF3 = "Compacted Snow";
                } else if (a_char1.equals("9")) {
                    SecondF3 = "Frozen Ruts";
                }
            }
        } else {
            String BoxFcode = BoxFdata;

            length = BoxFdata.length();
            // if (length<2) {
            a_char = Character.toString(BoxFdata.charAt(0));
            if (a_char.equals("Nil")) {
                BoxFdata = "Clear and Dry";
            } else if (a_char.equals("1")) {
                BoxFdata = "Damp";
            } else if (a_char.equals("2")) {
                BoxFdata = "Wet or water patches";
            } else if (a_char.equals("3")) {
                BoxFdata = "Rime or Frost < 1mm";
            } else if (a_char.equals("4")) {
                BoxFdata = "Dry Snow";
            } else if (a_char.equals("5")) {
                BoxFdata = "Wet Snow";
            } else if (a_char.equals("6")) {
                BoxFdata = "Slush";
            } else if (a_char.equals("7")) {
                BoxFdata = "Ice";
            } else if (a_char.equals("8")) {
                BoxFdata = "Compacted or Rolled Snow";
            } else if (a_char.equals("9")) {
                BoxFdata = "Frozen Ruts or Ridges";
            }
            //}
            if (length > 1) {

                String a_char1 = Character.toString(BoxFcode.charAt(1));


                if (a_char1.equals("7")) { //compare string
                    SecondF = "Ice";

                } else if (a_char1.equals("8")) {
                    SecondF = "Compacted Snow";
                } else if (a_char1.equals("9")) {
                    SecondF = "Frozen Ruts";
                }
            }
        }
        //if (BoxFdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
        //    Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
        //            Toast.LENGTH_SHORT).show();
        //}
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
        //if (BoxGdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
         //   Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
         //           Toast.LENGTH_SHORT).show();
       // }
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
       // if (BoxHdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
         //   Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
         //           Toast.LENGTH_SHORT).show();
       //}
        EditText BoxJ = (EditText) findViewById(R.id.BoxJ);
        String BoxJdata = BoxJ.getText().toString();
        //if (BoxJdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
         //   Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
          //          Toast.LENGTH_SHORT).show();
        //}
        EditText BoxK = (EditText) findViewById(R.id.BoxK);
        String BoxKdata = BoxK.getText().toString();
       // if (BoxKdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
         //   Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
          //          Toast.LENGTH_SHORT).show();
        //}
        EditText BoxL = (EditText) findViewById(R.id.BoxL);
        String BoxLdata = BoxL.getText().toString();
       // if (BoxLdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
          //  Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
          //          Toast.LENGTH_SHORT).show();
       // }
        EditText BoxM = (EditText) findViewById(R.id.BoxM);
        String BoxMdata = BoxM.getText().toString();
        //if (BoxMdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
          //  Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
          //          Toast.LENGTH_SHORT).show();
        //}
        EditText BoxN = (EditText) findViewById(R.id.BoxN);
        String BoxNdata = BoxN.getText().toString();
        //if (BoxNdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
          //  Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
          //          Toast.LENGTH_SHORT).show();
        //}
        EditText BoxP = (EditText) findViewById(R.id.BoxP);
        String BoxPdata = BoxP.getText().toString();
        //if (BoxPdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
           // Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
           //         Toast.LENGTH_SHORT).show();
       // }
        EditText BoxR = (EditText) findViewById(R.id.BoxR);
        String BoxRdata = BoxR.getText().toString();
        //if (BoxRdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
          //  Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
          //          Toast.LENGTH_SHORT).show();
        //}
        EditText BoxS = (EditText) findViewById(R.id.BoxS);
        String BoxSdata = BoxS.getText().toString();
       // if (BoxSdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
           // Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",
             //       Toast.LENGTH_SHORT).show();
        //}

            EditText BoxB = (EditText) findViewById(R.id.BoxB);
            String BoxBdata = BoxB.getText().toString();
           // if (BoxBdata.trim().equals("")) { //shows "Enter data" if nothing in first editText box
              //  Toast.makeText(getApplicationContext(), "Ensure all data boxes filled!!",

              //          Toast.LENGTH_SHORT).show();
               // return; //quits method

                Intent intent1 = new Intent(this, Decoded.class);
                intent1.putExtra("messageA", BoxAdata); //"message" sends BoxAdata
                intent1.putExtra("messageB", BoxBdata);
                intent1.putExtra("messageC", BoxCdata);
                intent1.putExtra("messageD", BoxDdata);
                intent1.putExtra("messageE", BoxEdata);
                intent1.putExtra("messageF1a", BoxFdata);
                intent1.putExtra("messageF1b", SecondF);
                intent1.putExtra("messageF2a", BoxF1data);
                intent1.putExtra("messageF2b", SecondF2);
                intent1.putExtra("messageF3a", BoxF2data);
                 intent1.putExtra("messageF3b", SecondF3);
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


            }}




