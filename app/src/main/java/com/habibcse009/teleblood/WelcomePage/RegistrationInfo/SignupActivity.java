package com.habibcse009.teleblood.WelcomePage.RegistrationInfo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.habibcse009.teleblood.R;
import com.habibcse009.teleblood.WelcomePage.WelcomeActivity;

import es.dmoral.toasty.Toasty;

public class SignupActivity extends AppCompatActivity {
    private ImageView imageView;
    private Animation smalltobig, sinup_btta, sinup_btta2;
    private TextView textView, subtitle_header,buttongotologin,txtregistration;
    private Button button;
    private EditText editText, editText2, editText3, etArea,sbloodgroup;
    
    private RadioGroup radioGroup;
    private RadioButton rbMale;
    private RadioButton rbFemale;
    LinearLayout layout;
    //for double back press to exit
    private static final int TIME_DELAY = 2000;
    private static long back_pressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();
        // load this animation
        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);
        sinup_btta = AnimationUtils.loadAnimation(this, R.anim.btta);
        sinup_btta2 = AnimationUtils.loadAnimation(this, R.anim.btta2);

        imageView = findViewById(R.id.sign_imageView);

        textView = findViewById(R.id.sinup_textView);
        subtitle_header = findViewById(R.id.sinup_subtitle_header);
        txtregistration = findViewById(R.id.sinup_textView2);
        buttongotologin = findViewById(R.id.txtgotologin);

        button = findViewById(R.id.sinup_button);

        editText = findViewById(R.id.sinup_txt_fullname_signup);
        editText2 = findViewById(R.id.sinup_txt_password_signup);
        editText3 = findViewById(R.id.sinup_txt_mobile_signup);
        //editText4 = findViewById(R.id.txt_area_signup);
        radioGroup = findViewById(R.id.sinup_radiogroup);
        rbMale = findViewById(R.id.rb_male);
        rbFemale = findViewById(R.id.rb_female);
        layout = (LinearLayout) findViewById(R.id.sinup_radiogrplayout);

        // sCountry = findViewById(R.id.txt_area_signup);
        etArea = findViewById(R.id.sinup_txt_area_signup);
        sbloodgroup = findViewById(R.id.sinup_txt_bloodgroup_signup);
        Typeface tf = Typeface.createFromAsset(getAssets(), "Milkshake.ttf");
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "Quicksand-Regular.otf");

        //txtTitle.setTypeface(tf);
        txtregistration.setTypeface(tf);
        button.setTypeface(tf1);



        // passing animation and start it
     /*   imageView.startAnimation(smalltobig);

        textView.startAnimation(sinup_btta);
        subtitle_header.startAnimation(sinup_btta);

        button.startAnimation(sinup_btta2);

        editText.startAnimation(sinup_btta2);
        editText2.startAnimation(sinup_btta2);
        editText3.startAnimation(sinup_btta2);
        etArea.startAnimation(sinup_btta2);
        sbloodgroup.startAnimation(sinup_btta2);
        layout.startAnimation(sinup_btta2);
*/

        etArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String[] cityList = {"Dhaka", "Chittagong", "Sylhet", "Rajshahi", "Barishal", "Khulna", "Rangpur", "Mymensingh"};

                AlertDialog.Builder builder = new AlertDialog.Builder(SignupActivity.this, R.style.MyDialogTheme);
                builder.setTitle("SELECT AREA");
                builder.setIcon(R.drawable.ic_location);


                builder.setCancelable(false);
                builder.setItems(cityList, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position) {
                        switch (position) {
                            case 0:

                                etArea.setText("Dhaka");
                                break;

                            case 1:

                                etArea.setText("Chittagong");
                                break;

                            case 2:

                                etArea.setText("Sylhet");
                                break;

                            case 3:

                                etArea.setText("Rajshahi");
                                break;

                            case 4:

                                etArea.setText("Barishal");
                                break;

                            case 5:

                                etArea.setText("Khulna");
                                break;

                            case 6:

                                etArea.setText("Rangpur");
                                break;

                            case 7:

                                etArea.setText("Mymensingh");
                                break;
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int position) {
                        dialog.dismiss();
                    }
                });


                AlertDialog locationTypeDialog = builder.create();

                locationTypeDialog.show();
            }

        });
        // blood group
        sbloodgroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String[] bloodList = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};

                AlertDialog.Builder builder = new AlertDialog.Builder(SignupActivity.this, R.style.MyDialogTheme);
                builder.setTitle("SELECT BLOOD GROUP");
                builder.setIcon(R.drawable.ic_blood);


                builder.setCancelable(false);
                builder.setItems(bloodList, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position) {
                        switch (position) {
                            case 0:

                                sbloodgroup.setText("A+");
                                break;

                            case 1:

                                sbloodgroup.setText("A-");
                                break;

                            case 2:

                                sbloodgroup.setText("B+");
                                break;

                            case 3:

                                sbloodgroup.setText("B-");
                                break;

                            case 4:

                                sbloodgroup.setText("AB+");
                                break;

                            case 5:

                                sbloodgroup.setText("AB-");
                                break;

                            case 6:

                                sbloodgroup.setText("O+");
                                break;

                            case 7:

                                sbloodgroup.setText("O-");
                                break;
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int position) {
                        dialog.dismiss();
                    }
                });


                AlertDialog locationTypeDialog = builder.create();

                locationTypeDialog.show();
            }

        });

        buttongotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    /*public void onBackPressed() {
        if (back_pressed + TIME_DELAY > System.currentTimeMillis()) {
            super.onBackPressed();

            finishAffinity();

        } else {
            Toasty.warning(this, "Press once again to exit!",
                    Toast.LENGTH_SHORT).show();

        }
        back_pressed = System.currentTimeMillis();
    }*/
}

